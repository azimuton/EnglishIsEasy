package com.azimuton.data.storage.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.azimuton.data.storage.models.LearnedWordEntity
import com.azimuton.domain.models.LearnedWord

@Dao
interface LearnedWordsDao {

    @Query("SELECT * FROM learnedwords")
    fun getAll(): List<LearnedWordEntity>

    @Query("SELECT  COUNT(DISTINCT id) as count FROM learnedwords")
    fun count(): Int

    @Query("SELECT * FROM learnedwords  ORDER BY RANDOM() LIMIT 1")
    fun randoms() : LearnedWordEntity

    @Insert
    suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    @Delete
    fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)

}