import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_development_dota2.ui.theme.FontFamily
import com.example.android_development_dota2.R

@Composable
fun DisplayText() {
    Text(
        modifier = Modifier
            .padding (horizontal = 25.dp, vertical = 20.dp),
        text = stringResource(id = R.string.dota_game_description),
        style = TextStyle(
            fontFamily = FontFamily,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xB2EEF2FB),
            )
    )
}