package com.timplifier.kotlin1lesson1.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kotlin1lesson1.databinding.ItemBooksBinding
import com.timplifier.kotlin1lesson1.domain.models.BookModel

class BooksAdapter(
    val onItemClickListener: (title: String, image: Int, position: Int) -> Unit

)

 : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {
    val list = ArrayList<BookModel>()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): BooksAdapter.BooksViewHolder {
        return BooksViewHolder(
            ItemBooksBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BooksAdapter.BooksViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    fun setList(list: ArrayList<BookModel>) {
        list.addAll(list)
    }

    override fun getItemCount(): Int = list.size

    inner class BooksViewHolder(val binding: ItemBooksBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(bookModel: BookModel) = with(binding) {
            tvBooks.text = bookModel.title
            imBooks.setImageResource(bookModel.image)
            binding.root.setOnClickListener {
                onItemClickListener(bookModel.title, bookModel.image, absoluteAdapterPosition)
            }


        }


    }
}