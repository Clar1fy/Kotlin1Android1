package com.timplifier.kotlin1lesson1.presentation.ui.fragments.books

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.kotlin1lesson1.R
import com.timplifier.kotlin1lesson1.databinding.FragmentBooksDetailsBinding
import com.timplifier.kotlin1lesson1.presentation.base.BaseFragment

class BooksDetailsFragment : BaseFragment<FragmentBooksDetailsBinding>(
    R.layout.fragment_books_details
) {
    override val binding: FragmentBooksDetailsBinding by viewBinding(FragmentBooksDetailsBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    private val args: BooksDetailsFragmentArgs by navArgs()


    override fun getArgs() {
        binding.tvTitle.text = args.titleFromBooksFragmentToDetails
        binding.tvDescription.text = args.descriptionlFromBooksFragment
    }


}