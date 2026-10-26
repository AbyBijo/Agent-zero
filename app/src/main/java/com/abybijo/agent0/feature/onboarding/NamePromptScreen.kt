package com.abybijo.agent0.feature.onboarding

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.abybijo.agent0.ui.components.Agent0Logo
import com.abybijo.agent0.ui.components.Eyebrow
import com.abybijo.agent0.ui.components.GhostButton
import com.abybijo.agent0.ui.components.PrimaryButton
import com.abybijo.agent0.ui.theme.Ink

/**
 * One-time prompt for recruits who finished onboarding before v1.0.1,
 * when the program did not ask for a name. New recruits are asked on
 * the last onboarding page instead, so this screen only appears when
 * the stored name is blank. Skipping is allowed; the name can be set
 * later in Settings.
 */
@Composable
fun NamePromptScreen(
    onContinue: (String) -> Unit,
    onSkip: () -> Unit
) {
    var name by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Ink.Black)
            .systemBarsPadding()
            .padding(horizontal = 22.dp, vertical = 18.dp)
    ) {
        Agent0Logo(size = 48.dp, spin = false)
        Spacer(Modifier.height(28.dp))
        Eyebrow("Agent-0 \u00B7 v1.0.1")
        Spacer(Modifier.height(12.dp))
        Text(
            "What should we call you?",
            style = MaterialTheme.typography.headlineMedium,
            color = Ink.White
        )
        Spacer(Modifier.height(14.dp))
        Text(
            "Your name stays on this device and appears on the home " +
                "screen. Nothing is sent anywhere — this app has no " +
                "network permission.",
            style = MaterialTheme.typography.bodyMedium,
            color = Ink.Mid
        )
        Spacer(Modifier.height(24.dp))
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            singleLine = true,
            placeholder = {
                Text(
                    "Your name",
                    style = MaterialTheme.typography.bodyMedium,
                    color = Ink.Dim
                )
            },
            textStyle = MaterialTheme.typography.bodyMedium.copy(color = Ink.White),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.Transparent,
                unfocusedContainerColor = Color.Transparent,
                focusedIndicatorColor = Ink.White,
                unfocusedIndicatorColor = Ink.Rule,
                cursorColor = Ink.White
            ),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.weight(1f))
        PrimaryButton(
            text = "Continue",
            leading = "\u25B6",
            enabled = name.isNotBlank(),
            modifier = Modifier.fillMaxWidth(),
            onClick = { onContinue(name) }
        )
        Spacer(Modifier.height(10.dp))
        Row {
            GhostButton(text = "Skip for now", onClick = onSkip)
        }
        Spacer(Modifier.height(6.dp))
    }
}
