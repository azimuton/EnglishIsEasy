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
import com.azimuton.englishiseasy.databinding.FragmentNewWordsBinding
import com.azimuton.englishiseasy.databinding.FragmentWashRoomBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WashRoomFragment : Fragment() {
    private lateinit var binding : FragmentWashRoomBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWashRoomBinding.inflate(inflater, container, false)
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
        }

        binding.ivWashroom.setOnClickListener {
            val english : String = binding.washroom.text.toString()
            val translate : String = binding.tvWashroom.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBath.setOnClickListener {
            val english : String = binding.bath.text.toString()
            val translate : String = binding.tvBath.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToilet.setOnClickListener {
            val english : String = binding.toilet.text.toString()
            val translate : String = binding.tvToilet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFlushtank.setOnClickListener {
            val english : String = binding.flushtank.text.toString()
            val translate : String = binding.tvFlushtank.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToiletseat.setOnClickListener {
            val english : String = binding.toiletseat.text.toString()
            val translate : String = binding.tvToiletseat.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToiletpaper.setOnClickListener {
            val english : String = binding.toiletpaper.text.toString()
            val translate : String = binding.tvToiletpaper.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShower.setOnClickListener {
            val english : String = binding.shower.text.toString()
            val translate : String = binding.tvShower.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShowercabin.setOnClickListener {
            val english : String = binding.showercabin.text.toString()
            val translate : String = binding.tvShowercabin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTowel.setOnClickListener {
            val english : String = binding.towel.text.toString()
            val translate : String = binding.tvTowel.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLaundrybasket.setOnClickListener {
            val english : String = binding.laundrybasket.text.toString()
            val translate : String = binding.tvLaundrybasket.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWashingmashine.setOnClickListener {
            val english : String = binding.washingmashine.text.toString()
            val translate : String = binding.tvWashingmashine.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDrainer.setOnClickListener {
            val english : String = binding.drainer.text.toString()
            val translate : String = binding.tvDrainer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToothbrush.setOnClickListener {
            val english : String = binding.toothbrush.text.toString()
            val translate : String = binding.tvToothbrush.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivToothpaste.setOnClickListener {
            val english : String = binding.toothpaste.text.toString()
            val translate : String = binding.tvToothpaste.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSoap.setOnClickListener {
            val english : String = binding.soap.text.toString()
            val translate : String = binding.tvSoap.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShampoo.setOnClickListener {
            val english : String = binding.shampoo.text.toString()
            val translate : String = binding.tvShampoo.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpongeforbody.setOnClickListener {
            val english : String = binding.spongeforbody.text.toString()
            val translate : String = binding.tvSpongeforbody.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWashbasin.setOnClickListener {
            val english : String = binding.washbasin.text.toString()
            val translate : String = binding.tvWashbasin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWashbasincabinet.setOnClickListener {
            val english : String = binding.washbasincabinet.text.toString()
            val translate : String = binding.tvWashbasincabinet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}