package com.azimuton.domain.usecase

import com.azimuton.domain.models.Word
import com.azimuton.domain.repository.roomrepository.WordRepository

class WordInsertUseCase( private val wordRepository: WordRepository) {
    fun execute(word: Word){
        return wordRepository.insertWord(word)
    }
}