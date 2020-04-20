package com.example.prography_assignment_2.room

import android.content.Context
import androidx.room.Room

class RoomAccess(context: Context) {
    val db = Room.databaseBuilder(context, AppDatabase::class.java, "prograpyDB").build()

    // 북마크한 데이터 삽입
    fun insertBookMark(cityInfo: CityInfo){
        val insertThread = Thread(Runnable {
            db.cityDao().insertBookMark(cityInfo)
        })
        insertThread.start()
    }

    // 북마크 해제한 데이터 삭제
    fun deleteBookMark(cityInfo: CityInfo){
        val deleteThread = Thread(Runnable {
            db.cityDao().deleteBookmark(cityInfo)
        })
        deleteThread.start()
    }

    // 북마크 된 데이터 전체 보여주기
    fun getAllBookMark(): List<CityInfo>{
        var cityInfo = listOf<CityInfo>()
        val getAllThread = Thread(Runnable {
            cityInfo = db.cityDao().getAll()
        })
        getAllThread.start()
        getAllThread.join()
        return cityInfo
    }

    // 모든 데이터 삭제
    fun deleteAllBookMark(){
        val deleteThread = Thread(Runnable {
            db.cityDao().deleteAll()
        })
        deleteThread.start()
    }
}