package com.azimuton.domain.usecase

import com.azimuton.domain.models.Word
import com.azimuton.domain.repository.roomrepository.WordRepository

class WordGetAllUseCase(private val wordRepository: WordRepository) {
    fun execute(): List<Word>{
        return wordRepository.getAll()
    }
}