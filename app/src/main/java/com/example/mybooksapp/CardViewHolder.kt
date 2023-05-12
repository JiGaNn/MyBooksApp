package com.example.mybooksapp

import androidx.recyclerview.widget.RecyclerView
import com.example.mybooksapp.databinding.CardCellBinding

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: BookClickListener
    ) : RecyclerView.ViewHolder(cardCellBinding.root)
{
        fun bindBook(book: Book) {
            cardCellBinding.cover.setImageResource(book.cover)
            cardCellBinding.author.text = book.author
            cardCellBinding.title.text = book.title

            cardCellBinding.cardView.setOnClickListener{
                clickListener.onClick(book)
            }
        }
}