package com.azimuton.data.storage.room.dao

import androidx.room.*
import com.azimuton.data.storage.models.WordEntity

@Dao
interface WordDao {

    @Query("SELECT * FROM word")
    fun getAll(): List<WordEntity>

//    @Transaction
    //    @Query("INSERT INTO learnedwords SELECT * FROM word LIMIT 1")
//    fun copy()

    @Query("DELETE FROM word")
    fun deleteAll()

    @Insert
    fun insertWord(wordEntity: WordEntity)

    @Delete
    fun deleteWord(wordEntity: WordEntity)

    @Update
    fun updateWord(wordEntity: WordEntity)

    @Query(" SELECT * FROM Word WHERE id = :id")
    fun getWordById(id: Int): WordEntity?

}