package com.upchiapas.kahu.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val Terracotta = Color(0xFFB45F43)
private val Cream = Color(0xFFFAF3E8)
private val Sand = Color(0xFFEFE5D8)
private val DarkText = Color(0xFF2B211D)

private val KahuColorScheme = lightColorScheme(
    primary = Terracotta,
    onPrimary = Color.White,
    secondary = Terracotta,
    background = Cream,
    onBackground = DarkText,
    surface = Cream,
    onSurface = DarkText,
    surfaceVariant = Sand
)

@Composable
fun KahuTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = KahuColorScheme,
        typography = Typography,
        content = content
    )
}
