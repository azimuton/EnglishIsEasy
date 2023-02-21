package com.azimuton.englishiseasy.di

import com.azimuton.domain.repository.networkrepository.NetworkRepository
import com.azimuton.domain.repository.roomrepository.LearnedWordsRepository
import com.azimuton.domain.repository.roomrepository.WordRepository
import com.azimuton.domain.usecase.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun provideGetNewsUseCase(networkRepository: NetworkRepository) : GetNewsUseCase{
        return GetNewsUseCase(networkRepository = networkRepository)
    }

    @Provides
    fun provideWordDeleteUseCase(wordRepository: WordRepository): WordDeleteUseCase {
        return  WordDeleteUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideWordCopyUseCase(wordRepository: WordRepository):WordCopyUseCase{
        return  WordCopyUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideWordDeleteAllUseCase(wordRepository: WordRepository):WordDeleteAllUseCase{
        return  WordDeleteAllUseCase(wordRepository = wordRepository)
    }
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
    @Provides
    fun provideGetWordByIdUseCase(wordRepository: WordRepository):WordGetWordByIdUseCase{
        return  WordGetWordByIdUseCase(wordRepository = wordRepository)
    }
    @Provides
    fun provideLearnedWordsGetAllUseCase(learnedWordsRepository: LearnedWordsRepository) : LearnedWordGetAllUseCase{
        return LearnedWordGetAllUseCase(learnedWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideLearnedWordsDeleteUseCase(learnedWordsRepository: LearnedWordsRepository) : LearnedWordDeleteUseCase{
        return LearnedWordDeleteUseCase(learnedWordsRepository = learnedWordsRepository)
    }
    @Provides
    fun provideLearnedWordsRandomUseCase(learnedWordsRepository : LearnedWordsRepository) : LearnedWordRandomUseCase{
        return LearnedWordRandomUseCase(learnedWordsRepository = learnedWordsRepository)
    }
}