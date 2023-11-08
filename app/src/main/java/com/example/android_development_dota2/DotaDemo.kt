import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.android_development_dota2.R


@Composable
fun DotaDemo() {
    val imageList = listOf(
        R.drawable.demo_photo1,
        R.drawable.demo_photo1,
    )

    LazyRow {
        items(imageList) { image ->
            VideoImageWithPlayIcon(image)
        }
    }
}

@Composable
fun VideoImageWithPlayIcon(image: Int) {
    Box(
        modifier = Modifier
            .height(120.dp)
            .padding(horizontal = 24.dp)
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = MaterialTheme.shapes.medium)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_play),
            contentDescription = "Play",
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.Center)
        )
    }
}
