package com.example.prography_assignment_2

import com.google.gson.annotations.SerializedName

data class CitiesData (
    @SerializedName("cities")
    val cities: List<CitiesInfoData>
)
