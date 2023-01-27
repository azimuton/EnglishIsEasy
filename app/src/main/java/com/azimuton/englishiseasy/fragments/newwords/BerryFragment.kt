package com.azimuton.englishiseasy.fragments.newwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.Word
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentBerryBinding
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BerryFragment : Fragment() {
    private lateinit var binding : FragmentBerryBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBerryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Glide.with(this)
            .asGif()
            .load(R.drawable.backnote)
            .into(binding.ivBackToNewWordsList)
        binding.ivBackToNewWordsList.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.flMain, NewWordsFragment())
                ?.commit()

            binding.ivStrawberry.setOnClickListener {
                val english : String = binding.strawberry.text.toString()
                val translate : String = binding.tvStrawberry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivRaspberries.setOnClickListener {
                val english : String = binding.raspberries.text.toString()
                val translate : String = binding.tvRaspberries.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivStrawberries.setOnClickListener {
                val english : String = binding.strawberries.text.toString()
                val translate : String = binding.tvStrawberries.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCherries.setOnClickListener {
                val english : String = binding.cherries.text.toString()
                val translate : String = binding.tvCherries.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivGooseberry.setOnClickListener {
                val english : String = binding.gooseberry.text.toString()
                val translate : String = binding.tvGooseberry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCurrant.setOnClickListener {
                val english : String = binding.currant.text.toString()
                val translate : String = binding.tvCurrant.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCherry.setOnClickListener {
                val english : String = binding.cherry.text.toString()
                val translate : String = binding.tvCherry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivGrape.setOnClickListener {
                val english : String = binding.grape.text.toString()
                val translate : String = binding.tvGrape.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivWatermelon.setOnClickListener {
                val english : String = binding.watermelon.text.toString()
                val translate : String = binding.tvWatermelon.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivMelon.setOnClickListener {
                val english : String = binding.melon.text.toString()
                val translate : String = binding.tvMelon.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivPumpkin.setOnClickListener {
                val english : String = binding.pumpkin.text.toString()
                val translate : String = binding.tvPumpkin.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlueberry.setOnClickListener {
                val english : String = binding.blueberry.text.toString()
                val translate : String = binding.tvBlueberry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlackberry.setOnClickListener {
                val english : String = binding.blackberry.text.toString()
                val translate : String = binding.tvBlackberry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCranberry.setOnClickListener {
                val english : String = binding.cranberry.text.toString()
                val translate : String = binding.tvCranberry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivDogwood.setOnClickListener {
                val english : String = binding.dogwood.text.toString()
                val translate : String = binding.tvDogwood.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivLemongrass.setOnClickListener {
                val english : String = binding.lemongrass.text.toString()
                val translate : String = binding.tvLemongrass.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivSeabuckthorn.setOnClickListener {
                val english : String = binding.seabuckthorn.text.toString()
                val translate : String = binding.tvSeabuckthorn.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivOlives.setOnClickListener {
                val english : String = binding.olives.text.toString()
                val translate : String = binding.tvOlives.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivRowan.setOnClickListener {
                val english : String = binding.rowan.text.toString()
                val translate : String = binding.tvRowan.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivViburnum.setOnClickListener {
                val english : String = binding.viburnum.text.toString()
                val translate : String = binding.tvViburnum.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivMulberry.setOnClickListener {
                val english : String = binding.mulberry.text.toString()
                val translate : String = binding.tvMulberry.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlueberrys.setOnClickListener {
                val english : String = binding.blueberrys.text.toString()
                val translate : String = binding.tvBlueberrys.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivYoshta.setOnClickListener {
                val english : String = binding.yoshta.text.toString()
                val translate : String = binding.tvYoshta.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}