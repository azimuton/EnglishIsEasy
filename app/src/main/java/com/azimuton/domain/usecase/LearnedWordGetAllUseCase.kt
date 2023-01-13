package com.azimuton.domain.usecase

import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository

class LearnedWordGetAllUseCase (private val learnedWordsRepository: LearnedWordsRepository) {
    fun execute(): List<LearnedWord>{
        return learnedWordsRepository.getAll()
    }
}