package com.winmin.assignment6.model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.winmin.assignment6.R
import kotlinx.android.synthetic.main.item_collect.view.*

class ItemAdapter(var flowerlist: ArrayList<Item>) :
    RecyclerView.Adapter<ItemAdapter.FlowerViewHolder>() {
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: Item) {
            itemView.txtName.text = item.name

            itemView.Image.setImageResource(item.image)

        }
    }

    override fun getItemCount(): Int = flowerlist.size

    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerlist[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_collect, parent, false)
        return FlowerViewHolder(view)
    }
}