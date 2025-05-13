package com.example.prfofessionalportfolioapplication.Screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.expandIn
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.prfofessionalportfolioapplication.Components.MyTopAppBar
import com.example.prfofessionalportfolioapplication.ui.theme.Aqua

@Composable
fun ProjectPage(
    navController: NavController
) {

    // create the annotated string for adding github url
    val SourceText = "check out my project on"
    val hyperLinkText = " Github"
    val uri = "https://github.com/DeepakGuleria768/PixPloreApp"
    val uriHandler = LocalUriHandler.current

    val annotatedString = buildAnnotatedString {
        append(SourceText)
        withStyle(
            style = SpanStyle(
                textDecoration =
                    TextDecoration.Underline, color = Color.Blue
            )
        ) {
            append(hyperLinkText)
            addStringAnnotation(
                tag = "URL",
                annotation = uri,
                start = length - hyperLinkText.length,
                end = length
            )
        }

    }
    val scrollState = rememberScrollState()
    val robotofont = FontFamily(
        Font(com.example.prfofessionalportfolioapplication.R.font.roboto)
    )

    // state for the animation
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
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(scrollState)
                    .padding(innerPadding)
                    .background(color = Color.White)
                    .padding(16.dp), // Optional padding for content
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    " PixPlore – Android Image Exploration App",
                    color = Color.Black,
                    fontSize = 24.sp,
                    fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(30.dp))

                Text(
                    "Description",
                    color = Color.Black,
                    fontSize = 20.sp,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold
                )
                Spacer(Modifier.height(15.dp))
                Text(
                    "PixPlore is a powerful and elegant Android application designed to provide users with a " +
                            "seamless experience while browsing high-quality images. It blends modern UI/UX principles " +
                            "with robust backend architecture to ensure high performance, responsiveness, and offline " +
                            "functionality", color = Color.Black, fontFamily = robotofont
                )

                Spacer(Modifier.height(30.dp))

                Text(
                    "\uD83D\uDD11 Key Features",
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    fontSize = 20.sp
                )
                Spacer(Modifier.height(15.dp))
                Text(
                    "\uD83C\uDF04 Explore Infinite Images: Users can scroll endlessly through a rich library of high-resolution images.\n" +
                            "\n" +
                            "⚡ Fast Image Loading: Integrated with Coil to deliver lightning-fast image rendering and smooth transitions.\n" +
                            "\n" +
                            "\uD83C\uDF10 API Integration: Fetches image data from a remote server using Retrofit, ensuring scalability and clean separation of concerns.\n" +
                            "\n" +
                            "\uD83D\uDCE6 Offline Support: Saves images locally using Room Database for browsing even without an internet connection.\n" +
                            "\n" +
                            "\uD83E\uDDED Modern Navigation: Powered by Jetpack Compose Navigation, delivering a dynamic and intuitive app flow.\n" +
                            "\n" +
                            "\uD83C\uDFA8 Built with Jetpack Compose & Material 3: Adopts Google's latest design system for a polished and fluid interface.\n" +
                            "\n" +
                            "\uD83D\uDD04 Efficient Paging: Utilizes Paging 3 for efficient data loading and memory usage during infinite scrolling.\n" +
                            "\n" +
                            "\uD83D\uDEE1\uFE0F Dependency Injection: Secured and modular code architecture using Dagger Hilt.\n" +
                            "\n" +
                            "\uD83D\uDE80 Beautiful Splash Screen: Welcomes users with a visually appealing and animated launch experience.\n",
                    color = Color.Black, fontFamily = robotofont
                )

                Spacer(Modifier.height(30.dp))
                Text(
                    "\uD83D\uDEE0 Tech Stack:",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Spacer(Modifier.height(15.dp))
                Text(
                    "Frontend: Kotlin, Jetpack Compose, Material 3\n" +
                            "\n" +
                            "Architecture: MVVM\n" +
                            "\n" +
                            "Networking: Retrofit\n" +
                            "\n" +
                            "Dependency Injection: Dagger Hilt\n" +
                            "\n" +
                            "Local Storage: Room Database\n" +
                            "\n" +
                            "Image Loading: Coil\n" +
                            "\n" +
                            "Pagination: Paging 3\n" +
                            "\n" +
                            "Version Control: Git, GitHub",
                    color = Color.Black,
                    fontFamily = robotofont
                )

                Spacer(Modifier.height(24.dp))

                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            color = Aqua, shape = RoundedCornerShape(
                                topEnd = 10.dp,
                                topStart = 10.dp,
                                bottomStart = 10.dp,
                                bottomEnd = 10.dp
                            )
                        )
                ) {
                    ClickableText(
                        text = annotatedString,
                        modifier = Modifier.padding(15.dp),
                        style = MaterialTheme.typography.bodyLarge.copy(
                            color = Color.Black,
                            fontFamily = robotofont,
                            fontSize = 18.sp
                        ),
                        onClick = { offset ->
                            annotatedString.getStringAnnotations(
                                tag = "URL",
                                start = offset,
                                end = offset
                            )
                                .firstOrNull()?.let { annotation ->
                                    uriHandler.openUri(annotation.item)
                                }
                        }
                    )
                }


            }
        }
    }
}

