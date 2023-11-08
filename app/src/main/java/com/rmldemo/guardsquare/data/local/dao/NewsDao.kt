package com.rmldemo.guardsquare.data.local.dao

import androidx.room.*
import com.rmldemo.guardsquare.data.models.PrimaryNewsUUID
import com.rmldemo.guardsquare.data.models.news_by_category.News

@Dao
interface NewsDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(news: News)

    @Query("select * from news")
    fun getAllNews(): List<News>

    @Query("select * from news where uuid = :uuid")
    fun getNewsByUUID(uuid: String): News?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(primaryNewsUUID: PrimaryNewsUUID)

    @Query("select * from newEntity where id = 0")
    fun getPrimaryUUID(): PrimaryNewsUUID?
}