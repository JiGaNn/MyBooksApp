package com.example.mybooksapp.fragments

import android.os.Bundle
import android.view.KeyEvent
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.mybooksapp.db.Book
import com.example.mybooksapp.BookClickListener
import com.example.mybooksapp.CardAdapter
import com.example.mybooksapp.MAIN
import com.example.mybooksapp.R
import com.example.mybooksapp.databinding.FragmentDbBinding
import com.example.mybooksapp.db.BookViewModel

class DbFragment : Fragment(), BookClickListener {

    private lateinit var bookViewModel: BookViewModel
    private lateinit var binding: FragmentDbBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDbBinding.inflate(layoutInflater, container, false)

        bookViewModel = ViewModelProvider(this)[BookViewModel::class.java]

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val main = this

        bookViewModel.readAllData.observe(viewLifecycleOwner, Observer { book ->
            binding.dbRecyclerView.apply {
                layoutManager = GridLayoutManager(view.context, 2)
                adapter = CardAdapter(book, main, bookViewModel)
            }
        })
    }

    override fun onClick(book: Book) {
        val bundle = Bundle()
        bundle.putInt("bookID", book.listId)
        MAIN.navController.navigate(R.id.action_dbFragment_to_detailFragment, bundle)
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