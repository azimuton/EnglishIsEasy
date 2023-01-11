package com.azimuton.englishiseasy.di

import com.azimuton.domain.repository.roomrepository.WordRepository
import com.azimuton.domain.usecase.WordDeleteUseCase
import com.azimuton.domain.usecase.WordGetAllUseCase
import com.azimuton.domain.usecase.WordInsertUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideWordDeleteUseCase(wordRepository: WordRepository): WordDeleteUseCase {
        return  WordDeleteUseCase(wordRepository = wordRepository)
    }
//    @Provides
//    fun provideNoteDelImageUseCase(noteRepository: SaveDataNoteRepository):NoteDelImageUseCase{
//        return  NoteDelImageUseCase(saveDataNoteRepository = noteRepository)
//    }
    @Provides
    fun provideWordGetAllUseCase(wordRepository: WordRepository): WordGetAllUseCase {
        return WordGetAllUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideWordInsertUseCase(wordRepository: WordRepository): WordInsertUseCase {
        return  WordInsertUseCase(wordRepository = wordRepository)
    }
//    @Provides
//    fun provideNoteUpdateUseCase(noteRepository: SaveDataNoteRepository):NoteUpdateUseCase{
//        return  NoteUpdateUseCase(saveDataNoteRepository = noteRepository)
//    }
//    @Provides
//    fun provideGetNoteByIdUseCase(noteRepository: SaveDataNoteRepository):NoteGetNoteByIdUseCase{
//        return  NoteGetNoteByIdUseCase(saveDataNoteRepository = noteRepository)
//    }
}