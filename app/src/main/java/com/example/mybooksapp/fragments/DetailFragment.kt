package com.example.mybooksapp.fragments

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mybooksapp.db.Book
import com.example.mybooksapp.MAIN
import com.example.mybooksapp.db.bookList
import com.example.mybooksapp.databinding.FragmentDetailBinding
class DetailFragment : Fragment() {

    private lateinit var binding: FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bookID = arguments?.getInt("bookID")
        val book = bookFromID(bookID!!)
        if(book != null) {
            binding.cover.setImageResource(book.cover)
            binding.title.text = book.title
            binding.author.text = book.author
            binding.description.text = book.description
        }
    }

    private fun bookFromID(bookID: Int): Book? {
        for(book in bookList) {
            if(book.listId == bookID)
                return book
        }
        return null
    }
    override fun onResume() {
        super.onResume()
        requireView().isFocusableInTouchMode = true
        requireView().requestFocus()
        requireView().setOnKeyListener { _, keyCode, _ ->
            if (keyCode == KeyEvent.KEYCODE_BACK) {
                MAIN.navController.popBackStack()
                true
            } else false
        }
    }
}