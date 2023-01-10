package com.azimuton.englishiseasy.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimuton.domain.models.Word
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.fragments.LearnFragment

class NewWordsAdapter(
    private val contextA: Context,
    private val wordList: List<Word>,
    private val callback : LearnFragment)
    : RecyclerView.Adapter<NewWordsAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA).inflate(R.layout.item_new_words, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.englishWord.text = wordList[position].englishWord
        holder.translateWord.text = wordList[position].translateWord
        holder.deleteWord.setOnClickListener {
            callback.deleteWords(position)
        }
        holder.copyWord.setOnClickListener {
            callback.copyWords(position)
        }
        holder.showTranslate.setOnClickListener {
            callback.showTranslate(position)
        }
    }

    override fun getItemCount(): Int {
        return  wordList.size
    }

    class ViewHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView){

        val context = contextV
        val englishWord : TextView = itemView.findViewById(R.id.tvItemWord)
        val translateWord : TextView = itemView.findViewById(R.id.tvItemTranslate)
        val showTranslate : ImageView = itemView.findViewById(R.id.ivItemEye)
        val copyWord : ImageView = itemView.findViewById(R.id.ivItemCopyWordToLearned)
        val deleteWord : ImageView = itemView.findViewById(R.id.ivItemDelete)

        interface ItemCallback{
            fun showTranslate(index : Int)
            fun copyWords(index : Int)
            fun deleteWords(index : Int)
        }
    }


}