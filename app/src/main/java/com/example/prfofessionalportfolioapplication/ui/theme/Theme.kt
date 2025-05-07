package com.example.prfofessionalportfolioapplication.ui.theme

import android.app.Activity
import android.graphics.Color
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = SkyBlue,
    secondary = Aqua,
    background = JetBlack,
    surface = DarkSurface,
    onPrimary = PureWhite,
    onSecondary = RichBlack,
    onBackground = PureWhite,
    onSurface = SoftGray
)

private val LightColorScheme = lightColorScheme(
    primary = SapphireBlue,
    secondary = MintGreen,
    background = SoftWhite,
    surface = PureWhite,
    onPrimary = PureWhite,
    onSecondary = RichBlack,
    onBackground = RichBlack,
    onSurface = MediumGray
)

@Composable
fun PrfofessionalPortfolioApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme  = if(darkTheme) DarkColorScheme else LightColorScheme


    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}