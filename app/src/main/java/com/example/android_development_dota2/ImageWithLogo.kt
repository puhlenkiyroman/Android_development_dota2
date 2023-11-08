import com.example.android_development_dota2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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