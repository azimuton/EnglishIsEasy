package com.azimuton.domain.repository.roomrepository

import com.azimuton.domain.models.LearnedWord

interface LearnedWordsRepository {

    fun getAll(): List<LearnedWord>

    suspend fun insertLearnedWord(learnedWord : LearnedWord)

    fun deleteLearnedWord(learnedWord : LearnedWord)

}