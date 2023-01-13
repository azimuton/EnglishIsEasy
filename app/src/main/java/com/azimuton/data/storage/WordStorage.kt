package com.azimuton.data.storage

import com.azimuton.data.storage.models.WordEntity

interface WordStorage {

    fun getAll(): List<WordEntity>

    fun copy()

    fun deleteAll()

    suspend fun insertWord(wordEntity: WordEntity)

    suspend fun deleteWord(wordEntity: WordEntity)

    fun updateWord(wordEntity: WordEntity)

    fun getWordById(id: Int): WordEntity?
}