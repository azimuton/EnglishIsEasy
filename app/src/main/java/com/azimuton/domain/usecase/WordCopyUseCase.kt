package com.azimuton.domain.usecase

import com.azimuton.domain.repository.roomrepository.WordRepository

class WordCopyUseCase(private val wordRepository: WordRepository) {
    fun execute(){
         wordRepository.copy()
    }
}