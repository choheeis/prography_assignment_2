package com.example.prography_assignment_2.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prography_assignment_2.R
import com.example.prography_assignment_2.room.CityInfo

class BookmarkAdapter(private val context: Context) : RecyclerView.Adapter<BookMarkViewHolder>() {

    var data = listOf<CityInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookMarkViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_cities, parent, false)
        return BookMarkViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: BookMarkViewHolder, position: Int) {
        holder.bind(data[position])
    }
}