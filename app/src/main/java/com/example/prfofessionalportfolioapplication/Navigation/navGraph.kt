package com.example.prfofessionalportfolioapplication.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prfofessionalportfolioapplication.Screens.AboutMePage
import com.example.prfofessionalportfolioapplication.Screens.ContactPage
import com.example.prfofessionalportfolioapplication.Screens.HomeScreen
import com.example.prfofessionalportfolioapplication.Screens.JobFormFillingScreen
import com.example.prfofessionalportfolioapplication.Screens.ProjectPage
import com.example.prfofessionalportfolioapplication.Screens.ResumePage
import com.example.prfofessionalportfolioapplication.Screens.ResumeUploadingScreen.ResumeUploader
import com.example.prfofessionalportfolioapplication.Screens.SecondScreen
import com.example.prfofessionalportfolioapplication.Screens.jobsScreens.MainJobScreen
import com.example.prfofessionalportfolioapplication.Screens.jobsScreens.NonTechnicalJobsScreen
import com.example.prfofessionalportfolioapplication.Screens.jobsScreens.TechnicalJobsScreen

@Composable
fun MyappNavGraph() {

    val navController = rememberNavController()

    NavHost(startDestination = "homeScreen", navController = navController) {

        composable("homeScreen") {
            HomeScreen(navController = navController)
        }
        composable("secondScreen") {
            SecondScreen(navController = navController)
        }
        composable("AboutMePage") {
            AboutMePage(navController = navController)
        }
        composable("Contact") {
            ContactPage(navController = navController)
        }
        composable("Project") {
            ProjectPage(navController = navController)
        }
        composable("Resume") {
            ResumePage(navController = navController)
        }
        composable("Technical") {
            TechnicalJobsScreen(navController = navController)
        }
        composable("Nontechnical") {
            NonTechnicalJobsScreen(navController = navController)
        }
        composable("Main_job_screen") {
            MainJobScreen(navController = navController)
        }
        composable("from_filling") {
            JobFormFillingScreen(navController = navController)
        }
        composable("upload_resume") {
            ResumeUploader(navController = navController)
        }
    }
}