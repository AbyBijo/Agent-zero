package com.abybijo.agent0

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.activity.ComponentActivity
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.abybijo.agent0.nav.Agent0App
import com.abybijo.agent0.ui.theme.Agent0Theme

class MainActivity : ComponentActivity() {

    private val viewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        installSplashScreen()
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            Agent0Theme {
                val progress by viewModel.progress.collectAsState()
                Agent0App(viewModel = viewModel, progress = progress)
            }
        }
    }
}
