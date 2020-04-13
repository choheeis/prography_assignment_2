package com.example.prography_assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var rvMain: RecyclerView
    private lateinit var rvAdapter: CitiesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
    }

    fun initRecyclerView(){
        rvMain = findViewById(R.id.rv_main)
        rvAdapter = CitiesAdapter(this)
        rvMain.adapter = rvAdapter
        rvMain.layoutManager = LinearLayoutManager(this)

        val call: Call<CitiesData> = CitiesObject.service.getCities()
        call.enqueue(
            object : Callback<CitiesData>{
                override fun onFailure(call: Call<CitiesData>, t: Throwable) {
                    Log.d("chohee", t.toString())
                }

                override fun onResponse(
                    call: Call<CitiesData>,
                    response: Response<CitiesData>
                ) {
                    rvAdapter.data = response.body()!!.cities
                    rvAdapter.notifyDataSetChanged()
                }
            }
        )

    }
}
