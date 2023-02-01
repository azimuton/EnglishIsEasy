package com.azimuton.englishiseasy.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class NewsDataViewModel : ViewModel(){
    val vmImage : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val vmTitle : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val vmDesc : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
    val vmContent : MutableLiveData<String> by lazy{
        MutableLiveData<String>()
    }
}