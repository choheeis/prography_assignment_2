package com.example.prography_assignment_2

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CitiesAdapter(private val context: Context) : RecyclerView.Adapter<CItiesViewHolder>() {

    var data = listOf<CitiesInfoData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CItiesViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_cities, parent, false)
        return CItiesViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: CItiesViewHolder, position: Int) {
        holder.bind(data[position])
    }
}