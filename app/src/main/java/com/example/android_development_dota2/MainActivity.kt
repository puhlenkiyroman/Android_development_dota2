package com.example.android_development_dota2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.zIndex
import com.example.android_development_dota2.ui.theme.Android_development_dota2Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Android_development_dota2Theme {
                Surface(
                    color = Color.Black,
                    modifier = Modifier.fillMaxSize()
                ) {
                    Column(modifier = Modifier.fillMaxWidth()) {
                        ImageWithLogo()
                        DisplayText()
                        DotaDemo()
                    }
                }
            }
        }
    }
}

@Composable
fun ImageWithLogo() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.main_photo_dota),
            contentDescription = "header_photo",
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .padding(15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(105.dp)
                    .height(95.dp)
                    .offset(x = 10.dp, y = 230.dp), // Установка смещения для логотипа
            )
        }
    }
}


@Composable
fun DisplayText() {
    Text(
        modifier = Modifier.padding(24.dp),
        color = Color.White,
        text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own."
    )
}

@Composable
fun DotaDemo() {
    LazyRow {
        item {
            Image(
                painter = painterResource(id = R.drawable.demo_photo1),
                contentDescription = "first_demo_photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .padding(horizontal = 24.dp)
            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.demo_photo1),
                contentDescription = "second_demo_photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .padding(horizontal = 24.dp)
            )
        }
    }
}

@Composable
fun Install() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DotaDemo()
        Spacer(modifier = Modifier.height(16.dp))
        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Gray)
        ) {
            Image(
                painter = painterResource(id = R.drawable.install),
                contentDescription = "Install Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
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
                DisplayText()
                DotaDemo()
                Install()
            }
        }
    }
}