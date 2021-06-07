package com.ys

import android.content.Intent
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
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold(
        content = {
            HomeContent(navigateToProfile = navigateToProfile)
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AdoptionpuppiesTheme {
        MyApp {}
    }
}