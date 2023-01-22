package com.azimuton.englishiseasy.fragments.popularexpressions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import com.azimuton.domain.models.Word
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.databinding.FragmentPopularExpressionsFourBinding
import com.azimuton.englishiseasy.databinding.FragmentPopularExpressionsTwoBinding
import com.azimuton.englishiseasy.viewmodels.PopExpFourViewModel
import com.azimuton.englishiseasy.viewmodels.PopExpTwoViewModel


class PopularExpressionsFourFragment : Fragment() {
    private lateinit var binding: FragmentPopularExpressionsFourBinding
    private val viewModel: PopExpFourViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopularExpressionsFourBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.ivF85.setOnClickListener {
            val english : String = binding.tvE85.text.toString()
            val translate : String = binding.tvT85.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF86.setOnClickListener {
            val english : String = binding.tvE86.text.toString()
            val translate : String = binding.tvT86.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF87.setOnClickListener {
            val english : String = binding.tvE87.text.toString()
            val translate : String = binding.tvT87.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF88.setOnClickListener {
            val english : String = binding.tvE88.text.toString()
            val translate : String = binding.tvT88.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF89.setOnClickListener {
            val english : String = binding.tvE89.text.toString()
            val translate : String = binding.tvT89.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
           viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF90.setOnClickListener {
            val english : String = binding.tvE90.text.toString()
            val translate : String = binding.tvT90.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF91.setOnClickListener {
            val english : String = binding.tvE91.text.toString()
            val translate : String = binding.tvT91.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF92.setOnClickListener {
            val english : String = binding.tvE92.text.toString()
            val translate : String = binding.tvT92.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF93.setOnClickListener {
            val english : String = binding.tvE93.text.toString()
            val translate : String = binding.tvT93.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF94.setOnClickListener {
            val english : String = binding.tvE94.text.toString()
            val translate : String = binding.tvT94.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF95.setOnClickListener {
            val english : String = binding.tvE95.text.toString()
            val translate : String = binding.tvT95.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF96.setOnClickListener {
            val english : String = binding.tvE96.text.toString()
            val translate : String = binding.tvT96.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF97.setOnClickListener {
            val english : String = binding.tvE97.text.toString()
            val translate : String = binding.tvT97.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF98.setOnClickListener {
            val english : String = binding.tvE98.text.toString()
            val translate : String = binding.tvT98.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF99.setOnClickListener {
            val english : String = binding.tvE99.text.toString()
            val translate : String = binding.tvT99.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF100.setOnClickListener {
            val english : String = binding.tvE100.text.toString()
            val translate : String = binding.tvT100.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF101.setOnClickListener {
            val english : String = binding.tvE101.text.toString()
            val translate : String = binding.tvT101.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF102.setOnClickListener {
            val english : String = binding.tvE102.text.toString()
            val translate : String = binding.tvT102.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF103.setOnClickListener {
            val english : String = binding.tvE103.text.toString()
            val translate : String = binding.tvT103.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF104.setOnClickListener {
            val english : String = binding.tvE104.text.toString()
            val translate : String = binding.tvT104.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF105.setOnClickListener {
            val english : String = binding.tvE105.text.toString()
            val translate : String = binding.tvT105.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF106.setOnClickListener {
            val english : String = binding.tvE106.text.toString()
            val translate : String = binding.tvT106.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF107.setOnClickListener {
            val english : String = binding.tvE107.text.toString()
            val translate : String = binding.tvT107.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF108.setOnClickListener {
            val english : String = binding.tvE108.text.toString()
            val translate : String = binding.tvT108.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF109.setOnClickListener {
            val english : String = binding.tvE109.text.toString()
            val translate : String = binding.tvT109.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF110.setOnClickListener {
            val english : String = binding.tvE110.text.toString()
            val translate : String = binding.tvT110.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF111.setOnClickListener {
            val english : String = binding.tvE111.text.toString()
            val translate : String = binding.tvT111.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF112.setOnClickListener {
            val english : String = binding.tvE112.text.toString()
            val translate : String = binding.tvT112.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}