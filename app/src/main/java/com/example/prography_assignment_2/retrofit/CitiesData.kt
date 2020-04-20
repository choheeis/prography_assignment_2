package com.example.prography_assignment_2.retrofit

import com.example.prography_assignment_2.ui.CitiesInfoData
import com.google.gson.annotations.SerializedName

data class CitiesData (
    @SerializedName("cities")
    val cities: List<CitiesInfoData>
)
