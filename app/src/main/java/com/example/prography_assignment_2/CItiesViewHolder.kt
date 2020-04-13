package com.example.prography_assignment_2


import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CItiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvNo = itemView.findViewById<TextView>(R.id.tv_no)
    val tvCity = itemView.findViewById<TextView>(R.id.tv_city)
    val tvUrl = itemView.findViewById<TextView>(R.id.tv_url)

    fun bind(data: CitiesInfoData){
        tvNo.text = data.no.toString()
        tvCity.text = data.city
        tvUrl.text = "url : " + data.url
    }
}