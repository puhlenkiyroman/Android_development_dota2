import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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