package com.abybijo.agent0.nav

import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.abybijo.agent0.AppViewModel
import com.abybijo.agent0.Progress
import com.abybijo.agent0.feature.about.AboutDeveloperScreen
import com.abybijo.agent0.feature.about.AboutScreen
import com.abybijo.agent0.feature.about.SettingsScreen
import com.abybijo.agent0.feature.profile.ProfileScreen
import com.abybijo.agent0.feature.profile.TourOverlay
import com.abybijo.agent0.feature.profile.TourSteps
import com.abybijo.agent0.feature.chapters.BriefHubScreen
import com.abybijo.agent0.feature.chapters.BriefScreen
import com.abybijo.agent0.feature.chapters.ChapterHubScreen
import com.abybijo.agent0.feature.certificate.CertificateScreen
import com.abybijo.agent0.feature.drills.FinalExamScreen
import com.abybijo.agent0.feature.chapters.ChapterDetailScreen
import com.abybijo.agent0.feature.chapters.ChaptersScreen
import com.abybijo.agent0.feature.drills.ChecklistScreen
import com.abybijo.agent0.feature.drills.DiagnosticScreen
import com.abybijo.agent0.feature.drills.DrillsScreen
import com.abybijo.agent0.feature.drills.PasswordLabScreen
import com.abybijo.agent0.feature.drills.QuizScreen
import com.abybijo.agent0.feature.drills.RiskScreen
import com.abybijo.agent0.feature.drills.ScenarioListScreen
import com.abybijo.agent0.feature.drills.ScenarioScreen
import com.abybijo.agent0.feature.home.HomeScreen
import com.abybijo.agent0.feature.home.SearchScreen
import com.abybijo.agent0.feature.intel.CaseDetailScreen
import com.abybijo.agent0.feature.intel.CasesScreen
import com.abybijo.agent0.feature.intel.IntelScreen
import com.abybijo.agent0.feature.intel.ResourcesScreen
import com.abybijo.agent0.feature.onboarding.BootScreen
import com.abybijo.agent0.feature.onboarding.NamePromptScreen
import com.abybijo.agent0.feature.onboarding.OnboardingScreen
import com.abybijo.agent0.ui.components.crtScanlines
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

private const val SLIDE = 40

/**
 * v2.0.1 navigation rules — the fix for the back-stack bugs:
 * - Opening a brief always flattens the stack to [home, brief]. No
 *   chain of earlier briefs and hubs can accumulate underneath it.
 * - Going back from a brief or a hub always lands on that brief's
 *   chapter page, via a fresh chapter destination over a flat stack.
 * - Tour steps move the same flat way, so finishing or skipping the
 *   tour leaves exactly [home] behind — system back then exits the
 *   app instead of replaying the tour in reverse.
 */
private fun NavHostController.openBrief(chapterId: String, briefId: String) {
    navigate(Route.brief(chapterId, briefId)) {
        popUpTo(Route.HOME) { saveState = true }
        launchSingleTop = true
    }
}

private fun NavHostController.backToChapter(chapterId: String) {
    navigate(Route.chapterDetail(chapterId)) {
        popUpTo(Route.HOME) { saveState = true }
        launchSingleTop = true
    }
}

private fun NavHostController.moveTourTo(route: String) {
    navigate(route) {
        popUpTo(Route.HOME) { saveState = true }
        launchSingleTop = true
    }
}

@Composable
fun Agent0App(viewModel: AppViewModel, progress: Progress) {
    var booted by remember { mutableStateOf(false) }

    if (!booted) {
        BootScreen(reduceMotion = progress.reduceMotion) { booted = true }
        return
    }
    if (!progress.onboarded) {
        OnboardingScreen(onComplete = { name -> viewModel.completeOnboarding(name) })
        return
    }
    // Recruits who onboarded before v1.0.1 have no stored name yet.
    // Ask once; skipping is allowed and the name can be set in Settings.
    var namePromptDone by remember { mutableStateOf(false) }
    if (progress.userName.isBlank() && !namePromptDone) {
        NamePromptScreen(
            onContinue = { name ->
                viewModel.setUserName(name)
                namePromptDone = true
            },
            onSkip = { namePromptDone = true }
        )
        return
    }
    MainScaffold(viewModel = viewModel, progress = progress)
}

@Composable
private fun MainScaffold(viewModel: AppViewModel, progress: Progress) {
    val nav = rememberNavController()
    val backStack by nav.currentBackStackEntryAsState()
    val currentRoute = backStack?.destination?.route

    val showBar = currentRoute in Tab.entries.map { it.route }

    // v2.0 tour overlay state: -1 = not touring. Starts automatically
    // once after onboarding (tourCompleted false); Skip/Finish record
    // completion so it never reappears uninvited.
    var tourStep by remember { mutableIntStateOf(if (progress.tourCompleted) -1 else 0) }
    // Explicit Unit: setTourCompleted returns a Job (viewModelScope.launch),
    // and passing a () -> Job where () -> Unit is expected fails compilation.
    // v2.0.1: closing the tour also flattens the stack to exactly [home],
    // so back can never walk back through the tour pages.
    val closeTour: () -> Unit = {
        tourStep = -1
        viewModel.setTourCompleted(true)
        nav.navigate(Route.HOME) { popUpTo(Route.HOME) { inclusive = true } }
        Unit
    }
    val startTour = {
        tourStep = 0
        nav.moveTourTo(TourSteps.all[0].route)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink.Black)
            .then(if (progress.scanlines) Modifier.crtScanlines() else Modifier)
    ) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.weight(1f)) {
                Agent0NavHost(
                    nav = nav,
                    viewModel = viewModel,
                    progress = progress,
                    onStartTour = startTour
                )
                if (tourStep >= 0) {
                    // v2.0.1: system back during the tour follows the
                    // overlay's Back button — previous step, or close
                    // on the first step — instead of popping the nav
                    // stack out from under the overlay.
                    BackHandler {
                        if (tourStep > 0) {
                            tourStep--
                            nav.moveTourTo(TourSteps.all[tourStep].route)
                        } else {
                            closeTour()
                        }
                    }
                    TourOverlay(
                        stepIndex = tourStep,
                        onBack = {
                            tourStep--
                            nav.moveTourTo(TourSteps.all[tourStep].route)
                        },
                        onNext = {
                            tourStep++
                            nav.moveTourTo(TourSteps.all[tourStep].route)
                        },
                        onSkip = closeTour,
                        onFinish = closeTour,
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .padding(12.dp)
                    )
                }
            }
            if (showBar) {
                Box(Modifier.navigationBarsPadding()) {
                    TerminalBottomBar(
                        current = currentRoute,
                        onSelect = { tab ->
                            nav.navigate(tab.route) {
                                popUpTo(Route.HOME) { saveState = true }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun Agent0NavHost(
    nav: NavHostController,
    viewModel: AppViewModel,
    progress: Progress,
    onStartTour: () -> Unit
) {
    val reduce = progress.reduceMotion

    NavHost(
        navController = nav,
        startDestination = Route.HOME,
        enterTransition = {
            if (reduce) fadeIn(tween(Motion.Fast))
            else slideInHorizontally(
                tween(Motion.Normal, easing = Motion.Decode),
                initialOffsetX = { it / SLIDE }
            ) + fadeIn(tween(Motion.Normal))
        },
        exitTransition = {
            if (reduce) fadeOut(tween(Motion.Fast))
            else fadeOut(tween(Motion.Fast)) +
                slideOutHorizontally(tween(Motion.Fast)) { -it / (SLIDE * 2) }
        },
        popEnterTransition = {
            if (reduce) fadeIn(tween(Motion.Fast))
            else slideInHorizontally(
                tween(Motion.Normal, easing = Motion.Decode),
                initialOffsetX = { -it / SLIDE }
            ) + fadeIn(tween(Motion.Normal))
        },
        popExitTransition = {
            if (reduce) fadeOut(tween(Motion.Fast))
            else fadeOut(tween(Motion.Fast)) +
                slideOutHorizontally(tween(Motion.Fast)) { it / (SLIDE * 2) }
        }
    ) {
        composable(Route.HOME) {
            HomeScreen(
                progress = progress,
                onOpenBrief = { c, b -> nav.openBrief(c, b) },
                onNavigate = { nav.navigate(it) }
            )
        }
        composable(Route.CHAPTERS) {
            ChaptersScreen(
                progress = progress,
                onOpenChapter = { nav.navigate(Route.chapterDetail(it)) },
                onSearch = { nav.navigate(Route.SEARCH) }
            )
        }
        composable(Route.DRILLS) {
            DrillsScreen(progress = progress, onNavigate = { nav.navigate(it) })
        }
        composable(Route.INTEL) {
            IntelScreen(onNavigate = { nav.navigate(it) })
        }
        composable(Route.ABOUT) {
            AboutScreen(onNavigate = { nav.navigate(it) })
        }
        composable(Route.PROFILE) {
            ProfileScreen(
                progress = progress,
                onNavigate = { nav.navigate(it) },
                onOpenBrief = { c, b -> nav.openBrief(c, b) },
                onToggleBookmark = { viewModel.toggleBookmark(it) },
                onUserName = { viewModel.setUserName(it) },
                onUserAge = { viewModel.setUserAge(it) },
                onAvatarId = { viewModel.setAvatarId(it) },
                onDeleteNote = { viewModel.deleteNote(it) },
                onStartTour = onStartTour,
                onTakeFinalExam = { nav.navigate(Route.FINAL_EXAM) },
                onOpenCertificate = { nav.navigate(Route.CERTIFICATE) }
            )
        }

        composable(Route.CERTIFICATE) {
            CertificateScreen(
                userName = progress.userName,
                finalExamDate = progress.finalExamDate,
                onBack = { nav.popBackStack() }
            )
        }

        composable(Route.FINAL_EXAM) {
            FinalExamScreen(
                onBack = { nav.popBackStack() },
                onExamPassed = { viewModel.setFinalExamPassed(it) },
                onOpenProfile = { nav.navigate(Route.PROFILE) }
            )
        }
        composable(Route.ABOUT_DEVELOPER) {
            AboutDeveloperScreen(onBack = { nav.popBackStack() })
        }

        composable(
            Route.CHAPTER_DETAIL,
            arguments = listOf(navArgument("chapterId") { type = NavType.StringType })
        ) { entry ->
            ChapterDetailScreen(
                chapterId = entry.arguments?.getString("chapterId").orEmpty(),
                progress = progress,
                onBack = { nav.popBackStack() },
                onOpenBrief = { c, b -> nav.openBrief(c, b) },
                onOpenChapterHub = { nav.navigate(Route.chapterHub(it)) }
            )
        }

        composable(
            Route.CHAPTER_HUB,
            arguments = listOf(navArgument("chapterId") { type = NavType.StringType })
        ) { entry ->
            val hubChapterId = entry.arguments?.getString("chapterId").orEmpty()
            ChapterHubScreen(
                chapterId = hubChapterId,
                progress = progress,
                onBack = { nav.backToChapter(hubChapterId) },
                onOpenBrief = { c, b -> nav.openBrief(c, b) },
                onOpenProfile = { nav.navigate(Route.PROFILE) }
            )
        }

        composable(
            Route.BRIEF,
            arguments = listOf(
                navArgument("chapterId") { type = NavType.StringType },
                navArgument("briefId") { type = NavType.StringType }
            )
        ) { entry ->
            val briefChapterId = entry.arguments?.getString("chapterId").orEmpty()
            BriefScreen(
                chapterId = briefChapterId,
                briefId = entry.arguments?.getString("briefId").orEmpty(),
                progress = progress,
                onBack = { nav.backToChapter(briefChapterId) },
                onToggleComplete = { viewModel.toggleBrief(it) },
                onBookmark = { viewModel.toggleBookmark(it) },
                onOpenBrief = { c, b -> nav.openBrief(c, b) },
                onOpenHub = { c, b -> nav.navigate(Route.hub(c, b)) },
                onSaveNote = { k, t -> viewModel.setNote(k, t) },
                onDeleteNote = { viewModel.deleteNote(it) }
            )
        }

        composable(
            Route.HUB,
            arguments = listOf(
                navArgument("chapterId") { type = NavType.StringType },
                navArgument("briefId") { type = NavType.StringType }
            )
        ) { entry ->
            val hubChapterId = entry.arguments?.getString("chapterId").orEmpty()
            BriefHubScreen(
                chapterId = hubChapterId,
                briefId = entry.arguments?.getString("briefId").orEmpty(),
                progress = progress,
                onBack = { nav.backToChapter(hubChapterId) },
                onOpenBrief = { c, b -> nav.openBrief(c, b) },
                onOpenScenario = { nav.navigate(Route.scenario(it)) },
                onOpenCase = { nav.navigate(Route.caseDetail(it)) },
                onOpenResources = { nav.navigate(Route.RESOURCES) },
                onOpenProfile = { nav.navigate(Route.PROFILE) },
                onOpenChapterHub = { nav.navigate(Route.chapterHub(it)) }
            )
        }

        composable(Route.QUIZ) {
            QuizScreen(
                progress = progress,
                onBack = { nav.popBackStack() },
                onRecord = { viewModel.recordQuiz(it) }
            )
        }
        composable(Route.SCENARIO_LIST) {
            ScenarioListScreen(
                progress = progress,
                onBack = { nav.popBackStack() },
                onOpen = { nav.navigate(Route.scenario(it)) }
            )
        }
        composable(
            Route.SCENARIO,
            arguments = listOf(navArgument("scenarioId") { type = NavType.StringType })
        ) { entry ->
            ScenarioScreen(
                scenarioId = entry.arguments?.getString("scenarioId").orEmpty(),
                onBack = { nav.popBackStack() },
                onComplete = { viewModel.markScenario(it) }
            )
        }
        composable(Route.CHECKLISTS) {
            ChecklistScreen(
                progress = progress,
                onBack = { nav.popBackStack() },
                onToggle = { viewModel.toggleCheck(it) },
                onReset = { viewModel.resetChecklist(it) }
            )
        }
        composable(Route.DIAGNOSTIC) {
            DiagnosticScreen(
                progress = progress,
                onBack = { nav.popBackStack() },
                onRecord = { viewModel.recordDiagnostic(it) }
            )
        }
        composable(Route.RISK) {
            RiskScreen(onBack = { nav.popBackStack() })
        }
        composable(Route.PASSWORD_LAB) {
            PasswordLabScreen(onBack = { nav.popBackStack() })
        }

        composable(Route.CASES) {
            CasesScreen(
                onBack = { nav.popBackStack() },
                onOpen = { nav.navigate(Route.caseDetail(it)) }
            )
        }
        composable(
            Route.CASE_DETAIL,
            arguments = listOf(navArgument("caseId") { type = NavType.StringType })
        ) { entry ->
            CaseDetailScreen(
                caseId = entry.arguments?.getString("caseId").orEmpty(),
                onBack = { nav.popBackStack() }
            )
        }
        composable(Route.RESOURCES) {
            ResourcesScreen(onBack = { nav.popBackStack() })
        }
        composable(Route.SEARCH) {
            SearchScreen(
                onBack = { nav.popBackStack() },
                onOpenBrief = { c, b -> nav.openBrief(c, b) }
            )
        }
        composable(Route.SETTINGS) {
            SettingsScreen(
                progress = progress,
                onBack = { nav.popBackStack() },
                onReduceMotion = { viewModel.setReduceMotion(it) },
                onScanlines = { viewModel.setScanlines(it) },
                onUserName = { viewModel.setUserName(it) },
                onUserAge = { viewModel.setUserAge(it) },
                onAbout = { nav.navigate(Route.ABOUT) },
                onAboutDeveloper = { nav.navigate(Route.ABOUT_DEVELOPER) },
                onTour = onStartTour,
                onWipe = { viewModel.wipe() }
            )
        }
    }
}
