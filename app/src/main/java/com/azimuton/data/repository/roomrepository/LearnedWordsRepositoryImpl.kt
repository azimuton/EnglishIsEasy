package com.azimuton.data.repository.roomrepository

import com.azimuton.data.mappers.LearnedWordListMapper
import com.azimuton.data.mappers.LearnedWordMapper
import com.azimuton.data.storage.LearnedWordsStorage
import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository

class LearnedWordsRepositoryImpl(private val learnedWordsStorage: LearnedWordsStorage) :
    LearnedWordsRepository {
    override fun getAll(): List<LearnedWord> {
        return  LearnedWordListMapper().mapFromEntity(learnedWordsStorage.getAll())
    }

    override suspend fun insertLearnedWord(learnedWord: LearnedWord) {
        return learnedWordsStorage.insertLearnedWord(learnedWordEntity =
        LearnedWordMapper().mapToEntity(learnedWord))
    }

    override fun deleteLearnedWord(learnedWord: LearnedWord) {
        return learnedWordsStorage.deleteLearnedWord(learnedWordEntity =
        LearnedWordMapper().mapToEntity(learnedWord))
    }
}