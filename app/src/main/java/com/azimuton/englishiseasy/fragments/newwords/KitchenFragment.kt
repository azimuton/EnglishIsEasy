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
import com.azimuton.englishiseasy.databinding.FragmentKitchenBinding
import com.azimuton.englishiseasy.databinding.FragmentSeaBinding
import com.azimuton.englishiseasy.fragments.NewWordsFragment
import com.azimuton.englishiseasy.viewmodels.NewWordsViewModel
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KitchenFragment : Fragment() {
    private lateinit var binding : FragmentKitchenBinding
    private val viewModel: NewWordsViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKitchenBinding.inflate(inflater, container, false)
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


        binding.ivKitchen.setOnClickListener {
            val english : String = binding.kitchen.text.toString()
            val translate : String = binding.tvKitchen.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSpoon.setOnClickListener {
            val english : String = binding.spoon.text.toString()
            val translate : String = binding.tvSpoon.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFork.setOnClickListener {
            val english : String = binding.fork.text.toString()
            val translate : String = binding.tvFork.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKnife.setOnClickListener {
            val english : String = binding.knife.text.toString()
            val translate : String = binding.tvKnife.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTable.setOnClickListener {
            val english : String = binding.table.text.toString()
            val translate : String = binding.tvTable.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivChair.setOnClickListener {
            val english : String = binding.chair.text.toString()
            val translate : String = binding.tvChair.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKithenstove.setOnClickListener {
            val english : String = binding.kithenstove.text.toString()
            val translate : String = binding.tvKithenstove.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSink.setOnClickListener {
            val english : String = binding.sink.text.toString()
            val translate : String = binding.tvSink.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBreadbox.setOnClickListener {
            val english : String = binding.breadbox.text.toString()
            val translate : String = binding.tvBreadbox.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHodgepodge.setOnClickListener {
            val english : String = binding.hodgepodge.text.toString()
            val translate : String = binding.tvHodgepodge.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivRefrigerator.setOnClickListener {
            val english : String = binding.refrigerator.text.toString()
            val translate : String = binding.tvRefrigerator.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPlate.setOnClickListener {
            val english : String = binding.plate.text.toString()
            val translate : String = binding.tvPlate.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCup.setOnClickListener {
            val english : String = binding.cup.text.toString()
            val translate : String = binding.tvCup.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivSaucer.setOnClickListener {
            val english : String = binding.saucer.text.toString()
            val translate : String = binding.tvSaucer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivKithencupboard.setOnClickListener {
            val english : String = binding.kithencupboard.text.toString()
            val translate : String = binding.tvKithencupboard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFoodprocessor.setOnClickListener {
            val english : String = binding.foodprocessor.text.toString()
            val translate : String = binding.tvFoodprocessor.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBin.setOnClickListener {
            val english : String = binding.bin.text.toString()
            val translate : String = binding.tvBin.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivHood.setOnClickListener {
            val english : String = binding.hood.text.toString()
            val translate : String = binding.tvHood.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivOven.setOnClickListener {
            val english : String = binding.oven.text.toString()
            val translate : String = binding.tvOven.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBurner.setOnClickListener {
            val english : String = binding.burner.text.toString()
            val translate : String = binding.tvBurner.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivPan.setOnClickListener {
            val english : String = binding.pan.text.toString()
            val translate : String = binding.tvPan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivFryingpan.setOnClickListener {
            val english : String = binding.fryingpan.text.toString()
            val translate : String = binding.tvFryingpan.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCuttingboard.setOnClickListener {
            val english : String = binding.cuttingboard.text.toString()
            val translate : String = binding.tvCuttingboard.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBottleopener.setOnClickListener {
            val english : String = binding.bottleopener.text.toString()
            val translate : String = binding.tvBottleopener.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivCorkscrew.setOnClickListener {
            val english : String = binding.corkscrew.text.toString()
            val translate : String = binding.tvCorkscrew.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivGrater.setOnClickListener {
            val english : String = binding.grater.text.toString()
            val translate : String = binding.tvGrater.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJuicer.setOnClickListener {
            val english : String = binding.juicer.text.toString()
            val translate : String = binding.tvJuicer.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivBowl.setOnClickListener {
            val english : String = binding.bowl.text.toString()
            val translate : String = binding.tvBowl.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJar.setOnClickListener {
            val english : String = binding.jar.text.toString()
            val translate : String = binding.tvJar.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivJug.setOnClickListener {
            val english : String = binding.jug.text.toString()
            val translate : String = binding.tvJug.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivShugarbowl.setOnClickListener {
            val english : String = binding.shugarbowl.text.toString()
            val translate : String = binding.tvShugarbowl.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTray.setOnClickListener {
            val english : String = binding.tray.text.toString()
            val translate : String = binding.tvTray.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
           viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
        binding.ivTableware.setOnClickListener {
            val english : String = binding.tableware.text.toString()
            val translate : String = binding.tvTableware.text.toString()
            val word = Word(englishWord = english, translateWord = translate)
            viewModel.insert(word)
            Toast.makeText(requireActivity(), "Запись скопирована!", Toast.LENGTH_SHORT).show()
        }
    }
}