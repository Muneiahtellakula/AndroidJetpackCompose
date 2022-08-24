package com.example.composeex2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeex2.ui.theme.ComposeEx2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            DemoText()
            Text()
            /*ComposeEx2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {

                    showName("Android Composer")
                    // showGreeting(names = )

                }
            }*/
        }
    }
}


@Composable
fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .background(Color(0xF00FA000))
            .size(200.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
Button(
    modifier =
    Modifier.background(Color(0xFFFFA000)
    ),
    onClick = { /*TODO*/ }

) {
    
}
        
        Text(
            text = "Hello $name!",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//    ComposeEx2Theme {
    Greeting("Android")
//    }
}

@Composable
fun showName(name: String) {
    Text(text = "Hello composer $name")
}

@Composable
fun showGreeting(names: List<String>) {
    for (name in names) {
        Text("Hello $names")

    }
}
