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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.draw.clip
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
                    Column(modifier = Modifier
                        .fillMaxWidth()
                        .verticalScroll(rememberScrollState())
                    ) {
                        ImageWithLogo()
                        DisplayText()
                        DotaDemo()
                        ReviewAndRatings()
                        RatingCard()
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
                    .offset(x = -8.dp, y = 250.dp), // Установка смещения для логотипа
            )
            Image(
                painter = painterResource(id = R.drawable.stars_dota2),
                contentDescription = "logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(76.dp)
                    .offset(x = 85.dp, y = 305.dp), // Установка смещения для звёзд
            )
        }
        Text (
            modifier = Modifier
                .offset(x = 100.dp, y = 290.dp),
            text = "Dota 2",
            color = Color.White,
            style = TextStyle(
                fontSize = 20.sp,
                fontWeight =  FontWeight.ExtraLight,
            )
        )
        Text (
            modifier = Modifier
                .offset(x = 185.dp, y = 320.dp),
            text = "70M",
            color = Color.White,
            style = TextStyle(
                fontSize = 10.sp,
                fontWeight =  FontWeight.ExtraLight,
            )
        )
    }
}

@Composable
fun DisplayText() {
    Spacer(modifier = Modifier
        .height(80.dp))
    Text(
        modifier = Modifier
            .padding (horizontal = 25.dp, vertical = 20.dp),
        color = Color.White,
        text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        style = TextStyle(
            fontSize = 12.sp,
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

@Composable
fun ReviewAndRatings() {
    Text(
        modifier = Modifier
            .padding (horizontal = 25.dp, vertical = 20.dp),
        color = Color.White,
        text = "Review & Ratings",
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            /*fontFamily = FontFamily(Font(R.font.sk_modernist))*/
        )
    )
    Text (
        modifier = Modifier
            .padding (horizontal = 25.dp),
        color = Color.White,
        text = "4.9",
        style = TextStyle(
            fontSize = 50.sp,
            fontWeight = FontWeight.Normal
        )
    )

}

@Composable
fun RatingCard() {
    Spacer(modifier = Modifier
        .height(20.dp))
    Row (modifier = Modifier
        .padding (horizontal = 25.dp)) {
         Image(
             painter = painterResource(id = R.drawable.reviwers_photo),
             contentDescription = "Profile photo",
             modifier = Modifier
                 .size(40.dp)
                 .clip(CircleShape)
         )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = "Auguste Conte",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight =  FontWeight.ExtraLight,
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "February 14, 2019",
                color = Color.White,
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight =  FontWeight.ExtraLight,
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

        }
    }
    Text(
        modifier = Modifier
            .padding(horizontal = 25.dp),
        text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
        color = Color.White,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight =  FontWeight.ExtraLight,
        )
    )
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
                ReviewAndRatings()
                RatingCard()
                InstallButton()
            }
        }
    }
}