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
    private val callback : LearnFragment)
    : androidx.recyclerview.widget.ListAdapter<Word, NewWordsAdapter.ViewHolder>(WordDiffCallback()){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA).inflate(R.layout.item_new_words, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.englishWord.text = currentList[position].englishWord
        holder.translateWord.text = currentList[position].translateWord
        holder.deleteWords.setOnClickListener {
            callback.deleteWords(position)
        }
        holder.copyWord.setOnClickListener {
            callback.copyWords(position)
        }
        holder.showTranslateOpen.setOnClickListener {
            holder.translateWord.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.VISIBLE
            holder.showTranslateOpen.visibility = View.GONE
        }
        holder.showTranslateClosed.setOnClickListener {
            holder.translateWord.visibility = View.GONE
            holder.showTranslateOpen.visibility = View.VISIBLE
            holder.showTranslateClosed.visibility = View.GONE
        }
    }

    class ViewHolder(itemView: View, contextV: Context) : RecyclerView.ViewHolder(itemView){

        val context = contextV
        val englishWord : TextView = itemView.findViewById(R.id.tvItemWord)
        val translateWord : TextView = itemView.findViewById(R.id.tvItemTranslate)
        val showTranslateClosed : ImageView = itemView.findViewById(R.id.ivItemEyeClosed)
        val showTranslateOpen : ImageView = itemView.findViewById(R.id.ivItemEyeOpen)
        val copyWord : ImageView = itemView.findViewById(R.id.ivItemCopyWordToLearned)
        val deleteWords : ImageView = itemView.findViewById(R.id.ivItemDelete)

        interface ItemCallback{
            fun copyWords(index : Int)
            fun deleteWords(index : Int)
        }
    }


}