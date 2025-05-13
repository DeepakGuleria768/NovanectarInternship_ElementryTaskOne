package com.example.prfofessionalportfolioapplication.Screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.prfofessionalportfolioapplication.R
import com.example.prfofessionalportfolioapplication.ui.theme.buttonColor

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    navController: NavController
) {

    // here i create the color that i going to use in my gradient
    val myTextGradinent = listOf(Color(0xFF87CEEB), Color(0xFFE1BEE7), Color(0xFFFFCDD2))


    // state of the animation at begining
    var initialState by remember { mutableStateOf(false) }


    // intial state of Text
    var intialTextState by remember { mutableStateOf(false) }


    // here i am going to implement the infinite transition using InfiniteTransition
    // set up infinite transition scale
    val infiniteTransition =
        rememberInfiniteTransition(label = "collapseAnimation") // this give me the object of the Infinite transition
    //-> animation between small and large size
    val scale by infiniteTransition.animateFloat(
        initialValue = 1f,
        targetValue = 0.9f, // collpase upto 50% of its actual size
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 800, easing = FastOutSlowInEasing),
            repeatMode = RepeatMode.Reverse
        ),
        label = "button Scale"
    )


    // Trigger paragraph animation when screen loads
    LaunchedEffect(Unit) {
        initialState = true
        intialTextState = true
    }
    // here we create our home screen
    val text = buildAnnotatedString {
        append("Hi, there ")
        withStyle(style = SpanStyle(fontSize = 40.sp)) {
            append("\uD83D\uDC4B") // Waving hand emoji
        }
    }

    val scrollstate = rememberScrollState()

    Column(
        modifier = modifier.fillMaxSize()
            .verticalScroll(scrollstate)
    ) {
        AnimatedVisibility(
            visible = intialTextState,
            enter = slideInHorizontally(
                animationSpec = tween(durationMillis = 2400)
            )
        ) {
            Text(
                text = text,
                modifier = modifier.padding(top = 20.dp, start = 20.dp),
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                color = Color.White
            )
            Text(
                "Welcome to my Portfolio ",
                modifier = modifier.padding(start = 20.dp),
                fontWeight = FontWeight.Bold,
                fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                fontSize = 20.sp,
                color = Color.White
            )
        }

        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .height(680.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.man),
                contentDescription = "man",
                modifier = Modifier
                    .size(200.dp)
                    .padding(top = 40.dp),
                contentScale = ContentScale.Fit
            )

            Spacer(Modifier.height(20.dp))
            // here we use animatedVisibility to hide and show the content here that is composable
            AnimatedVisibility(
                visible = initialState,
                enter = slideInVertically(
                    animationSpec = tween(durationMillis = 2500)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(500.dp)
                ) {

                    Text(
                                "Hi, I'm Deepak Guleria — a passionate Android Developer committed to creating" +
                                " smooth, user-friendly, and high-performance mobile applications. " +
                                "I focus on writing clean, maintainable code and crafting intuitive digital experiences. " +
                                "Every app I build reflects my dedication to quality, creativity, and continuous improvement.",

                        textAlign = TextAlign.Justify,

                        style = TextStyle(
                            brush = Brush.linearGradient(myTextGradinent)
                        ),
                        fontSize = 25.sp,
                        fontFamily = MaterialTheme.typography.headlineLarge.fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
            }

        }
        Button(
            onClick = {navController.navigate("secondScreen")},
            modifier = Modifier
                .fillMaxWidth()
                .scale(scale = scale)
                .padding(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = buttonColor,
                contentColor = Color.White
            )
        ) {
            Text(
                "Want to know more ?",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(10.dp),
                fontFamily = MaterialTheme.typography.headlineLarge.fontFamily
            )
        }
    }


}

@Preview
@Composable
fun HomeScreenPreview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}