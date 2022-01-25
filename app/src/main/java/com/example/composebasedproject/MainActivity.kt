package com.example.composebasedproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasedproject.ui.theme.ComposeBasedProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasedProjectTheme {

            }
        }
    }
}

@ExperimentalMaterialApi
@Composable
private fun MyHomeScreen(){
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberBackdropScaffoldState(initialValue = BackdropValue.Concealed)
    BackdropScaffold(
        scaffoldState = scaffoldState,
        appBar = {
           TopAppBar(
               title = { Text("",fontSize = 16.sp)},
           )
        },
        backLayerContent = {
            Box() {

            }
        },
        frontLayerContent = {
            Box() {

            }
        }
    ) {

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeBasedProjectTheme {

    }
}