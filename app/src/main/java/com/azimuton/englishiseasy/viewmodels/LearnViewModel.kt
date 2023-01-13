package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.Word
import com.azimuton.domain.usecase.WordDeleteUseCase
import com.azimuton.domain.usecase.WordGetAllUseCase
import com.azimuton.domain.usecase.WordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnViewModel @Inject constructor(
    private var wordGetAllUseCase: WordGetAllUseCase,
    private var wordDeleteUseCase: WordDeleteUseCase,
    private var wordInsertUseCase: WordInsertUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.IO){
            wordGetAllUseCase.execute()
        }
    }
    fun delete(word : Word){
        viewModelScope.launch(Dispatchers.IO){
            wordDeleteUseCase.execute(word)
        }
    }
    fun insert(word: Word){
        viewModelScope.launch(Dispatchers.IO){
            wordInsertUseCase.execute(word)
        }
    }
}