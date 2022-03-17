package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.lifecycle.ViewModel
import com.timplifier.kotlin1lesson1.data.local.client.BooksClient
import com.timplifier.kotlin1lesson1.domain.models.BookModel

class BooksViewModel : ViewModel() {

    fun getBooks(): List<BookModel> {
        return BooksClient().getBooks()
    }

    fun getTitle(bookModel: BookModel): String {
        return bookModel.title

    }

    fun getDescription(bookModel: BookModel): String {
        return bookModel.description
    }


}