package com.azimuton.domain.usecase

import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository

class LearnedWordRandomUseCase(private val learnedWordsRepository: LearnedWordsRepository) {
    fun execute(){
        learnedWordsRepository.randoms()
    }
}