package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.usecase.LearnedWordRandomUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WriteViewModel @Inject constructor(
    private val learnedWordRandomUseCase: LearnedWordRandomUseCase
) : ViewModel(){
    fun getRandomWord() {
        viewModelScope.launch(){

        }
    }
}