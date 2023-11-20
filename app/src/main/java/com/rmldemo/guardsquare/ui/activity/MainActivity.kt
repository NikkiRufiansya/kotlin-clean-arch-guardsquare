package com.rmldemo.guardsquare.ui.activity

import android.animation.Animator
import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import com.rmldemo.guardsquare.R
import com.rmldemo.guardsquare.databinding.ActivityMainBinding
import com.rmldemo.guardsquare.themes.LightTheme
import com.rmldemo.guardsquare.themes.MyAppTheme
import com.rmldemo.guardsquare.themes.NightTheme
import com.rmldemo.guardsquare.ui.fregment.bookmark.BookmarkFragment
import com.rmldemo.guardsquare.ui.fregment.category.CategoryFragment
import com.rmldemo.guardsquare.ui.fregment.home.HomeFragment
import com.rmldemo.guardsquare.ui.fregment.profile.ProfileFragment
import com.rmldemo.guardsquare.utils.LocaleHelper
import com.rmldemo.guardsquare.utils.Topics.appComponent
import com.dolatkia.animatedThemeManager.AppTheme
import com.dolatkia.animatedThemeManager.ThemeActivity
import com.dolatkia.animatedThemeManager.ThemeAnimationListener
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.analytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase
import com.rmldemo.guardsquare.security.SecurityApp

class MainActivity : ThemeActivity(), MainView, ThemeAnimationListener {

    private lateinit var binding: ActivityMainBinding
    lateinit var sPref:SharedPreferences
    lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun getStartTheme(): AppTheme {
        sPref = applicationContext.getSharedPreferences("shared", MODE_PRIVATE)
        return if (sPref.getString("mode", "") == "night") {
            NightTheme()
        } else LightTheme()
    }

    override fun attachBaseContext(newBase: Context?) {
        LocaleHelper.onAttach(newBase!!)
        super.attachBaseContext(newBase)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setThemeAnimationListener(this)

        firebaseAnalytics()


        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, HomeFragment())
            .commit()
        setUpBottomNav()


    }

    fun firebaseAnalytics(){
        firebaseAnalytics = Firebase.analytics
        firebaseAnalytics.appInstanceId

    }

    override fun syncTheme(appTheme: AppTheme) {
        val myAppTheme = appTheme as MyAppTheme
        this.let {
            // set background color
            binding.bottomNavView.setBackgroundColor(myAppTheme.activityBottomNavViewBackColor(it))
        }
    }


    private fun setUpBottomNav() {
        binding.bottomNavView.setOnItemSelectedListener { item ->
            val fragment = when (item.itemId) {
            R.id.home -> {
                HomeFragment()
            }
            R.id.category -> {
                CategoryFragment()
            }
            R.id.bookmark -> {
                BookmarkFragment()
            }
            R.id.profile -> {
                ProfileFragment()
            }
            else -> HomeFragment()
        }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
            true
        }
    }

    override fun hideBottomBar() {
        binding.bottomNavView.visibility = View.GONE
    }

    override fun showBottomBar() {
        binding.bottomNavView.visibility = View.VISIBLE
    }

    override fun backPressed() {
        onBackPressed()
    }

    override fun restart() {
        recreate()
    }

    override fun onAnimationCancel(animation: Animator) {}

    override fun onAnimationEnd(animation: Animator) {
        binding.view.visibility = View.GONE
    }

    override fun onAnimationRepeat(animation: Animator) {}

    override fun onAnimationStart(animation: Animator) {}

    fun disableBottomNav(){
        binding.view.visibility = View.VISIBLE
    }

}