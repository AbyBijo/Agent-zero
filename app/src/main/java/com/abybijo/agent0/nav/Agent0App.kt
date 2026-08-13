package com.abybijo.agent0.nav

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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.navigation.NavType
import com.abybijo.agent0.AppViewModel
import com.abybijo.agent0.Progress
import com.abybijo.agent0.feature.about.AboutScreen
import com.abybijo.agent0.feature.about.SettingsScreen
import com.abybijo.agent0.feature.chapters.BriefScreen
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
import com.abybijo.agent0.feature.onboarding.OnboardingScreen
import com.abybijo.agent0.ui.components.crtScanlines
import com.abybijo.agent0.ui.theme.Ink
import com.abybijo.agent0.ui.theme.Motion

private const val SLIDE = 40

@Composable
fun Agent0App(viewModel: AppViewModel, progress: Progress) {
    var booted by remember { mutableStateOf(false) }

    if (!booted) {
        BootScreen(reduceMotion = progress.reduceMotion) { booted = true }
        return
    }
    if (!progress.onboarded) {
        OnboardingScreen(onComplete = { viewModel.completeOnboarding() })
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

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink.Black)
            .then(if (progress.scanlines) Modifier.crtScanlines() else Modifier)
    ) {
        Column(Modifier.fillMaxSize()) {
            Box(Modifier.weight(1f)) {
                Agent0NavHost(nav = nav, viewModel = viewModel, progress = progress)
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
    progress: Progress
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
                onOpenBrief = { c, b -> nav.navigate(Route.brief(c, b)) },
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

        composable(
            Route.CHAPTER_DETAIL,
            arguments = listOf(navArgument("chapterId") { type = NavType.StringType })
        ) { entry ->
            ChapterDetailScreen(
                chapterId = entry.arguments?.getString("chapterId").orEmpty(),
                progress = progress,
                onBack = { nav.popBackStack() },
                onOpenBrief = { c, b -> nav.navigate(Route.brief(c, b)) }
            )
        }

        composable(
            Route.BRIEF,
            arguments = listOf(
                navArgument("chapterId") { type = NavType.StringType },
                navArgument("briefId") { type = NavType.StringType }
            )
        ) { entry ->
            BriefScreen(
                chapterId = entry.arguments?.getString("chapterId").orEmpty(),
                briefId = entry.arguments?.getString("briefId").orEmpty(),
                progress = progress,
                onBack = { nav.popBackStack() },
                onToggleComplete = { viewModel.toggleBrief(it) },
                onBookmark = { viewModel.toggleBookmark(it) },
                onOpenBrief = { c, b ->
                    nav.navigate(Route.brief(c, b)) { popUpTo(Route.BRIEF) { inclusive = true } }
                }
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
                onOpenBrief = { c, b -> nav.navigate(Route.brief(c, b)) }
            )
        }
        composable(Route.SETTINGS) {
            SettingsScreen(
                progress = progress,
                onBack = { nav.popBackStack() },
                onReduceMotion = { viewModel.setReduceMotion(it) },
                onScanlines = { viewModel.setScanlines(it) },
                onWipe = { viewModel.wipe() }
            )
        }
    }
}
