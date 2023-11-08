package com.rmldemo.guardsquare.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.rmldemo.guardsquare.data.models.news_by_category.StringListConverter

@Entity(tableName = "newEntity")
data class PrimaryNewsUUID  constructor(
    @PrimaryKey(autoGenerate = false)
    val id :Int = 0,
    @TypeConverters(StringListConverter::class)
    val list: List<String>?=null
){

}