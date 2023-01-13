package com.azimuton.data.storage.room.dao


import androidx.room.*
import com.azimuton.data.storage.models.WordEntity

@Dao
interface WordDao {

    @Query("SELECT * FROM word")
    fun getAll(): List<WordEntity>

    @Transaction
    @Query("INSERT INTO learnedwords SELECT * FROM word")
    fun copy()

    @Query("DELETE FROM word")
    fun deleteAll()

    @Insert
    suspend fun insertWord(wordEntity: WordEntity)

    @Delete
    suspend fun deleteWord(wordEntity: WordEntity)

    @Update
    fun updateWord(wordEntity: WordEntity)

    @Query("SELECT * FROM word WHERE id = :id")
    fun getWordById(id: Int): WordEntity?

}