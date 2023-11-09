package com.rmldemo.guardsquare.di.component

import com.rmldemo.guardsquare.di.module.DatabaseModule
import com.rmldemo.guardsquare.di.module.NetworkModule
import com.rmldemo.guardsquare.security.SecurityApp
import com.rmldemo.guardsquare.ui.fregment.article.ArticleFragment
import com.rmldemo.guardsquare.ui.fregment.bookmark.BookmarkFragment
import com.rmldemo.guardsquare.ui.fregment.category.CategoryFragment
import com.rmldemo.guardsquare.ui.fregment.home.HomeFragment
import com.rmldemo.guardsquare.ui.activity.MainActivity
import com.rmldemo.guardsquare.ui.fregment.profile.ProfileFragment
import com.rmldemo.guardsquare.ui.fregment.welcome.SplashFragment
import com.rmldemo.guardsquare.ui.fregment.welcome.TopicFragment
import com.rmldemo.guardsquare.ui.fregment.search.SearchFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class])
interface AppComponent {

    fun inject(mainActivity: MainActivity)

    fun inject(homeFragment: HomeFragment)

    fun inject(articleFragment: ArticleFragment)

    fun inject(searchFragment: SearchFragment)

    fun inject(topicFragment: TopicFragment)

    fun inject(splashFragment: SplashFragment)

    fun inject(bookmarkFragment: BookmarkFragment)

    fun inject(categoryFragment: CategoryFragment)

    fun inject(profileFragment: ProfileFragment)




}