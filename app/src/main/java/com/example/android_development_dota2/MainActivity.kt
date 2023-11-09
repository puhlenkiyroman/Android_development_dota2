package com.example.android_development_dota2

import android.os.Bundle
import DisplayText
import ImageWithLogo
import DotaDemo
import InstallButton
import RatingCard
import ReviewAndRatings
import ChipsRow

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.systemuicontroller.rememberSystemUiController

import com.example.android_development_dota2.ui.theme.Android_development_dota2Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            Android_development_dota2Theme {
                ApplySystemBarColors()
                Surface(
                    color = Color.Black,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                    ) {
                        ImageWithLogo()
                        ChipsRow()
                        DisplayText()
                        DotaDemo()
                        ReviewAndRatings()
                        RatingCard()
                        RatingCard()
                        InstallButton()
                    }
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    Android_development_dota2Theme {
        Surface(
            color = Color.Black,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(modifier = Modifier.fillMaxSize()) {
                ImageWithLogo()
                ChipsRow()
                DisplayText()
                DotaDemo()
                ReviewAndRatings()
                RatingCard()
                RatingCard()
                InstallButton()
            }
        }
    }
}

@Composable
private fun ApplySystemBarColors() {
    val systemUiController = rememberSystemUiController()

    SideEffect {
        systemUiController.setStatusBarColor(color = Color.Transparent)
        systemUiController.setNavigationBarColor(color = Color.Transparent)
    }
}