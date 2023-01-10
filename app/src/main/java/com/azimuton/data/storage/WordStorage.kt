package com.azimuton.data.storage

import com.azimuton.data.storage.models.WordEntity

interface WordStorage {

    fun getAll(): List<WordEntity>

    //fun copy()

    fun deleteAll()

    fun insertWord(wordEntity: WordEntity)

    fun deleteWord(wordEntity: WordEntity)

    fun updateWord(wordEntity: WordEntity)

    fun getWordById(id: Int): WordEntity?
}