package com.azimuton.data.mappers.roommapper

interface Mapper<E, D> {

    fun mapFromEntity(type: E): D

    fun mapToEntity(type: D): E
}