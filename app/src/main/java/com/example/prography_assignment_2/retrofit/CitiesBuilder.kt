package com.example.prography_assignment_2.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CitiesBuilder {

    /** retrofit Object */
    private const val BASE_URL = "https://progserver.herokuapp.com"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: CitiesInterface = retrofit.create(
        CitiesInterface::class.java)
}


