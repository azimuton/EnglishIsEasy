package com.azimuton.data.networkstorage

import com.azimuton.domain.apimodels.News
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GetNewsDataSource : NewsDataSource {
    override  fun getNews() {
        val retrofit = RetrofitClient()
            .getClient("https://newsdata.io/api/1/")
            .create(API::class.java)
        retrofit.getNews().enqueue(object : Callback<News>{
            override fun onResponse(call: Call<News>, response: Response<News>) {
                response.body().let {
                    it?.let { }
                }
            }
            override fun onFailure(call: Call<News>, t: Throwable) {

            }
        })
    }
}