package com.example.recyclerviewincompose

import android.R
import android.os.Build.VERSION_CODES.M
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
import com.example.recyclerviewincompose.ui.theme.RecyclerViewInComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerViewInComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //Greeting("Android")
                    EmployeeCard(  
                        EmployDetails(id = 1,
                            title = "Rohan",
                            sex = "Male",
                            age = 24,
                            description = " Don't judge each day by the harvest you reap but by the seeds that you plant.” - ...",
                            ImageId = R.drawable.alert_dark_frame)
                    )
                    //EmployDetails(32,"Muni","M",23,"hyd",2342)
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
    RecyclerViewInComposeTheme {
        Greeting("Android")
    }
}