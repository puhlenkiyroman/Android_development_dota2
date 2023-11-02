package com.example.android_development_dota2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Text
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
                    ImageWithLogo(
                        painterResource(id = R.drawable.main_photo_dota),
                        painterResource(id = R.drawable.logo)
                    )
                }
            }
        }
    }
}

@Composable
fun ImageWithLogo(image: Painter, logo: Painter) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(270.dp),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier
                .width(105.dp)
                .height(95.dp)
                .offset(x = 10.dp, y = 230.dp), // Установка смещения для логотипа
        )
        DisplayText()
    }
}

@Composable
fun DisplayText() {
    Text(
        text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
        color = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun ImageWithLogoPreview() {
    Android_development_dota2Theme {
        ImageWithLogo(
            painterResource(id = R.drawable.main_photo_dota),
            painterResource(id = R.drawable.logo)
        )
    }
}