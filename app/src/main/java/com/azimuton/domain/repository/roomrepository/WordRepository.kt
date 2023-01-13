package com.azimuton.domain.repository.roomrepository


import com.azimuton.domain.models.Word

interface WordRepository {

    fun getAll(): List<Word>

    fun copy()

    fun deleteAll()

    fun insertWord(word: Word)

    fun deleteWord(word: Word)

    fun updateWord(word: Word)

    fun getWordById(id: Int): Word?
}