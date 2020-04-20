package com.example.prography_assignment_2.room

import androidx.room.*

@Dao
interface CityDao {
    @Query("select * from cityinfo")
    fun getAll(): List<CityInfo>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBookMark(cityInfo: CityInfo)

    @Delete
    fun deleteBookmark(cityInfo: CityInfo)

    @Query("delete from cityinfo")
    fun deleteAll()
}