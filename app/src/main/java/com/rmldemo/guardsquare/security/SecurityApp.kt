package com.rmldemo.guardsquare.security

import android.content.Context
import android.util.Log
import android.widget.Toast

class SecurityApp {


    companion object {

        var detection: Boolean = false
        var pesan = ""
        val TAG = "SecurityApp"

        @JvmStatic
        fun notification(context: Context) {
            if (detection == true) {
                Toast.makeText(context, pesan, Toast.LENGTH_SHORT).show()
                android.os.Process.killProcess(android.os.Process.myPid())
            }
        }

        @JvmStatic
        fun emulator(debugInfo: Long) {
            detection = true
            pesan = "Emulator Detected"
            Log.d(TAG, pesan)
        }

        @JvmStatic
        fun root(debugInfo: Long) {
            detection = true
            pesan = "root Detected"
            Log.d(TAG, pesan)
        }

        @JvmStatic
        fun hook(debugInfo: Long) {
            detection = true
            pesan = "hook Detected"
            Log.d(TAG, pesan)
        }
        @JvmStatic
        fun filetamper(debugInfo: Long) {
            detection = true
            pesan = "File Tamper Detection"
            Log.d(TAG, pesan)
        }
        @JvmStatic
        fun apptamper(debugInfo: Long) {
            detection = true
            pesan = "App Tamper Detection"
            Log.d(TAG, pesan)
        }


    }
}