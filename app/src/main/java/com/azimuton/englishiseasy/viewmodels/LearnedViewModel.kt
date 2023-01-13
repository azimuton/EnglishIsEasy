package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.usecase.LearnedWordDeleteUseCase
import com.azimuton.domain.usecase.LearnedWordGetAllUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnedViewModel@Inject constructor(
    private var learnedWordGetAllUseCase: LearnedWordGetAllUseCase,
    private var learnedWordDeleteUseCase: LearnedWordDeleteUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.IO){
            learnedWordGetAllUseCase.execute()
        }
    }
    fun delete(learnedWord : LearnedWord){
        viewModelScope.launch(Dispatchers.IO){
            learnedWordDeleteUseCase.execute(learnedWord)
        }
    }
}