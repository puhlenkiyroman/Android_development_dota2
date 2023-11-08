import com.example.android_development_dota2.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun RatingCard() {
    Spacer(modifier = Modifier
        .height(20.dp))
    Row (modifier = Modifier
        .padding (horizontal = 25.dp)) {
        Image(
            painter = painterResource(id = R.drawable.reviwers_photo),
            contentDescription = "Profile photo",
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Column {
            Text(
                text = "Auguste Conte",
                color = Color.White,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight =  FontWeight.ExtraLight,
                )
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "February 14, 2019",
                color = Color.White,
                style = TextStyle(
                    fontSize = 8.sp,
                    fontWeight =  FontWeight.ExtraLight,
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

        }
    }
    Text(
        modifier = Modifier
            .padding(horizontal = 25.dp),
        text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
        color = Color.White,
        style = TextStyle(
            fontSize = 12.sp,
            fontWeight =  FontWeight.ExtraLight,
        )
    )/*
    Image(
        painter = painterResource(id = R.drawable.vector),
        contentDescription = "Profile photo",
        modifier = Modifier
            .fillMaxWidth()
    )*/
}