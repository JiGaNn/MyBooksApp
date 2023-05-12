package com.example.mybooksapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mybooksapp.databinding.CardCellBinding

class CardAdapter(
    private val books: List<Book>,
    private val clickListener: BookClickListener
    ) : RecyclerView.Adapter<CardViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = CardCellBinding.inflate(from, parent, false)
        return CardViewHolder(binding, clickListener)
    }

    override fun getItemCount() = books.size

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindBook(books[position])
    }
}