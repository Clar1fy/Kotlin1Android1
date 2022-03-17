package com.timplifier.kotlin1lesson1.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.kotlin1lesson1.databinding.ItemBooksBinding
import com.timplifier.kotlin1lesson1.domain.interfaces.OnItemClickListener
import com.timplifier.kotlin1lesson1.domain.models.BookModel

class BooksAdapter(
    private val onItemClickListener: OnItemClickListener<BookModel>
)

    : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {
    private var list: List<BookModel> = arrayListOf()


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

    fun setList(list: List<BookModel>) {
        this.list = list
        notifyDataSetChanged()
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class BooksViewHolder(private val binding: ItemBooksBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(bookModel: BookModel) {
            binding.tvBooks.text = bookModel.title
            binding.imBooks.setImageResource(bookModel.image)
            binding.root.setOnClickListener {
                onItemClickListener.onClick(bookModel, absoluteAdapterPosition)
            }


        }


    }


}