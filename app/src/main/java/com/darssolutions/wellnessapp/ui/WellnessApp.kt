package com.darssolutions.wellnessapp.ui

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.darssolutions.wellnessapp.ui.screen.WellnessScreen

@Composable
fun WellnessApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        WellnessScreen()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
fun WellnessAppPreview() {
    WellnessApp()
}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "Dark Mode",
    uiMode = UI_MODE_NIGHT_YES
)
@Composable
private fun WellnessAppPreviewDark() {
    WellnessApp()
}
