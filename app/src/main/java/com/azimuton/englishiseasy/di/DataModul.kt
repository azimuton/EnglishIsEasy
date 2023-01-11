package com.azimuton.englishiseasy.di

import com.azimuton.data.repository.roomrepository.WordRepositoryImpl
import com.azimuton.data.storage.WordStorage
import com.azimuton.data.storage.room.WordStorageRoomImpl
import com.azimuton.data.storage.room.dao.WordDao
import com.azimuton.domain.repository.roomrepository.WordRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Singleton
    @Provides
    fun provideWordStorage(wordDao: WordDao): WordStorage {
        return WordStorageRoomImpl(wordDao = wordDao)
    }

    @Singleton
    @Provides
    fun provideWordRepository(wordStorage: WordStorage): WordRepository {
        return  WordRepositoryImpl(wordStorage = wordStorage)
    }
}