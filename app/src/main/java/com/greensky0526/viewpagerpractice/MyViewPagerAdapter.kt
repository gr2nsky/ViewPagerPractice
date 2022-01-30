package com.greensky0526.viewpagerpractice

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class MyViewPagerAdapter(idolList: ArrayList<Int>) :
    RecyclerView.Adapter<MyViewPagerAdapter.PagerViewHolder>() {

    inner class PagerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
        (LayoutInflater.from(parent.context).inflate(R.layout.aespa_list_item, parent, false)) {
        val idol = itemView.findViewById<ImageView>(R.id.iv_aespa)
    }

    var item = idolList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PagerViewHolder((parent))

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.idol.setImageResource(item[position])
    }
}