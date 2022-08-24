package com.example.mycomposeapp

import android.content.Context
import android.widget.Toast
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
class ProfileFile
{

}*/
@Composable
fun profilePage() {
    Card(
        elevation = 6.dp, modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 100.dp, bottom = 100.dp, start = 16.dp, end = 16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),

            verticalArrangement = Arrangement.Center

        ) {



            Image(
                painter = painterResource(id = R.drawable.download),
                contentDescription = "dogName",

                modifier = Modifier
                    .size(200.dp)
                    .clip(CircleShape)
                    .border(
                        width = 2.dp,
                        color = Color.Red, shape = CircleShape
                    ),

                contentScale = ContentScale.Crop
            )
            Text(text = "Android")
            Text(text = "Compose")

            Row(


                modifier = Modifier
                    .fillMaxWidth()

                    .padding(16.dp),

                horizontalArrangement = Arrangement.Center

            ) {
                ProfileState(count = "150", title = "Followers")
                Spacer(modifier = Modifier.width(20.dp))
                ProfileState(count = "100", title = "Following")
                Spacer(modifier = Modifier.width(20.dp))
                ProfileState(count = "30", title = "Posts")
            }
            val context= LocalContext.current

            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            )
            {


                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Follow User")
                }
                Button(onClick = {

                    Toast.makeText(context,"he",Toast.LENGTH_SHORT).show()
                }) {
                    Text(text = "Direct Message")
                }


                /*Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text = "150", fontWeight = FontWeight.Bold)
                    Text(text = "Followers")

                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = "100", fontWeight = FontWeight.Bold)
                    Text(text = "Following ")

                }
    */

            }


        }


    }




}


@Composable
fun ProfileState(count: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)

    }
}


@Preview(showBackground = true)
@Composable
fun ProfilePagePreview() {
    profilePage()
}
