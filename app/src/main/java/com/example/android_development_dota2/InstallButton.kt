import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_development_dota2.R
import com.example.android_development_dota2.ui.theme.FontFamily

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
                text = if (isDownloadStarted) stringResource(id = R.string.downloading)
                else stringResource(id = R.string.install),
                style = TextStyle(
                    fontFamily = FontFamily,
                    fontSize = 20.sp,
                    fontWeight =  FontWeight.Bold,
                    color = Color.Black,
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
    }
    Spacer(modifier = Modifier.height(35.dp))
}