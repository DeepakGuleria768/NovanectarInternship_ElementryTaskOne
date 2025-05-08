package com.example.prfofessionalportfolioapplication.Screens

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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
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
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prfofessionalportfolioapplication.Components.MyTopAppBar
import com.example.prfofessionalportfolioapplication.R
import kotlin.math.exp

@Composable
fun AboutMePage(
    navController: NavController
) {

    var visible by remember { mutableStateOf(false) }

    val customFontFamily = FontFamily(
        Font(R.font.oldernburgregular)
    )

    val robotofont = FontFamily(
        Font(R.font.roboto)
    )

    val scroll = rememberScrollState()


    LaunchedEffect(Unit)
    {
        visible = true
    }

    Scaffold(
        topBar = {
            MyTopAppBar(navController = navController)
        }
    ) { innerPadding ->

        AnimatedVisibility(
            visible = visible,
            enter = expandIn(animationSpec = tween(durationMillis = 1500))+fadeIn(animationSpec = tween(2000)),
            exit = shrinkOut(animationSpec = tween(durationMillis = 1800))+ fadeOut(animationSpec = tween(2000))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(color = Color.White)
                    .verticalScroll(scroll)
                    .padding(16.dp), // Optional padding for content
                verticalArrangement = Arrangement.Center, // Changed from Center
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                            "Hello! I'm Deepak Guleria, a passionate and performance-driven Android developer based in Bengaluru, Karnataka. " +
                            "I recently completed my B.Tech in Computer Science from Beant College of Engineering and Technology," +
                            " Gurdaspur (Class of 2024), where I built a strong technical foundation and honed my skills in mobile app development.\n" +
                            "\n" +
                            "My core strength lies in building modern, high-performance Android applications using Kotlin, Jetpack Compose, " +
                            "MVVM architecture, and Material Design principles. I bring hands-on expertise in a wide range of tools and " +
                            "technologies including Room Database, Retrofit, Paging 3, Dagger Hilt, and Jetpack Navigation, allowing me " +
                            "to design and develop apps that are robust, scalable, and user-friendly.\n" +
                            "\n" +
                            "One of my standout projects, PixPlore, is a fully featured Android app that allows users to explore " +
                            "high-quality images with infinite scrolling, offline support, and fast image rendering using Coil. " +
                            "Built with Jetpack Compose and Material 3, PixPlore showcases my ability to merge sleek UI with powerful backend logic and responsive design.\n" +
                            "\n" +
                            "During my internship as a Software Engineer in Bangalore, I worked on database systems using Oracle SQL, " +
                            "practiced full-stack Java development, and collaborated using version control tools like Git & GitHub. " +
                            "This experience gave me valuable insights into real-world development workflows, backend architecture, and cross-functional teamwork.\n" +
                            "\n" +
                            "I’m deeply passionate about building intuitive mobile experiences and writing clean, maintainable code." +
                            " My goal is to continue growing as an Android developer, contribute to impactful products, and help shape" +
                            " the future of mobile technology through innovation and p  recision.\n" +
                            "\n" +
                            "Whether it's developing engaging user interfaces or solving complex architectural problems, I strive to build Android " +
                            "solutions that leave a meaningful impact.",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start,
                    fontFamily = robotofont ,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                ) // ensure visible text color
            }
        }

    }
}
