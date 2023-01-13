package com.azimuton.data.storage.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.azimuton.data.storage.models.LearnedWordEntity
import com.azimuton.data.storage.models.WordEntity
import com.azimuton.data.storage.room.dao.LearnedWordsDao
import com.azimuton.data.storage.room.dao.WordDao

@Database(entities = [WordEntity::class, LearnedWordEntity::class], version = 1)
abstract class AppRoomDatabase: RoomDatabase() {

    abstract fun wordDao(): WordDao
    abstract fun learnedWordDao(): LearnedWordsDao

    companion object {
        @Volatile
        private var INSTANCE: AppRoomDatabase? = null


        fun getDatabase(context: Context): AppRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppRoomDatabase::class.java,
                    "words_database")
                    .allowMainThreadQueries()
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}