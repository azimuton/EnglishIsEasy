package com.azimuton.domain.repository.networkrepository

import com.azimuton.data.networkstorage.apimodelsentity.NewsEntity
import com.azimuton.domain.apimodels.News

interface NetworkRepository {
    fun getNews()
}