package com.example.vit_appdevelopment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.vit_appdevelopment.network.MarsPhoto

class MarsAdapter(var listMarsPhoto: List<MarsPhoto>): RecyclerView.Adapter<MarsAdapter.MarsViewHolder>() {
    class MarsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var textView:TextView = itemView.findViewById(R.id.tvUrl)
        var marsImageView:ImageView = itemView.findViewById(R.id.ivPhoto)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarsViewHolder {
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.row_layout ,parent,false)
        return MarsViewHolder(rowPlank)
    }

    override fun getItemCount(): Int {
        return listMarsPhoto.size
    }

    override fun onBindViewHolder(holder: MarsViewHolder, position: Int) {
        val url:String = listMarsPhoto.get(position).imgSrc
        holder.textView.setText(url)
        holder.marsImageView.load(url)

    }
}