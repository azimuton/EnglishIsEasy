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
import com.azimuton.englishiseasy.databinding.FragmentCityBinding
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CityFragment : Fragment() {
    private lateinit var binding : FragmentCityBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCityBinding.inflate(inflater, container, false)
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

        binding.ivCity.setOnClickListener {
            val english : String = binding.city.text.toString()
            val translate : String = binding.tvCity.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStreet.setOnClickListener {
            val english : String = binding.street.text.toString()
            val translate : String = binding.tvStreet.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRoad.setOnClickListener {
            val english : String = binding.road.text.toString()
            val translate : String = binding.tvRoad.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivOneway.setOnClickListener {
            val english : String = binding.oneway.text.toString()
            val translate : String = binding.tvOneway.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTraffic.setOnClickListener {
            val english : String = binding.traffic.text.toString()
            val translate : String = binding.tvTraffic.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBusstop.setOnClickListener {
            val english : String = binding.busstop.text.toString()
            val translate : String = binding.tvBusstop.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSidewalk.setOnClickListener {
            val english : String = binding.sidewalk.text.toString()
            val translate : String = binding.tvSidewalk.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBorder.setOnClickListener {
            val english : String = binding.border.text.toString()
            val translate : String = binding.tvBorder.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSquare.setOnClickListener {
            val english : String = binding.square.text.toString()
            val translate : String = binding.tvSquare.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSubway.setOnClickListener {
            val english : String = binding.subway.text.toString()
            val translate : String = binding.tvSubway.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivDistrict.setOnClickListener {
            val english : String = binding.district.text.toString()
            val translate : String = binding.tvDistrict.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivQuarter.setOnClickListener {
            val english : String = binding.quarter.text.toString()
            val translate : String = binding.tvQuarter.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPillar.setOnClickListener {
            val english : String = binding.pillar.text.toString()
            val translate : String = binding.tvPillar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCemetery.setOnClickListener {
            val english : String = binding.cemetery.text.toString()
            val translate : String = binding.tvCemetery.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBroadway.setOnClickListener {
            val english : String = binding.broadway.text.toString()
            val translate : String = binding.tvBroadway.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBoulevard.setOnClickListener {
            val english : String = binding.boulevard.text.toString()
            val translate : String = binding.tvBoulevard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivAvenue.setOnClickListener {
            val english : String = binding.avenue.text.toString()
            val translate : String = binding.tvAvenue.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivEmbankment.setOnClickListener {
            val english : String = binding.embankment.text.toString()
            val translate : String = binding.tvEmbankment.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBridge.setOnClickListener {
            val english : String = binding.bridge.text.toString()
            val translate : String = binding.tvBridge.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivLawn.setOnClickListener {
            val english : String = binding.lawn.text.toString()
            val translate : String = binding.tvLawn.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPark.setOnClickListener {
            val english : String = binding.park.text.toString()
            val translate : String = binding.tvPark.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivUndergroundpass.setOnClickListener {
            val english : String = binding.undergroundpass.text.toString()
            val translate : String = binding.tvUndergroundpass.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivStoreshop.setOnClickListener {
            val english : String = binding.storeshop.text.toString()
            val translate : String = binding.tvStoreshope.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivMarket.setOnClickListener {
            val english : String = binding.market.text.toString()
            val translate : String = binding.tvMarket.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }


}