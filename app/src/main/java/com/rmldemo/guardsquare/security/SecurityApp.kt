package com.rmldemo.guardsquare.security

import android.content.Context
import android.util.Log
import android.widget.Toast

class SecurityApp  {



    companion object{

        var detection : Boolean = false
        var pesan = ""

        @JvmStatic
        fun notification(context: Context){
            if (detection == true){
                Toast.makeText(context, pesan, Toast.LENGTH_SHORT).show()
                android.os.Process.killProcess(android.os.Process.myPid())
            }
        }

        @JvmStatic
        fun emulator(debugInfo: Long){
            detection = true
            pesan = "Emulator Detected"
            Log.d("SecurityApp", pesan)
        }
    }
}