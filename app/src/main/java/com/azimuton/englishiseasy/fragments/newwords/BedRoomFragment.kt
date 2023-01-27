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
import com.azimuton.englishiseasy.databinding.FragmentBedRoomBinding
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.FrasalVerbsFourModel
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BedRoomFragment : Fragment() {
    private lateinit var binding : FragmentBedRoomBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentBedRoomBinding.inflate(inflater, container, false)
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

            binding.ivBedroom.setOnClickListener {
                val english : String = binding.bedroom.text.toString()
                val translate : String = binding.tvBedroom.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBed.setOnClickListener {
                val english : String = binding.bed.text.toString()
                val translate : String = binding.tvBed.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivNightstand.setOnClickListener {
                val english : String = binding.nightstand.text.toString()
                val translate : String = binding.tvNightstand.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCloset.setOnClickListener {
                val english : String = binding.closet.text.toString()
                val translate : String = binding.tvCloset.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivSconce.setOnClickListener {
                val english : String = binding.sconce.text.toString()
                val translate : String = binding.tvSconce.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCover.setOnClickListener {
                val english : String = binding.cover.text.toString()
                val translate : String = binding.tvCover.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivPillow.setOnClickListener {
                val english : String = binding.pillow.text.toString()
                val translate : String = binding.tvPillow.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivBlanket.setOnClickListener {
                val english : String = binding.blanket.text.toString()
                val translate : String = binding.tvBlanket.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivSheet.setOnClickListener {
                val english : String = binding.sheet.text.toString()
                val translate : String = binding.tvSheet.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivDuvetcover.setOnClickListener {
                val english : String =binding. duvetcover.text.toString()
                val translate : String = binding.tvDuvetcover.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivPillowcase.setOnClickListener {
                val english : String = binding.pillowcase.text.toString()
                val translate : String = binding.tvPillowcase.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCurtains.setOnClickListener {
                val english : String = binding.curtains.text.toString()
                val translate : String = binding.tvCurtains.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivTulle.setOnClickListener {
                val english : String = binding.tulle.text.toString()
                val translate : String = binding.tvTulle.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivCarpet.setOnClickListener {
                val english : String = binding.carpet.text.toString()
                val translate : String = binding.tvCarpet.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivSofa.setOnClickListener {
                val english : String = binding.sofa.text.toString()
                val translate : String = binding.tvSofa.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivLamp.setOnClickListener {
                val english : String = binding.lamp.text.toString()
                val translate : String = binding.tvLamp.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivMirror.setOnClickListener {
                val english : String = binding.mirror.text.toString()
                val translate : String = binding.tvMirror.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
            binding.ivWardrobe.setOnClickListener {
                val english : String = binding.wardrobe.text.toString()
                val translate : String = binding.tvWardrobe.text.toString()
                val word = Word(englishWord = english, translateWord = translate)
                viewModel.insert(word)
                Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}