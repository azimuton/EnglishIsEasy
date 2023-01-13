package com.azimuton.data.storage

import com.azimuton.data.storage.models.LearnedWordEntity


interface LearnedWordsStorage {

    fun getAll(): List<LearnedWordEntity>

    suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)
}