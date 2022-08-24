package com.example.composeex2

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.compose.ui.text.font.FontWeight
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

@Preview(showBackground = true, backgroundColor = 0xFFFFFFFF)
@Composable
fun DemoText() {

    val context = LocalContext.current

   // var count by remember { mutableStateOf(0) }
    var count by rememberSaveable { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .size(400.dp)
            .background(Color.Yellow),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {


        Button(onClick = {
            Toast.makeText(context,"Hello jitpack compose",Toast.LENGTH_SHORT).show()
            Toast.makeText(context, "$count", Toast.LENGTH_SHORT).show()
        }
        ) {
            Text(text = "Toast", fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
        }

        Text(text = "$count", fontWeight = FontWeight.SemiBold, fontSize = 100.sp)

        Row() {

            Button( onClick = { count += 1 } ) {
                Text(text = "+1", fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
            }

            // Spacer will give space between '+1' and '-1' button
            Spacer(modifier = Modifier.width(16.dp))

            Button( onClick = { count -= 1 } ) {
                Text(text = "-1", fontWeight = FontWeight.SemiBold, fontSize = 12.sp)
            }

        }

    }
}