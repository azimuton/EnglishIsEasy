package com.azimuton.data.storage

import com.azimuton.data.storage.models.LearnedWordEntity


interface LearnedWordsStorage {

    fun getAll(): List<LearnedWordEntity>

    fun randoms() : LearnedWordEntity

    fun insertLearnedWord(learnedWordEntity: LearnedWordEntity)

    fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity)
}