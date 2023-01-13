package com.azimuton.domain.usecase

import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository

class LearnedWordInsertUseCase ( private val learnedWordsRepository: LearnedWordsRepository) {
    suspend fun execute(learnedWord: LearnedWord){
        return learnedWordsRepository.insertLearnedWord(learnedWord)
    }
}