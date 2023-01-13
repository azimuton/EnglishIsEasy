package com.azimuton.data.storage.room

import com.azimuton.data.storage.LearnedWordsStorage
import com.azimuton.data.storage.models.LearnedWordEntity
import com.azimuton.data.storage.room.dao.LearnedWordsDao

class LearnedWordStorageRoomImpl(private val learnedWordsDao: LearnedWordsDao) : LearnedWordsStorage {
    override fun getAll(): List<LearnedWordEntity> {
       return learnedWordsDao.getAll()
    }

    override suspend fun insertLearnedWord(learnedWordEntity: LearnedWordEntity) {
        learnedWordsDao.insertLearnedWord(learnedWordEntity = learnedWordEntity)
    }

    override suspend fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity) {
        learnedWordsDao.deleteLearnedWord(learnedWordEntity = learnedWordEntity)
    }
}