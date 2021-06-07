package com.ys

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import com.ys.ui.theme.AdoptionpuppiesTheme

class ProfileActivity : AppCompatActivity() {
    private val puppy: Puppy by lazy {
        intent?.getSerializableExtra(PUPPY_ID) as Puppy
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AdoptionpuppiesTheme {
                Text(text = "Hello ${puppy.title}")
            }
        }
    }

    companion object {
        private const val PUPPY_ID = "puppy_id"

        fun newIntent(context: Context, puppy: Puppy) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(PUPPY_ID, puppy)
            }
    }
}