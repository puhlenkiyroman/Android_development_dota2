import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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