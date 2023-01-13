package com.azimuton.domain.usecase

import com.azimuton.domain.repository.roomrepository.WordRepository

class WordDeleteAllUseCase (private val wordRepository: WordRepository) {
    fun execute(){
        wordRepository.deleteAll()
    }
}