package com.example.composedemo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composedemo.ui.theme.ComposeDemoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeDemoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    showText()
                    val painter1= painterResource(id = R.drawable.ic_launcher_background)
                    val description="android head"
                    val title="Head of the android"
                    ImageCard(
                        painter = painter1,
                        contentDescription = description,
                        title =title )
                    //Greeting("Android")
                    /* Row(
                         modifier = Modifier
                             .width(300.dp)
                             .height(300.dp)
                             .background(Color.DarkGray),
                         horizontalArrangement = Arrangement.SpaceAround,
                         verticalAlignment = Alignment.CenterVertically
                     ) {
                         Text(text = "Hello")
                         Text(text = "Android")
                         Text(text = "World")
                     }
 */
                }
            }
        }
    }
}

/*
@Composable
fun Greeting(name: String) {
  //  Text(text = "Hello $name!")

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeDemoTheme {
        Greeting("Android")
    }
}
*/

@Preview
@Composable
fun showText() {
    Column(
        modifier = Modifier
            .background(Color.Green)
            .requiredHeight(200.dp)
            .fillMaxWidth()
            .border(5.dp, Color.Magenta)
            .padding(5.dp)
            .border(5.dp, Color.Blue)
            .padding(5.dp)
            .border(10.dp, Color.Red)
            .padding(10.dp), Arrangement.SpaceBetween, Alignment.CenterHorizontally
    )

    {
        Text(
            text = "welcome",
            modifier = Modifier
                .border(
                    5.dp, Color.Yellow
                )
                .padding(5.dp)
                .offset(20.dp, 20.dp)
                .border(1.dp, Color.Black)
                .padding(30.dp)
                .border(5.dp, Color.White)
                .padding(5.dp)

        )
        val context = LocalContext.current
        Text(
            text = "infinityLearn",
            modifier = Modifier.clickable {
                Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show()
            },


            )

    }


}

@Composable
fun ImageCard(
    painter: Painter,
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
    ) {
        Box(modifier = Modifier.height(200.dp)){
            Image(
                painter = painter, contentDescription = contentDescription,
                contentScale =ContentScale.Crop

            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(12.dp),
                contentAlignment = Alignment.BottomStart){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))
            }


        }


    }
}