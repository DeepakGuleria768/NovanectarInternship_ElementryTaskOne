package com.example.prfofessionalportfolioapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.prfofessionalportfolioapplication.Navigation.MyappNavGraph
import com.example.prfofessionalportfolioapplication.Screens.HomeScreen
import com.example.prfofessionalportfolioapplication.ui.theme.PrfofessionalPortfolioApplicationTheme
import com.example.prfofessionalportfolioapplication.ui.theme.darkBlack

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // here we use this function to add the splash screen
        installSplashScreen()
        setContent {
            PrfofessionalPortfolioApplicationTheme {

                    Column(
                        modifier = Modifier.fillMaxSize()
                            .background(color = darkBlack),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        MyappNavGraph()
                    }

            }
        }
    }
}



