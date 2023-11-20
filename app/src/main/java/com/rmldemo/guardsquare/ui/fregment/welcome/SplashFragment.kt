package com.rmldemo.guardsquare.ui.fregment.welcome

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rmldemo.guardsquare.R
import com.rmldemo.guardsquare.databinding.FragmentSplashBinding
import com.rmldemo.guardsquare.ui.activity.MainActivity
import com.rmldemo.guardsquare.ui.activity.WelcomeActivity
import com.rmldemo.guardsquare.utils.Topics.appComponent
import com.dolatkia.animatedThemeManager.AppTheme
import com.dolatkia.animatedThemeManager.ThemeFragment
import com.rmldemo.guardsquare.security.SecurityApp
import javax.inject.Inject

class SplashFragment : ThemeFragment() {

    private var _binding: FragmentSplashBinding? = null
    private val binding get() = _binding!!
    @Inject
    lateinit var sPref: SharedPreferences

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSplashBinding.inflate(layoutInflater, container, false)
        appComponent.inject(this)


        val user = sPref.getBoolean("isUserRegistered", false)
        val handler = Handler(Looper.getMainLooper())
        val runnable = Runnable {
            context?.let { SecurityApp.notification(it) }
            if (!user) {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container_welcome, OnBoardingFragment())
                    .commit()
            } else {
                (activity as WelcomeActivity?)?.finish()

                val intent =
                    Intent(binding.root.context.applicationContext, MainActivity::class.java)
                startActivity(intent)
            }




        }

        handler.postDelayed(runnable, 2500)
        return binding.root
    }

    override fun syncTheme(appTheme: AppTheme) {

    }
}