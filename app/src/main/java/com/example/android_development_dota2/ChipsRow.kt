import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import com.example.android_development_dota2.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_development_dota2.ui.theme.FontFamily

@Composable
fun ChipsRow() {
    Row(modifier = Modifier
        .padding(vertical = 35.dp, horizontal = 21.dp)) {
        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .width(53.dp)
                .height(22.dp)
                .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
        ) {
            Text (
                text = "MOBA",
                style = TextStyle(
                    fontFamily = FontFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF41A0E7),
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .width(93.dp)
                .height(22.dp)
                .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
        ) {
            Text (
                text = "MULTIPLAYER",
                style = TextStyle(
                    fontFamily = FontFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF41A0E7),
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp)
                .width(73.dp)
                .height(22.dp)
                .background(color = Color(0x3D44A9F4), shape = RoundedCornerShape(size = 100.dp))
        ) {
            Text (
                text = "STRATEGY",
                style = TextStyle(
                    fontFamily = FontFamily,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(0xFF41A0E7),
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
}