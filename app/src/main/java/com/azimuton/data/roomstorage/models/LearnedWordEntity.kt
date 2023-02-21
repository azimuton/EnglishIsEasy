package com.azimuton.data.roomstorage.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "learnedwords")
class LearnedWordEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "learnedEnglishWord")val learnedEnglishWord: String,
    @ColumnInfo(name = "learnedTranslateWord")val learnedTranslateWord: String
)