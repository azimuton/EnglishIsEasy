package com.azimuton.englishiseasy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.domain.apimodels.News
import com.azimuton.domain.apimodels.Result
import com.azimuton.englishiseasy.API
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.RetrofitClient
import com.azimuton.englishiseasy.adapters.NewsAdapter
import com.azimuton.englishiseasy.databinding.FragmentNewsBinding
import com.azimuton.englishiseasy.viewmodels.NewsDataViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@AndroidEntryPoint
class NewsFragment : Fragment() {
    private val coroutineScope = CoroutineScope(Dispatchers.Main + Job())

    private lateinit var binding: FragmentNewsBinding
    lateinit var newsList: ArrayList<News>
    private val dataModel: NewsDataViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val isLoaded = true
        if (isLoaded) {
            binding.rvNews.visibility = View.VISIBLE
            //binding.progressBar.visibility = View.INVISIBLE
            val retrofit = RetrofitClient()
                .getClient("https://newsdata.io/api/1/")
                .create(API::class.java)
            coroutineScope.launch(Dispatchers.Main) {
                retrofit.getNews().enqueue(object : Callback<News>, NewsAdapter.ItemClickListener {
                    override fun onResponse(call: Call<News>, response: Response<News>) {
                        newsList = ArrayList<News>()
                        val adapter = NewsAdapter(
                            requireActivity(), response.body()!!.results, this
                        )
                        binding.rvNews.layoutManager = LinearLayoutManager(context)
                        binding.rvNews.adapter = adapter
                    }

                    override fun onFailure(call: Call<News>, t: Throwable) {

                    }

                    override fun onItemClick(position: Int) {
                        activity?.supportFragmentManager
                            ?.beginTransaction()
                            ?.replace(R.id.flMain, NewsDetailsFragment())
                            ?.commit()
                    }

                    override fun details(position: Int, listNews: List<Result>) {
                        dataModel.vmTitle.value = listNews[position].title
                        dataModel.vmDesc.value = listNews[position].description
                        dataModel.vmContent.value = listNews[position].content
                        dataModel.vmImage.value = listNews[position].image_url
                    }
                })
            }
//            } else {
//            binding.progressBar.visibility = View.VISIBLE
//        }
        }
    }
}
