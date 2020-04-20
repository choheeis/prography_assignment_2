package com.example.prography_assignment_2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prography_assignment_2.R
import com.example.prography_assignment_2.retrofit.CitiesBuilder
import com.example.prography_assignment_2.retrofit.CitiesData
import com.example.prography_assignment_2.room.RoomAccess
import kotlinx.android.synthetic.main.activity_main.*
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
        getBookmark()
    }

    fun initRecyclerView(){
        rvMain = findViewById(R.id.rv_main)
        rvAdapter = CitiesAdapter(this)
        rvMain.adapter = rvAdapter
        rvMain.layoutManager = LinearLayoutManager(this)

        val call: Call<CitiesData> = CitiesBuilder.service.getCities()
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

    fun getBookmark(){
        tv_db.setOnClickListener {
            val intent = Intent(this, BookmarkActivity::class.java)
            startActivity(intent)
        }
    }

    override fun finish() {
        super.finish()
        RoomAccess(this).deleteAllBookMark()
    }
}
