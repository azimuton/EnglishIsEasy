package com.azimuton.englishiseasy.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimuton.domain.models.LearnedWord
import com.azimuton.englishiseasy.R
import com.azimuton.englishiseasy.fragments.LearnedFragment

class LearnedWordsAdapter(
    private val contextA: Context,
    private val callback : LearnedFragment
)
    : androidx.recyclerview.widget.ListAdapter<LearnedWord, LearnedWordsAdapter.ViewHolder>(LearnedWordsDiffCallback()){
    class ViewHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView) {

        interface ItemCallback{
            fun deleteLearnedWords(index : Int)
        }

        val context = contextV
        val learnedEnglishWord : TextView = itemView.findViewById(R.id.tvItemLearnedWord)
        val learnedTranslateWord : TextView = itemView.findViewById(R.id.tvItemLearnedTranslate)
        val showTranslateClosed : ImageView = itemView.findViewById(R.id.ivItemEyeLearnedClose)
        val showTranslateOpen : ImageView = itemView.findViewById(R.id.ivItemEyeLearnedOpen)
        val deleteLearnedWords : ImageView = itemView.findViewById(R.id.ivItemDeleteLearnedWord)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA)
            .inflate(R.layout.item_learned_words, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.learnedEnglishWord.text = currentList[position].englishLearnedWord
        holder.learnedTranslateWord.text = currentList[position].translateLearnedWord
        holder.deleteLearnedWords.setOnClickListener {
            callback.deleteLearnedWords(position)
        }
        holder.showTranslateOpen.setOnClickListener {
            holder.learnedTranslateWord.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.VISIBLE
            holder.showTranslateOpen.visibility = View.GONE
        }
        holder.showTranslateClosed.setOnClickListener {
            holder.learnedTranslateWord.visibility = View.GONE
            holder.showTranslateOpen.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.GONE
        }
    }



}