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
import com.azimuton.englishiseasy.databinding.FragmentNatureBinding
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NatureFragment : Fragment() {
    private lateinit var binding : FragmentNatureBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNatureBinding.inflate(inflater, container, false)
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

        binding.ivF2.setOnClickListener {
            val english : String = binding.tvE1.text.toString()
            val translate : String = binding.tvT2.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLand.setOnClickListener {
            val english : String = binding.land.text.toString()
            val translate : String = binding.tvLand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMountain.setOnClickListener {
            val english : String = binding.mountain.text.toString()
            val translate : String = binding.tvMountain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTree.setOnClickListener {
            val english : String = binding.tree.text.toString()
            val translate : String = binding.tvTree.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGrass.setOnClickListener {
            val english : String = binding.grass.text.toString()
            val translate : String = binding.tvGrass.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBush.setOnClickListener {
            val english : String = binding.bush.text.toString()
            val translate : String = binding.tvBush.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLandscapes.setOnClickListener {
            val english : String = binding.landscapes.text.toString()
            val translate : String = binding.tvLandscapes.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPlain.setOnClickListener {
            val english : String = binding.plain.text.toString()
            val translate : String = binding.tvPlain.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivForest.setOnClickListener {
            val english : String = binding.forest.text.toString()
            val translate : String = binding.tvForest.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDesert.setOnClickListener {
            val english : String = binding.desert.text.toString()
            val translate : String = binding.tvDesert.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivField.setOnClickListener {
            val english : String = binding.field.text.toString()
            val translate : String = binding.tvField.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGlade.setOnClickListener {
            val english : String = binding.glade.text.toString()
            val translate : String = binding.tvGlade.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBranch.setOnClickListener {
            val english : String = binding.branch.text.toString()
            val translate : String = binding.tvBranch.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivElevation.setOnClickListener {
            val english : String = binding.elevation.text.toString()
            val translate : String = binding.tvElevation.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLowland.setOnClickListener {
            val english : String = binding.lowland.text.toString()
            val translate : String = binding.tvLowland.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCliff.setOnClickListener {
            val english : String = binding.cliff.text.toString()
            val translate : String = binding.tvCliff.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCareer.setOnClickListener {
            val english : String = binding.career.text.toString()
            val translate : String = binding.tvCareer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLandscape.setOnClickListener {
            val english : String = binding.landscape.text.toString()
            val translate : String = binding.tvLandscape.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivValley.setOnClickListener {
            val english : String = binding.valley.text.toString()
            val translate : String = binding.tvValley.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSand.setOnClickListener {
            val english : String = binding.sand.text.toString()
            val translate : String = binding.tvSand.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRock.setOnClickListener {
            val english : String = binding.rock.text.toString()
            val translate : String = binding.tvRock.text.toString()
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
        binding.ivHill.setOnClickListener {
            val english : String = binding.hill.text.toString()
            val translate : String = binding.tvHill.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSoil.setOnClickListener {
            val english : String = binding.soil.text.toString()
            val translate : String = binding.tvSoil.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPrairie.setOnClickListener {
            val english : String = binding.prairie.text.toString()
            val translate : String = binding.tvPrairie.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRainforest.setOnClickListener {
            val english : String = binding.rainforest.text.toString()
            val translate : String = binding.tvRainforest.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJungle.setOnClickListener {
            val english : String = binding.jungle.text.toString()
            val translate : String = binding.tvJungle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMesa.setOnClickListener {
            val english : String = binding.mesa.text.toString()
            val translate : String = binding.tvMesa.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPlateau.setOnClickListener {
            val english : String = binding.plateau.text.toString()
            val translate : String = binding.tvPlateau.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDune.setOnClickListener {
            val english : String = binding.dune.text.toString()
            val translate : String = binding.tvDune.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCanyon.setOnClickListener {
            val english : String = binding.canyon.text.toString()
            val translate : String = binding.tvCanyon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCave.setOnClickListener {
            val english : String = binding.cave.text.toString()
            val translate : String = binding.tvCave.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}