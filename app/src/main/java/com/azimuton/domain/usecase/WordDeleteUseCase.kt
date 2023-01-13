package com.azimuton.domain.usecase

import com.azimuton.domain.models.Word
import com.azimuton.domain.repository.roomrepository.WordRepository

class WordDeleteUseCase( private val wordRepository: WordRepository) {
     fun execute(word: Word){
        return wordRepository.deleteWord(word)
    }
}