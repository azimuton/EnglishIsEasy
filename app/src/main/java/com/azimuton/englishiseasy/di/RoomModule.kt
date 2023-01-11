package com.azimuton.englishiseasy.di

import android.content.Context
import com.azimuton.data.storage.room.AppRoomDatabase
import com.azimuton.data.storage.room.dao.WordDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RoomModule {

    @Singleton
    @Provides
    fun provideAppDatabase(
        @ApplicationContext appContext: Context
    ): AppRoomDatabase {
        return AppRoomDatabase.getDatabase(context = appContext)
    }

    @Singleton
    @Provides
    fun provideWordDao(appRoomDatabase : AppRoomDatabase): WordDao {
        return appRoomDatabase.wordDao()
    }
}