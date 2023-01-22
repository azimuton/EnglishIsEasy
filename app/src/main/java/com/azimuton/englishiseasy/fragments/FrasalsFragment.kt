package com.azimuton.englishiseasy.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.adapters.FrasalAdapter
import com.azimuton.englishiseasy.databinding.FragmentFrasalsBinding
import com.google.android.material.tabs.TabLayoutMediator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FrasalsFragment : Fragment() {
     private lateinit var binding : FragmentFrasalsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFrasalsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initial()
    }
    private fun initial() {
        binding.vpPager2.adapter = FrasalAdapter(requireActivity())
        binding.tabLayout.tabIconTint = null
        TabLayoutMediator(binding.tabLayout, binding.vpPager2){
                tab, pos ->
            when(pos) {
                0 -> {
                    tab.text = "frasal verbs"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                1 -> {
                    tab.text = "frasal verbs"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                2 -> {
                    tab.text = "frasal verbs"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                3 -> {
                    tab.text = "frasal verbs"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                4 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                5 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                6 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
                7 -> {
                    tab.text = "popular expressions"
                    tab.icon?.setTint(ContextCompat.getColor(requireActivity(), R.color.two))
                    binding.vpPager2.setPageTransformer(DepthPageTransformer())
                }
            }

        }.attach()
    }
}