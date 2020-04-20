package com.example.prography_assignment_2.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface CitiesInterface {
    @GET("/api/cities")
    fun getCities(): Call<CitiesData>
}