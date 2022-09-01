package com.example.statesandcomposition

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.statesandcomposition.ui.theme.StatesAndCompositionTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StatesAndCompositionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val context= LocalContext.current
                    HomeAppBar(title = "Infinity Learn",
                        openSearch = {Toast.makeText(context,"App bar",Toast.LENGTH_LONG).show()  }) {

                    }
                    SampleDemo()
                    //Greeting("Android")
                   // HelloContent()
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
    StatesAndCompositionTheme {
        Greeting("Android")
    }
}
@Composable
fun HelloContent() {
    var name by remember { mutableStateOf("") }
    Column(modifier = Modifier.padding(16.dp)) {

        if (name.isNotEmpty()) {
            Text(
                text = "Hello!",
                modifier = Modifier.padding(bottom = 8.dp),
                style = MaterialTheme.typography.h5
            )
        }


        OutlinedTextField(
            value = "",
            onValueChange = { name = it },
            label = { Text("Name") }
        )
    }
}

@Preview
@Composable
fun ShowText(){

    HelloContent()
}
interface MutableState<T> : State<T> {
    override var value: T
}
@Composable
fun HomeAppBar(title: String, openSearch: () -> Unit, openFilters: () -> Unit) {
    TopAppBar(
        title = { Text(text = title, color = Color.White) },
        backgroundColor = Color(0xFF442F37),
        actions = {
            IconButton(onClick = openSearch) {
                Icon(
                    imageVector = Icons.Filled.Search,
                    contentDescription = "Search",
                    tint = Color.White
                )
            }

            IconButton(onClick = openFilters) {
                Icon(
                    imageVector = Icons.Filled.List,
                    contentDescription = "Filter",
                    tint = Color.White
                )
            }
        }
    )
}
@Preview
@Composable
fun SampleDemo(){
    var expanded by remember {
        mutableStateOf(false)
    }
    Card {
Column(modifier = Modifier.clickable { expanded=!expanded })
{
//    Image(R.drawable.compose, contentDescription = "composeimg")
    Image(painterResource(R.drawable.compose),"content description")
    AnimatedVisibility(expanded) {
        Text(text = "Jetpack Compose",
        style = MaterialTheme.typography.h2)
        
    }
    
}
    }
}










@Preview(showBackground = true)
@Composable
fun HomeAppBarPreview() {
    HomeAppBar(
        title = "EpicWorld",
        openSearch = {},
        openFilters = {}
    )
}