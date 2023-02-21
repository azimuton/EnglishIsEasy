package com.azimuton.data.roomstorage

import com.azimuton.data.roomstorage.models.WordEntity

interface WordStorage {

    fun getAll(): List<WordEntity>

    fun copy()

    fun deleteAll()

    fun insertWord(wordEntity: WordEntity)

    fun deleteWord(wordEntity: WordEntity)

    fun updateWord(wordEntity: WordEntity)

    fun getWordById(id: Int): WordEntity?
}