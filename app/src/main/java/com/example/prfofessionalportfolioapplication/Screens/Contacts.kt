package com.example.prfofessionalportfolioapplication.Screens

import android.R
import android.content.Intent
import android.net.Uri
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prfofessionalportfolioapplication.Components.MyTopAppBar


@Composable
fun ContactPage(
    navController: NavController
) {
    val context = LocalContext.current
    val uriHandler = LocalUriHandler.current

    val robotofont = FontFamily(
        Font(com.example.prfofessionalportfolioapplication.R.font.roboto)
    )

    var visible by remember { mutableStateOf(false) }

    LaunchedEffect(Unit) {
        visible = true
    }

    Scaffold(
        topBar = {
            MyTopAppBar(navController = navController)
        }
    ) { innerPading ->


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
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .fillMaxWidth()
                    .background(color = Color.White)
                    .padding(innerPading),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Heading
                Text(
                    text = "Let's Connect",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = robotofont,
                    color = Color.Black
                )

                Text(
                    text = "Feel free to reach out for collaboration, questions, or just to say hi!",
                    fontSize = 16.sp,
                    fontFamily = robotofont,
                    color = Color.DarkGray
                )

                // Phone
                ContactRow(icon = "📞", label = "Phone", value = "+91 89687 88813") {
                    val intent = Intent(Intent.ACTION_DIAL)
                    intent.data = Uri.parse("tel:+918968788813")
                    context.startActivity(intent)
                }

                // Email
                ContactRow(icon = "📧", label = "Email", value = "dguleria07@gmail.com") {
                    val intent = Intent(Intent.ACTION_SENDTO)
                    intent.data = Uri.parse("mailto:dguleria07@gmail.com")
                    context.startActivity(intent)
                }

                // GitHub
                ContactRow(icon = "🌐", label = "GitHub", value = "github.com/DeepakGuleria768") {
                    uriHandler.openUri("https://github.com/DeepakGuleria768")
                }

                // LinkedIn
                ContactRow(icon = "💼", label = "LinkedIn", value = "linkedin.com/in/your-profile") {
                    uriHandler.openUri("https://www.linkedin.com/in/deepak-guleria-341392354/") // Replace with actual profile
                }
            }
        }
    }


}

@Composable
fun ContactRow(
    icon: String,
    label: String,
    value: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = icon,
            fontSize = 20.sp,
            modifier = Modifier.padding(end = 12.dp)
        )
        Column {
            Text(text = label, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
            Text(text = value, fontSize = 16.sp, color = Color.Blue)
        }
    }
}

