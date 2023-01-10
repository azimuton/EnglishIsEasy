package com.azimuton.englishiseasy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azimuton.englishiseasy.adapters.NewWordsAdapter
import com.azimuton.englishiseasy.databinding.FragmentLearnBinding


class LearnFragment : Fragment(), NewWordsAdapter.ViewHolder.ItemCallback {
    private lateinit var binding: FragmentLearnBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun showTranslate(index: Int) {
        TODO("Not yet implemented")
    }

    override fun copyWords(index: Int) {
        TODO("Not yet implemented")
    }

    override fun deleteWords(index: Int) {
        TODO("Not yet implemented")
    }

}