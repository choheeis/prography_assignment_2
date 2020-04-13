package com.example.prography_assignment_2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CitiesObject {

    /** retrofit Object */
    private const val BASE_URL = "https://progserver.herokuapp.com"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service: CitiesInterface = retrofit.create(CitiesInterface::class.java)
}