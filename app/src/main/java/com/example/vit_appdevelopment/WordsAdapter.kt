package com.example.vit_appdevelopment

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class WordsAdapter(var dataArray: Array<String>) : RecyclerView.Adapter<WordsAdapter.WordsViewHolder>() {

    var TAG = WordsAdapter::class.java.simpleName

//    avinash - buy row planks from market n give to sundar
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordsViewHolder {
//        inflate the row_layout_xml file in memory
        Log.i(TAG, "ranjit bought a row plank")
        var rowPlank = LayoutInflater.from(parent.context).inflate(R.layout.row_layout_item, parent, false)
        return WordsViewHolder(rowPlank)
    }

//    balaji - keeping count of no of items in a dataset n informs avinash
    override fun getItemCount(): Int {
        Log.i(TAG, "balaji counted-" +dataArray.size)
        return dataArray.size
    }

//    chirag - write the data on the row plank given by sundar
    override fun onBindViewHolder(holder: WordsViewHolder, position: Int) {
        Log.i(TAG, "chirag is writing -- "+dataArray[position]+"on the textview shown by sundar")
        holder.tvRowItem.setText(dataArray[position])
    }

//    sundar - maintain the reserve planks in the holder box
    class WordsViewHolder(itemView: View) : ViewHolder(itemView){
        init{
            Log.i("WordsAdapter", "sundar is finding teh textview row plank")
        }
    var tvRowItem = itemView.findViewById<TextView>(R.id.tvRow)
    }
}