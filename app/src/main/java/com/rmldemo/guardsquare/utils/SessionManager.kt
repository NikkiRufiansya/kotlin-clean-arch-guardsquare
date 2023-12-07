package com.rmldemo.guardsquare.utils

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import com.rmldemo.guardsquare.ui.auth.LoginActivity

class SessionManager(private val context: Context) {
    private val prefName = "rml-demo-gs"
    private val _context = context
    private val isLogin = "isLoggedIn"
    private var sharedPreferences: SharedPreferences = _context.getSharedPreferences(prefName, 0)
    private var editor: SharedPreferences.Editor = sharedPreferences.edit()

    fun setIsLogin(){
        editor.putBoolean(isLogin, true)
        editor.commit()
    }

    fun getIsLogin(): Boolean{
        return sharedPreferences.getBoolean(isLogin, false)
    }

    fun setEmail(email: String){
        editor.putString("email", email)
        editor.commit()
    }

    fun getEmail(): String {
        return sharedPreferences.getString("email", "").toString()
    }

    fun logoutUser(){
        editor.clear()
        editor.commit()
        val i = Intent(_context, LoginActivity::class.java)
        i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        _context.startActivity(i)
    }
}