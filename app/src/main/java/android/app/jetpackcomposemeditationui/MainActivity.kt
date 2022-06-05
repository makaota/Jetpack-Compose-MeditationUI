package android.app.jetpackcomposemeditationui

import android.app.jetpackcomposemeditationui.ui.theme.HomeScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.app.jetpackcomposemeditationui.ui.theme.JetpackComposeMeditationUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeMeditationUITheme {

                HomeScreen()
            }
        }
    }
}

