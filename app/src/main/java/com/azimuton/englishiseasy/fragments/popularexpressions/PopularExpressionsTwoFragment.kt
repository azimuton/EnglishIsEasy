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
import com.azimuton.englishiseasy.databinding.FragmentFrasalVerbsFourBinding
import com.azimuton.englishiseasy.databinding.FragmentPopularExpressionsBinding
import com.azimuton.englishiseasy.databinding.FragmentPopularExpressionsTwoBinding
import com.azimuton.englishiseasy.viewmodels.FrasalVerbsFourModel
import com.azimuton.englishiseasy.viewmodels.PopExpTwoViewModel

class PopularExpressionsTwoFragment : Fragment() {
    private lateinit var binding: FragmentPopularExpressionsTwoBinding
    private val viewModel: PopExpTwoViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPopularExpressionsTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivF29.setOnClickListener {
            val english : String = binding.tvE29.text.toString()
            val translate : String = binding.tvT29.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF30.setOnClickListener {
            val english : String = binding.tvE30.text.toString()
            val translate : String = binding.tvT30.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF31.setOnClickListener {
            val english : String = binding.tvE31.text.toString()
            val translate : String = binding.tvT31.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF32.setOnClickListener {
            val english : String = binding.tvE32.text.toString()
            val translate : String = binding.tvT32.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF33.setOnClickListener {
            val english : String = binding.tvE33.text.toString()
            val translate : String = binding.tvT33.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF34.setOnClickListener {
            val english : String = binding.tvE34.text.toString()
            val translate : String = binding.tvT34.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF35.setOnClickListener {
            val english : String = binding.tvE35.text.toString()
            val translate : String = binding.tvT35.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF36.setOnClickListener {
            val english : String = binding.tvE36.text.toString()
            val translate : String = binding.tvT36.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF37.setOnClickListener {
            val english : String = binding.tvE37.text.toString()
            val translate : String = binding.tvT37.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF38.setOnClickListener {
            val english : String = binding.tvE38.text.toString()
            val translate : String = binding.tvT38.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF39.setOnClickListener {
            val english : String = binding.tvE39.text.toString()
            val translate : String = binding.tvT39.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF40.setOnClickListener {
            val english : String = binding.tvE40.text.toString()
            val translate : String = binding.tvT40.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF41.setOnClickListener {
            val english : String = binding.tvE41.text.toString()
            val translate : String = binding.tvT41.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF42.setOnClickListener {
            val english : String = binding.tvE42.text.toString()
            val translate : String = binding.tvT42.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF43.setOnClickListener {
            val english : String = binding.tvE43.text.toString()
            val translate : String = binding.tvT43.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF44.setOnClickListener {
            val english : String = binding.tvE44.text.toString()
            val translate : String = binding.tvT44.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF45.setOnClickListener {
            val english : String = binding.tvE45.text.toString()
            val translate : String = binding.tvT45.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF46.setOnClickListener {
            val english : String = binding.tvE46.text.toString()
            val translate : String = binding.tvT46.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF47.setOnClickListener {
            val english : String = binding.tvE47.text.toString()
            val translate : String = binding.tvT47.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF48.setOnClickListener {
            val english : String = binding.tvE48.text.toString()
            val translate : String = binding.tvT48.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF49.setOnClickListener {
            val english : String = binding.tvE49.text.toString()
            val translate : String = binding.tvT49.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF50.setOnClickListener {
            val english : String = binding.tvE50.text.toString()
            val translate : String = binding.tvT50.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF51.setOnClickListener {
            val english : String = binding.tvE51.text.toString()
            val translate : String = binding.tvT51.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF52.setOnClickListener {
            val english : String = binding.tvE52.text.toString()
            val translate : String = binding.tvT52.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF53.setOnClickListener {
            val english : String = binding.tvE53.text.toString()
            val translate : String = binding.tvT53.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF54.setOnClickListener {
            val english : String = binding.tvE54.text.toString()
            val translate : String = binding.tvT54.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF55.setOnClickListener {
            val english : String = binding.tvE55.text.toString()
            val translate : String = binding.tvT55.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivF56.setOnClickListener {
            val english : String = binding.tvE56.text.toString()
            val translate : String = binding.tvT56.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }

}