package com.azimuton.data.roomstorage.room

import com.azimuton.data.roomstorage.WordStorage
import com.azimuton.data.roomstorage.models.WordEntity
import com.azimuton.data.roomstorage.room.dao.WordDao

class WordStorageRoomImpl(private  val wordDao : WordDao) : WordStorage {
    override  fun getAll(): List<WordEntity> {
        return  wordDao.getAll()
    }

    override fun copy() {
        wordDao.copy()
    }

    override fun deleteAll() {
        wordDao.deleteAll()
    }

    override fun insertWord(wordEntity: WordEntity) {
        return wordDao.insertWord(wordEntity = wordEntity)
    }

    override fun deleteWord(wordEntity: WordEntity) {
        return wordDao.deleteWord(wordEntity = wordEntity)
    }

    override fun updateWord(wordEntity: WordEntity) {
        return wordDao.updateWord(wordEntity = wordEntity)
    }

    override fun getWordById(id: Int): WordEntity? {
        return wordDao.getWordById(id)
    }
}