package com.example.mycomposeapp

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//
//class AlertDialogshow {

@Composable
    fun ClickableText(){
        var showPopup by remember { mutableStateOf(false) }
        Column(Modifier.clickable(onClick = { showPopup = true }), content = {
            // You can think of Modifiers as implementations of the decorators pattern that are used to
            // modify the composable that its applied to. In the example below, we add a padding of
            // 8dp to the Card composable and 16dp to the Text composable.
            Card(
                shape = RoundedCornerShape(4.dp), modifier = Modifier.padding(8.dp),
                backgroundColor = androidx.compose.ui.graphics.Color.LightGray
            ) {
                // The Text composable is pre-defined by the Compose UI library; you can use this
                // composable to render text on the screen
                Text(
                    text = "Click to see dialog", modifier = Modifier.padding(16.dp),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily.Serif
                    )
                )
            }
        })
        val onPopupDismissed = { showPopup = false }
        if (showPopup) {
            // Predefined composable provided by the material implementations of Jetpack Compose. It
            // shows a simple alert dialog on the screen if this code path is executed (i.e showPopup
            // variable is true)
            AlertDialog(
                onDismissRequest = onPopupDismissed,
                text = {
                    Text("Congratulations! You just clicked the text successfully")
                },
                confirmButton = {
                    // Button is a pre-defined Material Design implementation of a contained button -
                    // https://material.io/design/components/buttons.html#contained-button.
                    Button(
                        onClick = onPopupDismissed
                    ) {
                        // The Button composable allows you to provide child composables that inherit
                        // this button functionality.
                        // The Text composable is pre-defined by the Compose UI library; you can use this
                        // composable to render text on the screen
                        Text(text = "Ok")
                    }
                })
        }
    }

@Preview
@Composable
fun MyTextField(
) {
    val context = LocalContext.current

    var textValue = remember { mutableStateOf("") }

    Column(

    ) {
        Button(
            onClick = {
                Toast.makeText(context,"${textValue.value}",Toast.LENGTH_SHORT).show()
            },
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.purple_200)),
            border = BorderStroke(
                1.dp,
                color = colorResource(id = R.color.purple_200)
            )
        ) {
            Text(
                text = stringResource(id = R.string.button_text),
                color = androidx.compose.ui.graphics.Color.White
            )
        }
        TextField(
            value = textValue.value,
            onValueChange = {
                textValue.value = it
            },
            label = {}
        )

    }



}



@Preview
@Composable
fun MyButton() {
//    val context = LocalContext.current
//    var textValue=""
   /* Button(
        onClick = {
                  Toast.makeText(context,"hello$textValue",Toast.LENGTH_SHORT).show()
        },
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.purple_200)),
        border = BorderStroke(
            1.dp,
            color = colorResource(id = R.color.purple_200)
        )
    ) {
        Text(
            text = stringResource(id = R.string.button_text),
            color = androidx.compose.ui.graphics.Color.White
        )
    }*/
}





@Preview
@Composable
fun ClickableTextPreview(){
Column {
    ClickableText()
}
}
//}