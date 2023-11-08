import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
import com.example.android_development_dota2.R

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
    Row() {
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
        Column() {
            Image(
                painter = painterResource(id = R.drawable.second_starts_dota2),
                contentDescription = "second_starts_dota2",
                modifier = Modifier
                    .width(76.dp)
                    .padding(vertical = 15.dp),
                contentScale = ContentScale.Crop
            )
            Text (
                color = Color.White,
                text = "70M Reviews",
                style = TextStyle(
                    fontSize = 10.sp,
                    fontWeight = FontWeight.ExtraLight
                )
            )
        }
    }
}