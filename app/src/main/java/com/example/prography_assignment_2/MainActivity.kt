package com.example.prography_assignment_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        rvAdapter.data = listOf(
            CitiesData(
                no = 1,
                city = "Seoul",
                url = "http~~~"
            ),
            CitiesData(
                no = 2,
                city = "Seoul2",
                url = "http~~~2"
            )
        )
        rvAdapter.notifyDataSetChanged()
    }
}
