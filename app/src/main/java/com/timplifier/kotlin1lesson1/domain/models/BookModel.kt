package com.timplifier.kotlin1lesson1.domain.models

import java.io.Serializable

data class BookModel(
    val title: String,
    val description: String,
    val image: Int
) : Serializable