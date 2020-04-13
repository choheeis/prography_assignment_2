package com.example.prography_assignment_2

import com.google.gson.annotations.SerializedName

data class CitiesInfoData (
    @SerializedName("no")
    val no: Int,
    @SerializedName("city")
    val city: String,
    @SerializedName("url")
    val url: String
)
