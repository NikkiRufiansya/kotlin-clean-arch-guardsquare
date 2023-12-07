package com.rmldemo.guardsquare.utils

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage



class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onMessageReceived(message: RemoteMessage) {
        super.onMessageReceived(message)

        if (message.data.isNotEmpty()){
            Log.d("TAG", "onMessageReceived: ${message.data}")
        }

        message.notification?.let {
            Log.d("TAG", "onMessageReceived: ${it.body}")
        }
    }
}