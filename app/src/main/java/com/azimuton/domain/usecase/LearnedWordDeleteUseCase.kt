package com.azimuton.domain.usecase

import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository

class LearnedWordDeleteUseCase ( private val learnedWordsRepository: LearnedWordsRepository) {
     fun execute(learnedWord: LearnedWord){
        return learnedWordsRepository.deleteLearnedWord(learnedWord)
    }
}