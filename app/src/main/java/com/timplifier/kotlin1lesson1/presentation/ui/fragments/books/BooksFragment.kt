package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kotlin1lesson1.R
import com.timplifier.kotlin1lesson1.data.local.client.BooksClient
import com.timplifier.kotlin1lesson1.databinding.FragmentBooksBinding
import com.timplifier.kotlin1lesson1.domain.interfaces.OnItemClickListener
import com.timplifier.kotlin1lesson1.domain.models.BookModel
import com.timplifier.kotlin1lesson1.presentation.base.BaseFragment
import com.timplifier.kotlin1lesson1.presentation.ui.adapters.BooksAdapter

class BooksFragment : BaseFragment<FragmentBooksBinding>(
    R.layout.fragment_books
), OnItemClickListener<BookModel> {
    override val binding: FragmentBooksBinding by viewBinding(FragmentBooksBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    private val adapter = BooksAdapter(this)

    override fun initAdapter() {
        adapter.setList(BooksClient().getBooks())
        binding.recyclerview.adapter = adapter

    }

    override fun onClick(model: BookModel, position: Int) {
        findNavController().navigate(
            BooksFragmentDirections.actionBooksFragmentToBooksDetailsFragment(
                model.description, model.title
            )
        )

    }


}