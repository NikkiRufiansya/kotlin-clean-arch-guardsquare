package com.rmldemo.guardsquare

import android.app.Application
import com.rmldemo.guardsquare.di.component.DaggerAppComponent
import com.rmldemo.guardsquare.di.module.NetworkModule
import com.rmldemo.guardsquare.utils.Topics.appComponent

class App : Application() {

    companion object{
        const val API_KEY = "H1J12hztuqaZiKQgJMUvDyCfyIX1VvMuDfbYIdnE"
    }


    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .networkModule(NetworkModule(this))
            .build()
    }

}