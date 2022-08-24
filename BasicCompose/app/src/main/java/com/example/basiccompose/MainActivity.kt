package com.example.basiccompose

import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()
            ) {
                ButtonDemo()
                CustomButton()
            }
            // BoxExample()
           // ButtonDemo()

        }

    }
}

@Preview
@Composable
fun BoxExample() {
    Box(
        modifier = Modifier
            .background(color = Color.Green)
            .size(180.dp, 300.dp)
    ) {

        Box(
            modifier = Modifier
                .background(color = Color.Yellow)
                .size(125.dp, 100.dp)
                .align(Alignment.TopEnd)
        ) {
        }

        Text(
            text = "Hi",
            style = MaterialTheme.typography.h3,
            modifier = Modifier
                .background(color = Color.White)
                .size(90.dp, 50.dp)
                .align(Alignment.BottomCenter)
        )
    }

}

/*Customizing Buttons.
Sometimes we would need to customize the buttons to compatible with the app’s theme.

In this example I have added content padding. Then a border of black color. And, I have also added background and content color using “colors” attribute.*/

@Preview
@Composable
fun CustomButton(){
    Button(onClick = { /*TODO*/ },
    contentPadding = PaddingValues(16.dp),
        border = BorderStroke(10.dp, Color.Black),
        colors = ButtonDefaults.textButtonColors(backgroundColor = Color.DarkGray,
        contentColor = Color.White
        )
        ) {
        Text(text = "Add to cart", style = MaterialTheme.typography.h3,
        modifier = Modifier.padding(5.dp))

    }
}

@Preview
@Composable
fun ButtonDemo() {
    val context= LocalContext.current
   Column(modifier = Modifier.fillMaxSize(),
       verticalArrangement = Arrangement.Center
   ,Alignment.CenterHorizontally)
   {
       Button(
           onClick = {
               Toast.makeText(context,"btn click",Toast.LENGTH_SHORT).show()
               /*TODO*/ }, enabled = true
       ) {
           Text(text = "Standard button")

       }
       TextButton(onClick = {
           Toast.makeText(context, "Clicked on Text Button", Toast.LENGTH_SHORT).show()
       }) {
           Text("  Text button ")
       }
       OutlinedButton(onClick = {
           Toast.makeText(context, "Clicked on Outlined Button", Toast.LENGTH_SHORT).show()
       /*TODO*/ }) {
           Text(text = "Outlined Button")

       }
       IconButton(onClick = { /*TODO*/
           Toast.makeText(context, "Clicked on Icon Button", Toast.LENGTH_SHORT).show()
       }) {
          Icon(Icons.Filled.AccountBox, contentDescription = "icon button",
              tint = Color.DarkGray,
              modifier = Modifier.size(80.dp)
          )

       }
       Button(onClick = {
           Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
                        /*TODO*/ },
           shape = CircleShape,
           contentPadding = PaddingValues(16.dp),
           border = BorderStroke(10.dp, Color.Black),
           colors = ButtonDefaults.textButtonColors(
               backgroundColor = Color.DarkGray,
               contentColor = Color.White,
         //  contentPadding = PaddingValues(16.dp),
          // border = BorderStroke(10.dp, Color.Black),
          // colors = ButtonDefaults.textButtonColors(backgroundColor = Color.DarkGray,
           //    contentColor = Color.White
           )
       ) {
           Text(text = "Add to cart", style = MaterialTheme.typography.h3,
               modifier = Modifier.padding(5.dp))

       }
   }


}


@Preview
@Composable
fun show() {
    Row(
        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxSize(),
        //horizontalArrangement = Arrangement.SpaceEvenly,
        //horizontalArrangement = Arrangement.End,
        //horizontalArrangement = Arrangement.Start,
        //horizontalArrangement = Arrangement.Center,
        // horizontalArrangement = Arrangement.SpaceAround,
        // horizontalArrangement = Arrangement.SpaceBetween,
        //verticalAlignment = Alignment.CenterVertically
        //verticalAlignment = Alignment.Bottom
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Greeting("AB")
        Greeting("CDEF")
        Greeting("G")
    }

}


@Composable
fun SetTextStyling(displayText: String, style: TextStyle? = null, maxLines: Int? = null) {
    Text(
        text = displayText,
        modifier = Modifier.padding(16.dp),
        style = style ?: TextStyle.Default,
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines ?: Int.MAX_VALUE
    )
}

@Composable
fun SimpleText(displayText: String) {
    Text(text = displayText)
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
        Greeting("Android")
    }


}
