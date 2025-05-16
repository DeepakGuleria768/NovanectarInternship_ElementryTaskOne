package com.example.prfofessionalportfolioapplication.Screens.ResumeUploadingScreen

import android.R
import android.net.Uri
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedButton
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prfofessionalportfolioapplication.ui.theme.SoftWhite
import com.example.prfofessionalportfolioapplication.ui.theme.iconColor

@Composable
fun ResumeUploader(
    navController: NavController
) {

    var resumeUploading by remember {mutableStateOf(false)}
    val context = LocalContext.current
    // State to hold the selected URI
    var selectedUri by remember { mutableStateOf<Uri?>(null) }

    // File picker launcher to pick PDF files
    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.GetContent()) { uri ->
        selectedUri = uri // Store the selected URI
    }

    // Handle uploading once the URI is selected
    LaunchedEffect(selectedUri) {
        selectedUri?.let { uri ->
            resumeUploading = true
            // Only upload if URI is not null
            uploadResumeToSupabase(context, uri){
                resumeUploading = false
            }
        }
    }

    Column(
        modifier = Modifier.fillMaxSize().background(color = SoftWhite),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if(resumeUploading){
            CircularProgressIndicator()
        }else{
            ElevatedButton(
                onClick = { launcher.launch("application/pdf") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                shape = RectangleShape,
                colors = ButtonDefaults.buttonColors(
                    containerColor = iconColor,
                    contentColor = Color.White
                )
            ) {
                Text(
                    "Upload Resume",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = MaterialTheme.typography.headlineLarge.fontFamily
                )
            }
        }

    }

}