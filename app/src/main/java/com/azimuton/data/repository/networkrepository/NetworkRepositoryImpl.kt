package com.azimuton.data.repository.networkrepository

import com.azimuton.data.networkstorage.NewsDataSource
import com.azimuton.domain.repository.networkrepository.NetworkRepository

class NetworkRepositoryImpl( private val newsDataSource : NewsDataSource) : NetworkRepository {
    override  fun getNews() {
        newsDataSource.getNews()
    }
    }
