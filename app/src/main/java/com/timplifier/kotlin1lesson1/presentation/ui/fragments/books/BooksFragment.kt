package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kotlin1lesson1.R
import com.timplifier.kotlin1lesson1.databinding.FragmentBooksBinding
import com.timplifier.kotlin1lesson1.domain.models.BookModel
import com.timplifier.kotlin1lesson1.presentation.base.BaseFragment
import com.timplifier.kotlin1lesson1.presentation.ui.adapters.BooksAdapter

class BooksFragment : BaseFragment<FragmentBooksBinding>(
    R.layout.fragment_books
) {
    override val binding: FragmentBooksBinding by viewBinding(FragmentBooksBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    private val adapter = BooksAdapter { BookModel, position -> onClick(BookModel, position) }

    override fun setupViews() {
        initAdapter()
    }

    private fun initAdapter() {
        adapter.setList(viewModel.getBooks())
        binding.recyclerview.adapter = adapter

    }

    private fun onClick(model: BookModel, position: Int) {
        findNavController().navigate(
            BooksFragmentDirections.actionBooksFragmentToBooksDetailsFragment(
                model
            )
        )

    }


}