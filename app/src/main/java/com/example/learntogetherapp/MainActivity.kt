package com.example.learntogetherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.InlineTextContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learntogetherapp.ui.theme.LearnTogetherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnTogetherPainelImage(
                        stringResource(R.string.jetpack_compose_title),
                        stringResource(R.string.jetpack_content_text_p1),
                        stringResource(R.string.jetpack_content_text_p2)
                    )
                }
            }
        }
    }
}

@Composable
fun LearnTogetherText(title : String, textContentP1: String, textContentP2: String, modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
    ){
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 16.dp, end = 16.dp)
        )
        Text(
            text = textContentP1,
            modifier = Modifier.padding(top = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = textContentP2,
            modifier = Modifier.padding(top = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun LearnTogetherPainelImage(title : String, textContentP1: String, textContentP2: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Column{
        Image(
            painter = image,
            contentDescription = null
        )
        LearnTogetherText(title = stringResource(R.string.jetpack_compose_title),
            textContentP1 = stringResource(id = R.string.jetpack_content_text_p1) ,
            textContentP2 = stringResource(id = R.string.jetpack_content_text_p2)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun LearnTogetherAppPreview() {
    LearnTogetherAppTheme {
        LearnTogetherPainelImage(stringResource(R.string.jetpack_compose_title),
            stringResource(R.string.jetpack_content_text_p1),
            stringResource(id = R.string.jetpack_content_text_p2)
        )
    }
}