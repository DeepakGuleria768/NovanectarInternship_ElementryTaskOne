package com.example.prfofessionalportfolioapplication.Screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.scale

import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.prfofessionalportfolioapplication.LottieAnimationPage
import com.example.prfofessionalportfolioapplication.ui.theme.SoftWhite

@Composable
fun SecondScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    var initialState by remember { mutableStateOf(false) }
    var intialStatetwo by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        initialState = true
        intialStatetwo = true
    }

    val infiniteTransition = rememberInfiniteTransition(label = "Collapse transition")
    val scale by infiniteTransition.animateFloat(
        initialValue = 0.9f,
        targetValue = 1f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "label"

    )


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = SoftWhite),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // here we add the gradient in the card
        val gradient = Brush.linearGradient(
            colors = listOf(Color(0xFF43C6AC), Color(0xFF191654)),
            start = Offset(0f, 0f),
            end = Offset(1000f, 1000f)
        )

        Spacer(Modifier.height(100.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            AnimatedVisibility(
                visible = initialState,
                enter = slideInHorizontally(
                    animationSpec = tween(durationMillis = 1300)
                )
            ) {
                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                        .scale(scale = scale),
                    onClick = { navController.navigate("AboutMePage") }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(brush = gradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "About Me",
                            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }
            }
            AnimatedVisibility(
                visible = initialState,
                enter = slideInHorizontally(
                    animationSpec = tween(durationMillis = 1300)
                )
            ) {
                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                        .scale(scale = scale),
                    onClick = { navController.navigate("Resume") }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(brush = gradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Resume",
                            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }
            }


        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {

            AnimatedVisibility(
                visible = intialStatetwo,
                enter = slideInHorizontally(
                    animationSpec = tween(durationMillis = 1300)
                )
            ) {
                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                        .scale(scale = scale),
                    onClick = { navController.navigate("Project") }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(brush = gradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Project",
                            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }

            }
            AnimatedVisibility(
                visible = intialStatetwo,
                enter = slideInHorizontally(
                    animationSpec = tween(durationMillis = 1300)
                )
            ) {
                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                        .scale(scale = scale),
                    onClick = { navController.navigate("Contact") }) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(brush = gradient),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            "Contact",
                            fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }
            }

        }

        // here i add the lottie animation
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            LottieAnimationPage()
        }

    }
}

@Preview
@Composable
fun SecondScreenPreview() {
    val navController = rememberNavController()
    SecondScreen(navController = navController)
}