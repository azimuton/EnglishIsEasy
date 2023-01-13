package com.azimuton.data.repository.roomrepository

import com.azimuton.data.mappers.WordListMapper
import com.azimuton.data.mappers.WordMapper
import com.azimuton.data.storage.WordStorage
import com.azimuton.domain.models.Word
import com.azimuton.domain.repository.roomrepository.WordRepository

class WordRepositoryImpl(private val wordStorage: WordStorage) : WordRepository {
    override fun getAll(): List<Word> {
        return WordListMapper().mapFromEntity(wordStorage.getAll())
    }

//    override fun copy(){
//        wordStorage.copy()
//    }

    override suspend fun deleteAll() {
        wordStorage.deleteAll()
    }

    override suspend fun insertWord(word: Word) {
       return wordStorage.insertWord(wordEntity = WordMapper().mapToEntity(word))
    }

    override suspend fun deleteWord(word: Word) {
        return wordStorage.deleteWord(wordEntity = WordMapper().mapToEntity(word))
    }

    override fun updateWord(word: Word) {
        return wordStorage.updateWord(wordEntity = WordMapper().mapToEntity(word))
    }

    override fun getWordById(id: Int): Word? {
        return wordStorage.getWordById(id)?.let { WordMapper().mapFromEntity(it) }
    }
}