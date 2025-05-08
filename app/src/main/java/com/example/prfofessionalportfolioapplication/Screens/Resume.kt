package com.example.prfofessionalportfolioapplication.Screens

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.prfofessionalportfolioapplication.Components.MyTopAppBar
import com.example.prfofessionalportfolioapplication.R

@Composable
fun ResumePage(
    navController: NavController
) {


    var visible by remember { mutableStateOf(false) }
    LaunchedEffect(Unit) {
        visible = true
    }
    Scaffold(
        topBar = {
            MyTopAppBar(navController = navController)
        }
    ) { innerPadding ->

        AnimatedVisibility(
            visible = visible,
            enter = expandIn(animationSpec = tween(durationMillis = 1500)) + fadeIn(
                animationSpec = tween(
                    2000
                )
            ),
            exit = shrinkOut(animationSpec = tween(durationMillis = 1800)) + fadeOut(
                animationSpec = tween(
                    2000
                )
            )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding)
                    .background(color = Color.White)
            ) {
                Image(
                    painter  = painterResource(R.drawable.resume),
                    contentDescription = "resume",
                    modifier = Modifier.fillMaxSize()
                )

            }
        }

    }
}


@Preview
@Composable
fun MyresumePreview(){
    val navController = rememberNavController()
    ResumePage(navController = navController)
}