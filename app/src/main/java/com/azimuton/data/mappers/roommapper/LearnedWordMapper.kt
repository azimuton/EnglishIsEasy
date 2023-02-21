package com.azimuton.data.mappers.roommapper

import com.azimuton.data.mappers.roommapper.Mapper
import com.azimuton.data.roomstorage.models.LearnedWordEntity
import com.azimuton.domain.models.LearnedWord

class LearnedWordMapper : Mapper<LearnedWordEntity, LearnedWord> {

    override fun mapFromEntity(type: LearnedWordEntity): LearnedWord {
        return  LearnedWord(id = type.id,
        englishLearnedWord = type.learnedEnglishWord,
        translateLearnedWord = type.learnedTranslateWord)
    }

    override fun mapToEntity(type: LearnedWord): LearnedWordEntity {
        return LearnedWordEntity(id = type.id,
        learnedEnglishWord = type.englishLearnedWord,
        learnedTranslateWord = type.translateLearnedWord)
    }
}