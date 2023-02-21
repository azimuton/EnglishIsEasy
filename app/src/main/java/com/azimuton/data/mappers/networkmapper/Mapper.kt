package com.azimuton.data.mappers.networkmapper

interface Mapper<E, D> {

    fun mapFromEntity(type: E): D
}