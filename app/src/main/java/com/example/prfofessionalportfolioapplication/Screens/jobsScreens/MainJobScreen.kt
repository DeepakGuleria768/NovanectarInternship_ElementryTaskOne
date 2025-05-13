package com.example.prfofessionalportfolioapplication.Screens.jobsScreens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.prfofessionalportfolioapplication.ui.theme.SoftWhite
import com.example.prfofessionalportfolioapplication.ui.theme.iconColor

@Composable
fun MainJobScreen(
    navController: NavController
) {

    // here i preserve the animation state
    var initial_Animation by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        initial_Animation = true
    }
        AnimatedVisibility(
            visible = initial_Animation,
            enter = expandIn(animationSpec = tween(durationMillis = 1500)) + fadeIn(
                animationSpec = tween(1000)
            ),
            exit = shrinkOut(animationSpec = tween(durationMillis = 1800)) + fadeOut(
                animationSpec = tween(
                    1000
                )
            )
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = SoftWhite),
                verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // here we are creating the choice for the technical and non_technical jobs
            Button(
                onClick = {navController.navigate("Technical")},
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = iconColor
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .height(50.dp)
            ) {
                Text(
                    "Technical",
                    fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Button(
                onClick = {navController.navigate("Nontechnical")},
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = iconColor
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
                    .height(50.dp)
            ) {
                Text(
                    "Non Technical",
                    fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                    fontSize = 25.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
            }
        }
    }

}

@Preview
@Composable
fun MainJobScreenPreview() {
    val navController = rememberNavController()
    MainJobScreen(navController = navController)
}
