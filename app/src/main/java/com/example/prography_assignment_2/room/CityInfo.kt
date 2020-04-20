package com.example.prography_assignment_2.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CityInfo (
    @PrimaryKey
    val cityNum: Int,
    @ColumnInfo(name = "city_name")
    val cityName: String,
    @ColumnInfo(name = "city_url")
    val cityUrl: String
)