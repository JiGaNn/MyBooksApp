package com.example.mybooksapp

import com.example.mybooksapp.db.Book

interface BookClickListener {
    fun onClick(book: Book)
}