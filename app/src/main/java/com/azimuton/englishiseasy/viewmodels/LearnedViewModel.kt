package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.usecase.LearnedWordDeleteUseCase
import com.azimuton.domain.usecase.LearnedWordGetAllUseCase
import com.azimuton.domain.usecase.LearnedWordRandomUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LearnedViewModel@Inject constructor(
    private var learnedWordGetAllUseCase: LearnedWordGetAllUseCase,
    private var learnedWordDeleteUseCase: LearnedWordDeleteUseCase,
    private val learnedWordRandomUseCase: LearnedWordRandomUseCase
) : ViewModel() {

    fun getAll(){
        viewModelScope.launch(Dispatchers.Main){
            learnedWordGetAllUseCase.execute()
        }
    }
     fun delete(learnedWord : LearnedWord){
//        viewModelScope.async(){
            learnedWordDeleteUseCase.execute(learnedWord)
       // }
    }
    fun random(){
        viewModelScope.launch(Dispatchers.IO){
            learnedWordRandomUseCase.execute()
        }
    }
}