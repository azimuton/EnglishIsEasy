package com.azimuton.englishiseasy.adapters

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil
import com.azimuton.domain.models.LearnedWord

class LearnedWordsDiffCallback : DiffUtil.ItemCallback<LearnedWord>() {
    override fun areItemsTheSame(oldItem: LearnedWord, newItem: LearnedWord): Boolean {
        return  oldItem.id == newItem.id
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: LearnedWord, newItem: LearnedWord): Boolean {
        return oldItem == newItem
    }
}