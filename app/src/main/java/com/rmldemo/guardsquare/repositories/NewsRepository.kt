package com.rmldemo.guardsquare.repositories

import com.rmldemo.guardsquare.data.local.dao.NewsDao
import com.rmldemo.guardsquare.data.models.PrimaryNewsUUID
import com.rmldemo.guardsquare.data.models.news_by_category.News
import com.rmldemo.guardsquare.data.remote.ApiService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val apiService: ApiService,
    private val newsDao: NewsDao
) {

    suspend fun getNewsByCategory(category: String, language: String) =
        flow {
            if (language.equals("cn"))
                emit(apiService.getNews(category = category, language = "zh"))
            else emit(apiService.getNews(category = category, language = language))
        }

    fun insertPrimaryUUID(primaryNewsUUID: PrimaryNewsUUID) = newsDao.insert(primaryNewsUUID)
    fun getPrimaryUUID() = newsDao.getPrimaryUUID()


    fun insertNews(news: News) = newsDao.insert(news)
    fun getNewsByUUID(uuid: String) = newsDao.getNewsByUUID(uuid)

    suspend fun getSearchedNews(string: String, language: String) = flow {
        if (language.equals("cn"))

        emit(apiService.getSearchedNews(search = string, language = "zh"))
        else
            emit(apiService.getSearchedNews(search = string, language = language))

    }


}