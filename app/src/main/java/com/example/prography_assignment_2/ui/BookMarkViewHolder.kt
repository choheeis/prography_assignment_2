package com.example.prography_assignment_2.ui


import android.view.View
import android.widget.CheckedTextView
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.example.prography_assignment_2.R
import com.example.prography_assignment_2.room.CityInfo

class BookMarkViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvNo = itemView.findViewById<TextView>(R.id.tv_no)
    val tvCity = itemView.findViewById<TextView>(R.id.tv_city)
    val tvUrl = itemView.findViewById<TextView>(R.id.tv_url)
    val ctvStar = itemView.findViewById<CheckedTextView>(R.id.ctv_star)


    fun bind(data: CityInfo){
        tvNo.text = data.cityNum.toString()
        tvCity.text = data.cityName
        tvUrl.text = "url : " + data.cityUrl
        ctvStar.isVisible = false
    }

}