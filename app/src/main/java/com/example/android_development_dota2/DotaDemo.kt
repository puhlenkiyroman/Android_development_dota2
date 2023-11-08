import com.example.android_development_dota2.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DotaDemo() {
    LazyRow {
        item {
            Image(
                painter = painterResource(id = R.drawable.demo_photo1),
                contentDescription = "first_demo_photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .padding(horizontal = 24.dp)
            )
        }
        item {
            Image(
                painter = painterResource(id = R.drawable.demo_photo1),
                contentDescription = "second_demo_photo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .background(Color.Transparent)
                    .height(120.dp)
                    .padding(horizontal = 24.dp)
            )
        }
    }
}