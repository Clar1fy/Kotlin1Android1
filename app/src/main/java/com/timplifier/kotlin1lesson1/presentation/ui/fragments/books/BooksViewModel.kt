package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.lifecycle.ViewModel
import com.timplifier.kotlin1lesson1.domain.models.BookModel

class BooksViewModel (
) : ViewModel() {


    fun getBooks(list: List<BookModel>): List<BookModel> = list



}