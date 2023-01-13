package com.azimuton.data.storage.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.storage.models.LearnedWordEntity

@Dao
interface LearnedWordsDao {

    @Query("SELECT * FROM learnedwords")
    fun getAll(): List<LearnedWordEntity>

    @Insert
    suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    @Delete
    suspend fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)

}