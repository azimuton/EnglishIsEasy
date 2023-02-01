package com.azimuton.domain.apimodels

data class News(
    val nextPage: String,
    val results: List<Result>,
    val status: String,
    val totalResults: Int
)