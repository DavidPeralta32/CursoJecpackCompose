package com.example.mynewcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mynewcompose.ui.theme.MyNewComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNewComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyBox()
                }
            }
        }
    }
}


@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Box(modifier = Modifier
            .width(200.dp)
            .height(200.dp)
            .background(Color.Cyan)
            .verticalScroll(
                rememberScrollState()
            ), contentAlignment = Alignment.Center
        ){
            Text("esto es un ejemplo")
        }
    }
}

@Composable
fun MyColum(){
    Column(
        Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()), verticalArrangement = Arrangement.SpaceBetween) {
        Text("ejemplo 1", modifier = Modifier
            .background(Color.Red)
            .fillMaxWidth())
        Text("ejemplo 2", modifier = Modifier.background(Color.Black))
        Text("ejemplo 3", modifier = Modifier.background(Color.Cyan))
        Text("ejemplo 4", modifier = Modifier.background(Color.Yellow))
    }

}

@Composable
fun MyRow(){
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()))
    {
        Text(text = "Holaa 1", modifier = Modifier.width(100.dp))
        Text(text = "Holaa 2", modifier = Modifier.width(100.dp))
        Text(text = "Holaa 3", modifier = Modifier.width(100.dp))
        Text(text = "Holaa 4", modifier = Modifier.width(100.dp))
        Text(text = "Holaa 5", modifier = Modifier.width(100.dp))
        Text(text = "Holaa 6", modifier = Modifier.width(100.dp))
    }
}



@Composable
fun MiCaja2(mensaje:String){
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
        Box(modifier = Modifier.background(Color.Red)){
            Text("${mensaje} esta es mi segunda caja")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyNewComposeTheme {
        MyRow()
    }
}