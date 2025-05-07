package com.example.prfofessionalportfolioapplication

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.Lottie
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition

@Composable
fun LottieAnimationPage(modifier: Modifier = Modifier){

    val   preloaderlottieComposition by rememberLottieComposition(
        LottieCompositionSpec.RawRes(
            R.raw.lotieanimationone
        )
    )

    val   preloaderProgress by animateLottieCompositionAsState(
        preloaderlottieComposition,
        iterations = LottieConstants.IterateForever,
        isPlaying = true
    )

    LottieAnimation(
        composition = preloaderlottieComposition,
        progress = preloaderProgress,
        modifier = Modifier.size(500.dp)
    )
}


@Preview
@Composable
fun LottieAnimationPagePreview(){
    LottieAnimationPage()
}