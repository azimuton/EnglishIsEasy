package com.azimuton.domain.repository.roomrepository


import com.azimuton.domain.models.Word

interface WordRepository {

    fun getAll(): List<Word>

    fun copy()

     fun deleteAll()

    suspend fun insertWord(word: Word)

    suspend fun deleteWord(word: Word)

    fun updateWord(word: Word)

    fun getWordById(id: Int): Word?
}