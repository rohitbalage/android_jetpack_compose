package com.rrbofficial.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.rrbofficial.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                )

                {
                    Column{
                        Greeting("Android")
                        DisplayOurText()
                    }
                }

            }
        }
    }
}

@Composable
fun DisplayOurText()
{
    // TO display text from string resource
// Text(text = stringResource(id = R.string.text_src) )


    // selectionContainer will enable copy the text in app
    SelectionContainer{

        Text(text = "HELLO EVERYONE \n WELCOME TO THE JETPACK APP"
            ,
            color = Color.Blue,
            fontSize = 20.sp,
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
            ,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            lineHeight = 22.sp,
            letterSpacing = 10.sp,
            fontFamily = FontFamily.Cursive,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeTheme {
        Greeting("Android")
        DisplayOurText()
    }
}