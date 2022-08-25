package com.example.textfieldsjetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import com.example.textfieldsjetpackcompose.ui.theme.TextFieldsJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldsJetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center)
    {
        var text by remember {
            mutableStateOf("Type here..")
        }
        OutlinedTextField(value = text, onValueChange = {
                newText -> text=newText
        }, label = {
            Text(text = "Hint Text")},
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Email, contentDescription ="email_icon" )

                }
            }, trailingIcon = {
                IconButton(onClick = {
                    Log.d("TrailingICon","clicked") }) {
                    Icon(imageVector = Icons.Default.Check, contentDescription ="email_icon" )

                }
            }, keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email, imeAction = ImeAction.Search
            ), keyboardActions = KeyboardActions(
                onSearch = {
                    Log.d("KeyboardSearch","Search clicked")
                }
            )

        )
        /*singleLine = true
        * maxLines = 2
        *
        * */
        
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFieldsJetpackComposeTheme {
        Greeting()
    }
}