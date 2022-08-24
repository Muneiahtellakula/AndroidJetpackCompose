package com.example.composetest

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composetest.repo.PersonRepo
import com.example.composetest.ui.theme.ComposeTestTheme
import com.example.composetest.ui.theme.Shapes
import kotlin.text.Typography.section

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
              /* val personRepo=PersonRepo()
                val getAllData=personRepo.getAllData()*/

                abc()
                   /* /*items(items = getAllData){
                        person-> CustomItem(person = person)*/
                    itemsIndexed(
                        items = getAllData,
                        key = {
                            index, person -> person.id
                        }
                    ){
                            index,person->
                        Log.d("MainActivity",index.toString())
                        CustomItem(person = person)

                }*/
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
    ComposeTestTheme {
        Greeting("Android")
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun abc(){

    val sections = listOf("A", "B", "C", "D", "E", "F", "G")
    val sprefarene:SharedPreferences
    val spEdit:SharedPreferences.Editor
    LazyColumn(
        contentPadding = PaddingValues(all=12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp), modifier = Modifier.background(
            color = Color.Yellow))
    {

        sections.forEach {  n ->
                        Log.d("Main",n.toString())
            stickyHeader {

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp)
                        .clickable {
                            Log.d("Main", n.toString()) },
                    text = n)
            }
           
            items(10){

                Text(modifier = Modifier
                    .padding(12.dp)
                    .clickable {
                        Log.d("Main", n.toString()) },
                    text = "Item$it from the $n")
            }
        }
    }
}