package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.LearnedWordsStorage
import com.azimuton.data.roomstorage.models.LearnedWordEntity
import com.azimuton.data.roomstorage.room.dao.LearnedWordsDao

class LearnedWordStorageRoomImpl(private val learnedWordsDao: LearnedWordsDao) : LearnedWordsStorage {
    override fun getAll(): List<LearnedWordEntity> {
       return learnedWordsDao.getAll()
    }

    override fun randoms() : LearnedWordEntity {
        return learnedWordsDao.randoms()
    }

    override fun insertLearnedWord(learnedWordEntity: LearnedWordEntity) {
        learnedWordsDao.insertLearnedWord(learnedWordEntity = learnedWordEntity)
    }

    override fun deleteLearnedWord(learnedWordEntity: LearnedWordEntity) {
        learnedWordsDao.deleteLearnedWord(learnedWordEntity = learnedWordEntity)
    }
}