package com.azimuton.data.networkstorage


import com.azimuton.domain.apimodels.News
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface API {

    @GET("news?apikey=pub_1638954bac6dfcdfc508f94376b23f3b73d69&category=sports,top,science,technology,health&country=gb&page")
      fun getNews() : Call<News>

    companion object {

        var BASE_URL = "https://newsdata.io/api/1/"

        fun create() : API {

            val retrofit = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            return retrofit.create(API::class.java)

        }
    }
}
