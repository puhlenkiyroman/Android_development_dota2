import com.example.android_development_dota2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_development_dota2.ui.theme.FontFamily

@Composable
fun ImageWithLogo() {
    Box(modifier = Modifier
        .fillMaxWidth()) {
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
                .padding(5.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = "logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(130.dp)
                    .height(125.dp)
                    .offset(y = 250.dp), // Установка смещения для логотипа
            )
        }}
    Column(modifier = Modifier
        .padding (horizontal = 125.dp)) {
        Text (
            text = stringResource(id = R.string.name_game),
            color = Color.White,
            style = TextStyle(
                fontFamily = FontFamily,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )
        )
        Row(modifier = Modifier
            .padding (vertical = 5.dp)) {
            Image(
                painter = painterResource(id = R.drawable.stars_dota2),
                contentDescription = "stars",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .width(76.dp)
            )
            Text(
                modifier = Modifier
                    .padding (horizontal = 5.dp),
                text = stringResource(id = R.string.launches),
                style = TextStyle(
                    fontFamily = FontFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    color = colorResource(id = R.color.grey_700),
                )
            )
        }
    }
}