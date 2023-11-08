package com.rmldemo.guardsquare.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rmldemo.guardsquare.R
import com.rmldemo.guardsquare.databinding.ActivityWelcomeBinding
import com.rmldemo.guardsquare.ui.fregment.welcome.SplashFragment

class WelcomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_welcome, SplashFragment())
            .commit()
    }
}