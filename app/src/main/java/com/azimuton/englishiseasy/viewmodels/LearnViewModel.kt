package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.Word
import com.azimuton.domain.usecase.WordCopyUseCase
import com.azimuton.domain.usecase.WordDeleteUseCase
import com.azimuton.domain.usecase.WordGetAllUseCase
import com.azimuton.domain.usecase.WordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnViewModel @Inject constructor(
    private var wordGetAllUseCase: WordGetAllUseCase,
    private var wordDeleteUseCase: WordDeleteUseCase,
    private var wordInsertUseCase: WordInsertUseCase,
    private var wordCopyUseCase: WordCopyUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.Main){
            wordGetAllUseCase.execute()
        }
    }
    fun delete(word : Word){
        viewModelScope.async(){
            wordDeleteUseCase.execute(word)
        }
    }
    fun insert(word: Word){
        viewModelScope.async(){
            wordInsertUseCase.execute(word)
        }
    }
    fun copy(){
        viewModelScope.async(){
            wordCopyUseCase.execute()
        }
    }
}