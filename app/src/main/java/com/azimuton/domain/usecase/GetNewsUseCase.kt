package com.azimuton.domain.usecase

import com.azimuton.domain.repository.networkrepository.NetworkRepository

class GetNewsUseCase (private val networkRepository: NetworkRepository) {
    fun execute() {
        networkRepository.getNews()
    }
}