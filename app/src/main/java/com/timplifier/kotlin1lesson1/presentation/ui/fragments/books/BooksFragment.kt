package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kotlin1lesson1.R
import com.timplifier.kotlin1lesson1.data.local.client.BooksClient
import com.timplifier.kotlin1lesson1.databinding.FragmentBooksBinding
import com.timplifier.kotlin1lesson1.presentation.base.BaseFragment
import com.timplifier.kotlin1lesson1.presentation.ui.adapters.BooksAdapter

class BooksFragment : BaseFragment<FragmentBooksBinding>(
    R.layout.fragment_books
) {
    override val binding: FragmentBooksBinding by viewBinding(FragmentBooksBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    val adapter = BooksAdapter(this::onItemClickListener)

    override fun initListeners() {

    }

    override fun initAdapter() = with(binding) {
        adapter.setList(BooksClient().getBooks())
        recyclerview.adapter = adapter
    }

    private fun onItemClickListener(title: String, image: Int, position: Int) {
        findNavController().navigate(R.id.booksDetailsFragment)

    }

}