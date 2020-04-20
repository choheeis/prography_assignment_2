package com.example.prography_assignment_2.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(CityInfo::class), version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun cityDao(): CityDao
}