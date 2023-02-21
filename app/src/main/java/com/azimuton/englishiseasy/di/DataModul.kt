package com.azimuton.englishiseasy.di

import com.azimuton.data.networkstorage.GetNewsDataSource
import com.azimuton.data.networkstorage.NewsDataSource
import com.azimuton.data.repository.networkrepository.NetworkRepositoryImpl
import com.azimuton.data.repository.roomrepository.LearnedWordsRepositoryImpl
import com.azimuton.data.repository.roomrepository.WordRepositoryImpl
import com.azimuton.data.roomstorage.LearnedWordsStorage
import com.azimuton.data.roomstorage.WordStorage
import com.azimuton.data.roomstorage.room.LearnedWordStorageRoomImpl
import com.azimuton.data.roomstorage.room.WordStorageRoomImpl
import com.azimuton.data.roomstorage.room.dao.LearnedWordsDao
import com.azimuton.data.roomstorage.room.dao.WordDao
import com.azimuton.domain.repository.networkrepository.NetworkRepository
import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository
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
    fun provideNetworkStorage(): NewsDataSource {
        return GetNewsDataSource()
    }
    @Singleton
    @Provides
    fun provideLearnedWordsStorage(learnedWordsDao: LearnedWordsDao): LearnedWordsStorage {
        return LearnedWordStorageRoomImpl(learnedWordsDao = learnedWordsDao)
    }

    @Singleton
    @Provides
    fun provideWordRepository(wordStorage: WordStorage): WordRepository {
        return  WordRepositoryImpl(wordStorage = wordStorage)
    }

    @Singleton
    @Provides
    fun provideLearnedWordsRepository(learnedWordsStorage: LearnedWordsStorage): LearnedWordsRepository {
        return  LearnedWordsRepositoryImpl(learnedWordsStorage = learnedWordsStorage)
    }
    @Singleton
    @Provides
    fun provideNetworkRepository(networkStorage : NewsDataSource): NetworkRepository {
        return  NetworkRepositoryImpl(newsDataSource = networkStorage)
    }
}