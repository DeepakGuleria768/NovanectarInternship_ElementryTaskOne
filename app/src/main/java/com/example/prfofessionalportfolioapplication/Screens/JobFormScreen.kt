package com.example.prfofessionalportfolioapplication.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun JobFormFillingScreen(
    navController: NavController
){

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Form Filling", fontSize = 40.sp, fontWeight = FontWeight.Bold)
    }
}


@Preview
@Composable
fun JobFormFillingScreenPreview(){
    val navController = rememberNavController()
    JobFormFillingScreen(navController)
}