package com.azimuton.englishiseasy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azimuton.englishiseasy.databinding.FragmentLearnBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LearnedFragment : Fragment() {
    private lateinit var binding: FragmentLearnBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}