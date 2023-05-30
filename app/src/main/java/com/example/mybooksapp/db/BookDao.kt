package com.example.mybooksapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BookDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addBook(book: Book)

    @Delete
    suspend fun deleteBook(book: Book)

    @Query("SELECT * FROM book_table")
    fun readAllData(): LiveData<List<Book>>

}