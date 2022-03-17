package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.timplifier.kotlin1lesson1.data.local.client.BooksClient
import com.timplifier.kotlin1lesson1.domain.models.BookModel

class SharedViewModel : ViewModel() {
    val description = MutableLiveData<String>()


    fun getBooks(): List<BookModel> {
        return BooksClient().getBooks()
    }

    fun putDescription(text: String) {
        description.value = text
    }


}