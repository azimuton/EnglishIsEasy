package com.azimuton.englishiseasy.fragments.frasalverbs

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.Word
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentFrasalVerbsFourBinding
import com.azimuton.englishiseasy.databinding.FragmentFrasalVerbsTwoBinding
import com.azimuton.englishiseasy.viewmodels.FrasalVerbsFourModel
import com.azimuton.englishiseasy.viewmodels.FrasalVerbsTwoModel


class FrasalVerbsFourFragment : Fragment() {
    private lateinit var binding: FragmentFrasalVerbsFourBinding
    private val viewModel: FrasalVerbsFourModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFrasalVerbsFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivF103.setOnClickListener {
            val english : String =  binding.tvE103.text.toString()
            val translate : String =  binding.tvT103.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF104.setOnClickListener {
            val english : String =  binding.tvE104.text.toString()
            val translate : String =  binding.tvT104.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF105.setOnClickListener {
            val english : String =  binding.tvE105.text.toString()
            val translate : String =  binding.tvT105.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF106.setOnClickListener {
            val english : String =  binding.tvE106.text.toString()
            val translate : String =  binding.tvT106.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF107.setOnClickListener {
            val english : String =  binding.tvE107.text.toString()
            val translate : String =  binding.tvT107.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF108.setOnClickListener {
            val english : String =  binding.tvE108.text.toString()
            val translate : String =  binding.tvT108.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF109.setOnClickListener {
            val english : String =  binding.tvE109.text.toString()
            val translate : String =  binding.tvT109.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF110.setOnClickListener {
            val english : String =  binding.tvE110.text.toString()
            val translate : String =  binding.tvT110.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF111.setOnClickListener {
            val english : String =  binding.tvE111.text.toString()
            val translate : String =  binding.tvT111.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF112.setOnClickListener {
            val english : String =  binding.tvE112.text.toString()
            val translate : String =  binding.tvT112.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF113.setOnClickListener {
            val english : String =  binding.tvE113.text.toString()
            val translate : String =  binding.tvT113.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF114.setOnClickListener {
            val english : String =  binding.tvE114.text.toString()
            val translate : String =  binding.tvT114.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF115.setOnClickListener {
            val english : String = binding.tvE115.text.toString()
            val translate : String =  binding.tvT115.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF116.setOnClickListener {
            val english : String =  binding.tvE116.text.toString()
            val translate : String =  binding.tvT116.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF117.setOnClickListener {
            val english : String =  binding.tvE117.text.toString()
            val translate : String =  binding.tvT117.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF118.setOnClickListener {
            val english : String =  binding.tvE118.text.toString()
            val translate : String =  binding.tvT118.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF119.setOnClickListener {
            val english : String =  binding.tvE119.text.toString()
            val translate : String =  binding.tvT119.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF120.setOnClickListener {
            val english : String =  binding.tvE120.text.toString()
            val translate : String =  binding.tvT120.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF121.setOnClickListener {
            val english : String =  binding.tvE121.text.toString()
            val translate : String =  binding.tvT121.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF122.setOnClickListener {
            val english : String =  binding.tvE122.text.toString()
            val translate : String =  binding.tvT122.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF123.setOnClickListener {
            val english : String =  binding.tvE123.text.toString()
            val translate : String =  binding.tvT123.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF124.setOnClickListener {
            val english : String =  binding.tvE124.text.toString()
            val translate : String =  binding.tvT124.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF126.setOnClickListener {
            val english : String =  binding.tvE125.text.toString()
            val translate : String =  binding.tvT125.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF127.setOnClickListener {
            val english : String =  binding.tvE127.text.toString()
            val translate : String =  binding.tvT127.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF128.setOnClickListener {
            val english : String =  binding.tvE128.text.toString()
            val translate : String =  binding.tvT128.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF129.setOnClickListener {
            val english : String =  binding.tvE129.text.toString()
            val translate : String =  binding.tvT129.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF130.setOnClickListener {
            val english : String =  binding.tvE130.text.toString()
            val translate : String =  binding.tvT130.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF131.setOnClickListener {
            val english : String =  binding.tvE131.text.toString()
            val translate : String =  binding.tvT131.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF132.setOnClickListener {
            val english : String =  binding.tvE132.text.toString()
            val translate : String =  binding.tvT132.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF133.setOnClickListener {
            val english : String =  binding.tvE133.text.toString()
            val translate : String =  binding.tvT133.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF134.setOnClickListener {
            val english : String =  binding.tvE134.text.toString()
            val translate : String =  binding.tvT134.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF135.setOnClickListener {
            val english : String =  binding.tvE135.text.toString()
            val translate : String =  binding.tvT135.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF136.setOnClickListener {
            val english : String =  binding.tvE136.text.toString()
            val translate : String =  binding.tvT136.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}