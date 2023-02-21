package com.azimuton.data.mappers.networkmapper.remote

import com.azimuton.data.mappers.networkmapper.Mapper
import com.azimuton.data.networkstorage.apimodelsentity.ResultEntity
import com.azimuton.domain.apimodels.Result

class ResultEntityMapper : Mapper<List<ResultEntity>, List<Result>> {
    override fun mapFromEntity(type: List<ResultEntity>): List<Result> {
        val listResult = ArrayList<Result>()

        type.forEach { listEntity ->
            listResult.add(
                Result(
                    category = listEntity.category,
                    content = listEntity.content,
                    country = listEntity.country,
                    creator = listEntity.creator,
                    description = listEntity.description,
                    image_url = listEntity.image_url,
                    keywords = listEntity.keywords,
                    language = listEntity.language,
                    link = listEntity.link,
                    pubDate = listEntity.pubDate,
                    source_id = listEntity.source_id,
                    title = listEntity.title,
                    video_url = listEntity.video_url
                )
            )
        }

        return listResult.toList()
    }
}