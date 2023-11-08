package com.rmldemo.guardsquare.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.rmldemo.guardsquare.data.local.dao.NewsDao
import com.rmldemo.guardsquare.data.models.PrimaryNewsUUID
import com.rmldemo.guardsquare.data.models.news_by_category.StringListConverter
import com.rmldemo.guardsquare.data.models.news_by_category.News

@Database(entities = [News::class, PrimaryNewsUUID::class], version = 1)
@TypeConverters(StringListConverter::class)
abstract class AppDatabase :RoomDatabase(){
    abstract fun newsDao(): NewsDao

}