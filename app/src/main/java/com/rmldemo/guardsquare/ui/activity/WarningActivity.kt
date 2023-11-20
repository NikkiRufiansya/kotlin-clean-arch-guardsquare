package com.rmldemo.guardsquare.ui.activity

import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.rmldemo.guardsquare.R
import com.rmldemo.guardsquare.databinding.ActivityWarningBinding
import com.rmldemo.guardsquare.security.SecurityApp


class WarningActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWarningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWarningBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getSupportActionBar()?.hide()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window
            w.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }
        binding.tvMessage.text = SecurityApp.pesan

//        android.os.Process.killProcess(android.os.Process.myPid())
        //System.exit(0)

    }
}