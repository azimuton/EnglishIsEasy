package com.azimuton.englishiseasy.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.storage.room.AppRoomDatabase
import com.azimuton.domain.models.LearnedWord
import com.azimuton.domain.usecase.LearnedWordGetAllUseCase
import com.azimuton.englishiseasy.MainActivity
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.adapters.LearnedWordsAdapter
import com.azimuton.englishiseasy.databinding.FragmentLearnedBinding
import com.azimuton.englishiseasy.viewmodels.LearnedViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LearnedFragment : Fragment(), LearnedWordsAdapter.ViewHolder.ItemCallback {
    private lateinit var binding: FragmentLearnedBinding
    private lateinit var adapter: LearnedWordsAdapter
    lateinit var learnedWordDatabase : AppRoomDatabase
    private lateinit var learnedWordsList: ArrayList<LearnedWord>
    @Inject
    lateinit var getAll : LearnedWordGetAllUseCase
    private val viewModel : LearnedViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        learnedWordsList = ArrayList<LearnedWord>()
        learnedWordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = LearnedWordsAdapter(requireActivity(), this)
        binding.rvLearnedWords.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvLearnedWords.adapter = adapter
        adapter.submitList(learnedWordsList)

        binding.tvQuantityOfLearnedWords.text = learnedWordDatabase.learnedWordDao().count().toString()

        binding.tvChooseWord.setOnClickListener {randomLearned()}
        binding.ivChangeWords.setOnClickListener { changeLanguage() }

        binding.ivCloseCheckingWord.setOnClickListener {
            binding.tvCheckingWord.text = ""
            binding.tvCheckingTranslate.text = ""
            binding.tvCheckingTranslate.visibility = View.GONE
        }

        binding.ivEyeOpen.setOnClickListener {
                binding.tvCheckingTranslate.visibility = View.VISIBLE
            binding.ivEyeOpen.visibility = View.GONE
            binding.ivEyeClosed.visibility = View.VISIBLE
        }
        binding.ivEyeClosed.setOnClickListener {
                binding.tvCheckingTranslate.visibility = View.GONE
            binding.ivEyeClosed.visibility = View.GONE
            binding.ivEyeOpen.visibility = View.VISIBLE
        }
    }
    private fun getData() {
        val wordFromDb: List<LearnedWord> = getAll.execute()
        learnedWordsList.clear()
        learnedWordsList.addAll(wordFromDb)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteLearnedWords(index: Int) {
        val addDialog = AlertDialog.Builder(requireActivity())
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val learnedWords = learnedWordsList[index]
                viewModel.delete(learnedWords)
                binding.tvQuantityOfLearnedWords.text = learnedWordDatabase.learnedWordDao().count().toString()
                getData()
                adapter.notifyDataSetChanged()
                Toast.makeText(requireActivity(), "Запись удалена!", Toast.LENGTH_SHORT).show()
                dialog.dismiss()
            }
            .setNegativeButton("Отмена") { dialog, _ ->
                dialog.dismiss()
            }
            .create()
            .show()
    }
    private fun randomLearned(){
        val resultRandom = learnedWordDatabase.learnedWordDao().randoms()
        if(learnedWordDatabase.learnedWordDao().count() != 0){
            binding.tvCheckingWord.text = resultRandom.learnedEnglishWord
            binding.tvCheckingTranslate.text = resultRandom.learnedTranslateWord
        } else{
            Toast.makeText(requireActivity(), "Нет слов для отображения!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun changeLanguage() {
        val resultRandom = learnedWordDatabase.learnedWordDao().randoms()
        if(learnedWordDatabase.learnedWordDao().count() != 0){
            binding.tvCheckingWord.text = resultRandom.learnedTranslateWord
            binding.tvCheckingTranslate.text = resultRandom.learnedEnglishWord
        } else{
            Toast.makeText(requireActivity(), "Нет слов для отображения!", Toast.LENGTH_SHORT).show()
        }
    }
}