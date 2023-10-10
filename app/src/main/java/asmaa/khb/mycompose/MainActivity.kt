package asmaa.khb.mycompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.consumeAllChanges
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import asmaa.khb.mycompose.data.PostItem
import asmaa.khb.mycompose.ui.theme.MyComposeTheme
import asmaa.khb.mycompose.util.HashtagsMentionsTextView
import asmaa.khb.mycompose.viewModel.InstagramCellViewModel
import coil.compose.rememberImagePainter
import java.text.SimpleDateFormat
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {

    private val viewModel: InstagramCellViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    LazyListExample(viewModel)
                }
            }
        }
    }
}

@Composable
fun LazyListExample(viewModel: InstagramCellViewModel) {
    val mItems by lazy { viewModel.items }
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .pointerInput(Unit) {
                detectDragGesturesAfterLongPress(
                    onDrag = { change, offset ->
                        change.consumeAllChanges()
                        // compute calculatedOffset
                    },
                    onDragStart = { offset -> },
                    onDragEnd = { },
                    onDragCancel = { }
                )
            },
        contentPadding = PaddingValues(16.dp),
    ) {
        items(mItems) {
            InstagramPostCell(it)
        }
    }
}

@Composable
fun InstagramPostCell(postItem: PostItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .border(
                width = 1.dp,
                color = Color(0xffeaeaea),
                shape = MaterialTheme.shapes.medium
            )
            .clickable(
                interactionSource = MutableInteractionSource(),
                indication = rememberRipple(bounded = true, color = Color.White),
                onClick = {}
            ),
    ) {
        // User profile section
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Profile picture
            Image(
                painter = rememberImagePainter(data = postItem.profileUri),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))

            Column {
                Text(
                    text = postItem.ownerName,
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    fontSize = 16.sp
                )

                val time = SimpleDateFormat("yyyy-MM-dd H:mm").format(postItem.postDate)
                val timeAndLocation = "$time  •  ${postItem.location}"
                Text(
                    text = timeAndLocation,
                    style = TextStyle(fontWeight = FontWeight.Normal, color = Color(0Xffd1d1d1)),
                    fontSize = 16.sp
                )
            }
        }

        // Post image or video
        Image(
            painter = rememberImagePainter(data = postItem.postUri),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            contentScale = ContentScale.Crop
        )

        // Caption
        HashtagsMentionsTextView(postItem.postDesc, modifier = Modifier
            .fillMaxWidth()
            .padding(14.dp), onClick = {})

        // Divider
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            color = Color(0xffeaeaea),
        )

        // Interaction buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                // Like button
                Image(
                    painter = painterResource(id = if (postItem.isPostLiked) R.drawable.ic_like else R.drawable.ic_unlike),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .padding(0.dp),
                )
                Text(
                    text = formatNumberAsK(postItem.likesCount),
                    style = TextStyle(fontWeight = FontWeight.Normal, color = Color(0xFF817F7F)),
                )

                Spacer(modifier = Modifier.width(10.dp))

                Icon(
                    painter = painterResource(id = R.drawable.ic_comment),
                    contentDescription = null,
                    modifier = Modifier
                        .size(30.dp)
                        .padding(0.dp),
                    tint = Color(0xFF817F7F)
                )

                Text(
                    text = formatNumberAsK(postItem.commentsCount),
                    style = TextStyle(fontWeight = FontWeight.Normal, color = Color(0xFF817F7F)),
                )
            }
        }
    }
}

fun <T : Number> formatNumberAsK(number: T): String {
    val value = number.toDouble()
    return when {
        value >= 1000 && value < 1000000 -> "${(value / 1000).roundToInt()}k"
        value >= 1000000 && value < 1000000000 -> "${(value / 1000000).roundToInt()}M"
        value >= 1000000000 -> "${(value / 1000000000).roundToInt()}G"
        else -> value.roundToInt().toString()
    }
}

