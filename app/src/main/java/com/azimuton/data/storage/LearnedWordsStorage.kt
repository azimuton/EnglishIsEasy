package com.azimuton.data.storage

import com.azimuton.data.storage.models.LearnedWordEntity


interface LearnedWordsStorage {

    fun getAll(): List<LearnedWordEntity>

    suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    suspend fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)
}