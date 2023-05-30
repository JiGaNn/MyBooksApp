package com.example.mybooksapp.db

import androidx.room.Entity
import androidx.room.PrimaryKey

var bookList = mutableListOf<Book>()
@Entity(tableName = "book_table")
data class Book(
    var cover: Int,
    var author: String,
    var title: String,
    var description: String,
    @PrimaryKey(autoGenerate = true)
    val listId: Int = bookList.size,
    var isLiked: Boolean = false
)