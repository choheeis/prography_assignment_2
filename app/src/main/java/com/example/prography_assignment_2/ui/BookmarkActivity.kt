package com.example.prography_assignment_2.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.prography_assignment_2.R
import com.example.prography_assignment_2.room.RoomAccess

class BookmarkActivity : AppCompatActivity() {

    private lateinit var rvBookMark: RecyclerView
    private lateinit var rvBookMarkAdapter: BookmarkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bookmark)

        initBookMarkRecyclerView()
    }

    fun initBookMarkRecyclerView(){
        rvBookMark = findViewById(R.id.rv_bookmark)
        rvBookMarkAdapter = BookmarkAdapter(this)
        rvBookMark.adapter = rvBookMarkAdapter
        rvBookMark.layoutManager = LinearLayoutManager(this)
        rvBookMarkAdapter.data = RoomAccess(this).getAllBookMark()
        rvBookMarkAdapter.notifyDataSetChanged()
    }
}

