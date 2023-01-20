package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.azimuton.domain.models.Word
import com.azimuton.domain.usecase.WordInsertUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TranslaterViewModel @Inject constructor(
    private var insertUseCase: WordInsertUseCase
) : ViewModel(){
    fun insert(word: Word){
        viewModelScope.launch(Dispatchers.IO){
            insertUseCase.execute(word)
        }
    }
}