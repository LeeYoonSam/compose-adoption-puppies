package com.ys

import java.io.Serializable

data class Puppy(
    val id: Int,
    val title: String,
    val description: String,
    val puppyImageId: Int = 0
) : Serializable