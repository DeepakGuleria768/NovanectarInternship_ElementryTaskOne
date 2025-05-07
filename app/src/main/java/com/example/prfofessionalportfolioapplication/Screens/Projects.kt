package com.example.prfofessionalportfolioapplication.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.prfofessionalportfolioapplication.Components.MyTopAppBar

@Composable
fun ProjectPage(
    navController: NavController
){
    Scaffold(
        topBar = {
            MyTopAppBar(navController = navController)
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(color = Color.White)
                .padding(16.dp), // Optional padding for content
            verticalArrangement = Arrangement.Center, // Changed from Center
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Project", color = Color.Black) // ensure visible text color
        }
    }
}