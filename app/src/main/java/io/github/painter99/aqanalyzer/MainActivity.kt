package io.github.painter99.aqanalyzer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Forced dark theme (design system: #0F0F0F bg, #4ECCA3 accent)
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xFF0F0F0F)),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "AQ Analyzer — M1.1 skeleton",
                    color = Color(0xFF4ECCA3),
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}
