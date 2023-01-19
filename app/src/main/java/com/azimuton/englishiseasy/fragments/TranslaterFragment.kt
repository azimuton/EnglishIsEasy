package com.azimuton.englishiseasy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentTranslaterBinding


class TranslaterFragment : Fragment() {
    lateinit var binding : FragmentTranslaterBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTranslaterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }
}