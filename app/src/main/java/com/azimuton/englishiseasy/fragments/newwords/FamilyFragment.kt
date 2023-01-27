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
import com.azimuton.englishiseasy.databinding.FragmentFamilyBinding
import com.azimuton.englishiseasy.databinding.FragmentNatureBinding
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FamilyFragment : Fragment() {
    private lateinit var binding : FragmentFamilyBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFamilyBinding.inflate(inflater, container, false)
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

        binding.ivMother.setOnClickListener {
            val english : String = binding.mother.text.toString()
            val translate : String = binding.tvMother.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFather.setOnClickListener {
            val english : String = binding.father.text.toString()
            val translate : String = binding.tvFather.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSister.setOnClickListener {
            val english : String = binding.sister.text.toString()
            val translate : String = binding.tvSister.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBrother.setOnClickListener {
            val english : String = binding.brother.text.toString()
            val translate : String = binding.tvBrother.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivWife.setOnClickListener {
            val english : String = binding.wife.text.toString()
            val translate : String = binding.tvWife.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHusband.setOnClickListener {
            val english : String = binding.husband.text.toString()
            val translate : String = binding.tvHusband.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSon.setOnClickListener {
            val english : String = binding.son.text.toString()
            val translate : String = binding.tvSon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDaughter.setOnClickListener {
            val english : String = binding.daughter.text.toString()
            val translate : String = binding.tvDaughter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGrandmother.setOnClickListener {
            val english : String = binding.grandmother.text.toString()
            val translate : String = binding.tvGrandmother.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGrandfather.setOnClickListener {
            val english : String = binding.grandfather.text.toString()
            val translate : String = binding.tvGrandfather.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFatherInLaw.setOnClickListener {
            val english : String = binding.fatherinlaw.text.toString()
            val translate : String = binding.tvFatherInLaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMotherInLaw.setOnClickListener {
            val english : String = binding.motherinlaw.text.toString()
            val translate : String = binding.tvMotherInLaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBrotherInLaw.setOnClickListener {
            val english : String = binding.brotherinlaw.text.toString()
            val translate : String = binding.tvBrotherInLaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSisterInLaw.setOnClickListener {
            val english : String = binding.sisterinlaw.text.toString()
            val translate : String = binding.tvSisterInLaw.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivUncle.setOnClickListener {
            val english : String = binding.uncle.text.toString()
            val translate : String = binding.tvUncle.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAunt.setOnClickListener {
            val english : String = binding.aunt.text.toString()
            val translate : String = binding.tvAunt.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}