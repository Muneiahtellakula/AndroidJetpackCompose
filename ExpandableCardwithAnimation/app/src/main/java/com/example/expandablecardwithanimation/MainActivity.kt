package com.example.expandablecardwithanimation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.expandablecardwithanimation.ui.theme.ExpandableCardwithAnimationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExpandableCardwithAnimationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                   // Greeting("Android")
                    ExandableCard(
                        title = "My Title",
                        descrption = "t is an important property of pyMOR’s interfaces that each method either returns\n" +
                                "low-dimensional data or new VectorArray, Operator or Discretization objects. This\n" +
                                "ensures that no high-dimensional data ever has to be communicated between the external\n" +
                                "solver and pyMOR and that no code for handling the solver-specific high-dimensional data\n" +
                                "structures has to be added to pyMOR."
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExpandableCardwithAnimationTheme {
       // Greeting("Android")
        ExandableCard(
            title = "Infinity learn",
            descrption = "t is an important property of pyMOR’s interfaces that each method either returns\n" +
                    "low-dimensional data or new VectorArray, Operator or Discretization objects. This\n" +
                    "ensures that no high-dimensional data ever has to be communicated between the external\n" +
                    "solver and pyMOR and that no code for handling the solver-specific high-dimensional data\n" +
                    "structures has to be added to pyMOR."
        )
    }
}