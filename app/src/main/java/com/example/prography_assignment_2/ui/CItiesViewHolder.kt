package com.example.prography_assignment_2.ui


import android.view.View
import android.widget.CheckedTextView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.prography_assignment_2.R
import com.example.prography_assignment_2.room.CityInfo
import com.example.prography_assignment_2.room.RoomAccess

class CItiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvNo = itemView.findViewById<TextView>(R.id.tv_no)
    val tvCity = itemView.findViewById<TextView>(R.id.tv_city)
    val tvUrl = itemView.findViewById<TextView>(R.id.tv_url)
    val ctvStar = itemView.findViewById<CheckedTextView>(R.id.ctv_star)

    fun bind(data: CitiesInfoData){
        tvNo.text = data.no.toString()
        tvCity.text = data.city
        tvUrl.text = "url : " + data.url

        ctvStar.setOnClickListener {
            ctvStar.toggle()
            if(ctvStar.isChecked == true){
                RoomAccess(itemView.context).insertBookMark(CityInfo(data.no, data.city, data.url))
            }else{
                RoomAccess(itemView.context).deleteBookMark(CityInfo(data.no, data.city, data.url))
            }
        }

    }

}