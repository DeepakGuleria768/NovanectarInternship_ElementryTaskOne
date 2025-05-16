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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.prfofessionalportfolioapplication.ui.theme.iconColor

@Composable
fun SecondScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    var initialState by remember { mutableStateOf(false) }
    var intialStatetwo by remember { mutableStateOf(false) }
    val scrollstate = rememberScrollState()

    LaunchedEffect(Unit) {
        initialState = true
        intialStatetwo = true
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = SoftWhite)
            .verticalScroll(scrollstate),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // here we add the gradient in the card
        val gradient = Brush.linearGradient(
            colors = listOf(iconColor,Color.White,Color.Blue),
            start = Offset(0f, 0f),
            end = Offset(1000f, 1000f)
        )

        Spacer(Modifier.height(50.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
        ) {

                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                    ,
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
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }


                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                        ,
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
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }



        }
        Spacer(Modifier.height(10.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,

        ) {


                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp)
                    ,
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
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }



                ElevatedCard(
                    modifier = Modifier
                        .size(180.dp),
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
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.Black
                        )
                    }
                }


        }
           Spacer(Modifier.height(10.dp))
        Row (
            modifier = Modifier.fillMaxWidth().height(150.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ){

            ElevatedCard(
                modifier = Modifier
                    .size(180.dp)
                ,
                onClick = { navController.navigate("Main_job_screen") }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(brush = gradient),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "Vacancy",
                        fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }

            ElevatedCard(
                modifier = Modifier
                    .size(180.dp)
                ,
                onClick = { navController.navigate("upload_resume") }) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(brush = gradient),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        "UploadResume",
                        fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
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