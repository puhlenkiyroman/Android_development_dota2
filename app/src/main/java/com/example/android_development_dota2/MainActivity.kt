package com.example.android_development_dota2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.*
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
                        InstallButton()
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
        modifier = Modifier
            .padding (horizontal = 25.dp, vertical = 35.dp),
        color = Color.White,
        text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        style = TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            /*fontFamily = FontFamily(Font(R.font.sk_modernist))*/
        )
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
fun InstallButton() {
    var isDownloadStarted by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .height(78.dp)
            .fillMaxWidth()
            .padding(16.dp)
            .clickable { isDownloadStarted = !isDownloadStarted },
        shape = RoundedCornerShape(8.dp), // Округление углов
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Yellow, shape = RoundedCornerShape(8.dp))
                .padding(10.dp) // Отступ для центрирования
        ) {
            Text(
                text = if (isDownloadStarted) "Скачка начата" else "Install",
                style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
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
                InstallButton()
            }
        }
    }
}