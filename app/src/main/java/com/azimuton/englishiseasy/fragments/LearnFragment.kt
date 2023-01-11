package com.azimuton.englishiseasy.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import com.azimuton.data.storage.room.AppRoomDatabase
import com.azimuton.domain.models.Word
import com.azimuton.domain.usecase.WordDeleteUseCase
import com.azimuton.domain.usecase.WordGetAllUseCase
import com.azimuton.domain.usecase.WordInsertUseCase
import com.azimuton.englishiseasy.adapters.NewWordsAdapter
import com.azimuton.englishiseasy.databinding.FragmentLearnBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LearnFragment : Fragment(), NewWordsAdapter.ViewHolder.ItemCallback {
    private lateinit var binding: FragmentLearnBinding
    private lateinit var adapter: NewWordsAdapter
    lateinit var wordDatabase : AppRoomDatabase
    private lateinit var wordList: ArrayList<Word>
    @Inject
    lateinit var insert : WordInsertUseCase
    @Inject
    lateinit var getAll : WordGetAllUseCase
    @Inject
    lateinit var delete : WordDeleteUseCase


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentLearnBinding.inflate(inflater, container, false)
        return binding.root
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        wordList = ArrayList<Word>()
        wordDatabase = AppRoomDatabase.getDatabase(requireActivity())
        getData()
        adapter = NewWordsAdapter(requireActivity(), wordList,this)
        binding.rvNewWords.layoutManager = LinearLayoutManager(requireActivity())
        binding.rvNewWords.adapter = adapter
        adapter.notifyDataSetChanged()


        binding.tvSaveNewWord.setOnClickListener {
            if (binding.etNewWord.text.isNotEmpty() && binding.etTranslate.text.isNotEmpty()) {
                val englishWord: String = binding.etNewWord.text.toString()
                val translateWord: String = binding.etTranslate.text.toString()
                val word = Word(englishWord = englishWord, translateWord = translateWord, id = 0)
                Toast.makeText(requireActivity(), "Поля заполнены!", Toast.LENGTH_SHORT).show()
                insert.execute(word)
                adapter.notifyDataSetChanged()
            } else {
                Toast.makeText(
                    requireActivity(), "Заполните пустые поля!",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
    private fun getData() {
        val wordFromDb: List<Word> = getAll.execute()
        wordList.clear()
        wordList.addAll(wordFromDb)
    }

    override fun showTranslate(index: Int) {

    }

    override fun copyWords(index: Int) {
        TODO("Not yet implemented")
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun deleteWords(index: Int) {
        val addDialog = AlertDialog.Builder(requireActivity())
        addDialog
            .setMessage("Вы действительно хотите удалить запись?")
            .setPositiveButton("Ok") { dialog, _ ->
                val words = wordList[index]
                delete.execute(words)
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

}