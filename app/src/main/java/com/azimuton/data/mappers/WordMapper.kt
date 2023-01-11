package com.azimuton.data.mappers

import com.azimuton.data.storage.models.WordEntity
import com.azimuton.domain.models.Word

class WordMapper : Mapper<WordEntity, Word> {
    override fun mapFromEntity(type: WordEntity): Word {
        return Word(id = type.id,
            englishWord = type.englishWord,
        translateWord = type.translateWord)
    }

    override fun mapToEntity(type: Word): WordEntity {
        return WordEntity(id = type.id,
        englishWord = type.englishWord,
        translateWord = type.translateWord)
    }
}