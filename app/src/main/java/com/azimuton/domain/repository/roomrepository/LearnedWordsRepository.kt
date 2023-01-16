package com.azimuton.domain.repository.roomrepository

import com.azimuton.data.storage.models.LearnedWordEntity
import com.azimuton.domain.models.LearnedWord

interface LearnedWordsRepository {

    fun getAll(): List<LearnedWord>

    fun randoms() : LearnedWordEntity

    fun insertLearnedWord(learnedWord : LearnedWord)

    fun deleteLearnedWord(learnedWord : LearnedWord)

}