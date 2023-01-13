package com.azimuton.domain.usecase

import com.azimuton.domain.models.Word
import com.azimuton.domain.repository.roomrepository.WordRepository

class WordGetWordByIdUseCase(private val wordRepository: WordRepository) {
    fun execute(id : Int) : Word? {
        return wordRepository.getWordById(id = id)
    }
}