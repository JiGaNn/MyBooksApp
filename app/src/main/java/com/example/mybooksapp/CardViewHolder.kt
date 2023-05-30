package com.example.mybooksapp

import androidx.recyclerview.widget.RecyclerView
import com.example.mybooksapp.databinding.CardCellBinding
import com.example.mybooksapp.db.Book
import com.example.mybooksapp.db.BookViewModel

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener,
    private val bookViewModel: BookViewModel
    ) : RecyclerView.ViewHolder(cardCellBinding.root)
{
    fun bindBook(book: Book) {
        cardCellBinding.cover.setImageResource(book.cover)
        cardCellBinding.author.text = book.author
        cardCellBinding.title.text = book.title

        if(book.isLiked)
            cardCellBinding.like.setImageResource(R.drawable.heart_active)
        else
            cardCellBinding.like.setImageResource(R.drawable.heart_passive)


        cardCellBinding.like.setOnClickListener {
            if(book.isLiked) {
                book.isLiked = false
                cardCellBinding.like.setImageResource(R.drawable.heart_passive)
                bookViewModel.deleteBook(book)
            } else {
                book.isLiked = true
                cardCellBinding.like.setImageResource(R.drawable.heart_active)
                bookViewModel.addBook(book)
            }
        }
        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(book)
        }
    }
}