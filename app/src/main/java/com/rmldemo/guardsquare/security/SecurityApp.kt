package com.rmldemo.guardsquare.security

import android.app.Activity
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import com.rmldemo.guardsquare.ui.activity.WarningActivity
import com.rmldemo.guardsquare.utils.SessionManager
import java.lang.RuntimeException
import kotlin.math.acos


class SecurityApp {


    companion object {

        var detection: Boolean = false
        var pesan = ""
        val TAG = "SecurityApp"
        lateinit var firebaseCrashlytics: FirebaseCrashlytics
        lateinit var sessionManager: SessionManager
        var appUserId = ""

        @JvmStatic
        fun threatCast(context: Context) {
            sessionManager = SessionManager(context)
            appUserId = sessionManager.getEmail()
            //Toast.makeText(context, appUserId, Toast.LENGTH_SHORT).show()
        }


        @JvmStatic
        fun notification(activity: Context) {
            if (detection == true) {
                Toast.makeText(activity, pesan, Toast.LENGTH_SHORT).show()
                sessionManager = SessionManager(activity)
                appUserId = sessionManager.getEmail()
                uploadCrashlog(pesan)
                android.os.Process.killProcess(android.os.Process.myPid())
            }
        }

        fun uploadCrashlog(pesan: String) {
            firebaseCrashlytics = Firebase.crashlytics
            firebaseCrashlytics.setUserId("userTestingRML")
            throw RuntimeException(pesan)
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

        @JvmStatic
        fun getAuid(): String {
            return appUserId
        }
    }
}