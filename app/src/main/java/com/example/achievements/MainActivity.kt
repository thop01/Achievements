package com.example.achievements

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.achievements.ui.theme.AchievementsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AchievementsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LessonView(
                        title = stringResource(R.string.introduction),
                        p1 = stringResource(R.string.node_intro_text),
                        p2 = stringResource(R.string.node_intro_text2)
                    )
                  //  GreetingImage(msg = stringResource(R.string.congratulation_user), from = stringResource(R.string.from_pt))
                }
            }
        }
    }
}

@Composable
fun GreetingImage(msg: String, from: String, modifier:Modifier = Modifier){
    val image = painterResource(R.drawable.myparty)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        GreetingText(
            msg = msg,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp)
        )
    }
}

@Composable
fun GreetingText(msg: String, from: String, modifier:Modifier = Modifier){
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(20.dp)
    ) {
        Text(
            text = msg,
            fontSize = 40.sp,
            lineHeight = 42.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from, fontSize = 20.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
    }

}

@Composable
fun LessonView(title: String, p1: String, p2: String, modifier:Modifier = Modifier){
    val image = painterResource(R.drawable.header)
    Column (

    ){
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = title,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = p1,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
        )
        Text(
            text = p2,
            textAlign = TextAlign.Justify,
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
        )
    }

}

@Composable
fun AchievementPreview() {
    AchievementsTheme {
        GreetingImage(stringResource(R.string.congratulation_user), stringResource(R.string.from_pt))
    }
}

@Preview(showBackground = true)
@Composable
fun LessonPreview() {
    AchievementsTheme {
        LessonView(
            title = stringResource(R.string.introduction),
            p1 = stringResource(R.string.node_intro_text),
            p2 = stringResource(R.string.node_intro_text2)
        )
    }
}