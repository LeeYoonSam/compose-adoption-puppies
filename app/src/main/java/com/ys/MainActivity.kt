package com.ys

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ys.ui.theme.AdoptionpuppiesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AdoptionpuppiesTheme {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    Scaffold(
        content = {
            HomeContent()
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdoptionpuppiesTheme {
        MyApp()
    }
}