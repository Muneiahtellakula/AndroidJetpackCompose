package com.example.myfirstscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstscreen.ui.theme.MyFirstScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstScreenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SimpleTextPreview()
                    //Greeting("Android")
                   // Thermodynamics()
                }
            }
        }
    }

/*@Preview
@Composable
fun Thermodynamics(){
    Column() {

            Text(text = "5:30 Pm . 15th June, 2022 .180 mins",)
           Row(modifier = Modifier.padding(16.dp)) {
               Text(text = "Time Taken:---- ",fontSize = 18.sp, color = Color.LightGray)
               Text(text = "Score:----/750",fontSize = 18.sp, color = Color.LightGray)


           }
        Text(text = "VIEW RESULT")


    }

}*/
/*

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyFirstScreenTheme {
        Greeting("Android")
    }
}*/
@Composable
fun SimpleTextPreview(displayText: String){
    Text(text =displayText)
}

@Preview
@Composable
fun SimpleTextPreview(){
    SimpleTextPreview(displayText = "I am Learning Compose")
}
}