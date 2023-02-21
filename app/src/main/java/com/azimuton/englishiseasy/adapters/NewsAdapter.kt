package com.azimuton.englishiseasy.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.azimuton.domain.apimodels.Result
import com.azimuton.englishiseasy.R
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso

class NewsAdapter(private val contextA: Context, private val listNews: List<Result>,
                  val mItemClickListener: ItemClickListener)  : RecyclerView.Adapter<NewsAdapter.ViewHolder>() {
    inner class ViewHolder(itemView : View, contextV: Context)  : RecyclerView.ViewHolder(itemView) {

        init {
            itemView.setOnClickListener {
                mItemClickListener.onItemClick(adapterPosition)
                mItemClickListener.details(adapterPosition, listNews)
                }
        }

        val context = contextV
        var title: TextView? = null
        var image : ImageView? = null

        init{
            title = itemView.findViewById(R.id.tvTitleItem)
            image  = itemView.findViewById(R.id.ivItemImage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(contextA).inflate(R.layout.item_list, parent, false), contextA)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val listItem = listNews[position]
        if(listNews[position].image_url != null){
            Glide.with(contextA)
                .load(listNews[position].image_url)
                .into(holder.image!!)
        } else {
            holder.image?.setImageResource(R.drawable.errorload)
        }
        holder.title?.text = listItem.title

    }

    override fun getItemCount(): Int {
        return listNews.size
    }
    interface  ItemClickListener{
        fun onItemClick(position: Int)
        fun details(position: Int, listNews: List<Result>)
    }

}