import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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