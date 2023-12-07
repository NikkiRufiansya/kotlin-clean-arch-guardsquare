package com.rmldemo.guardsquare.ui.auth

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.rmldemo.guardsquare.R
import com.rmldemo.guardsquare.databinding.ActivityLoginBinding
import com.rmldemo.guardsquare.ui.activity.MainActivity
import com.rmldemo.guardsquare.utils.SessionManager
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    lateinit var auth: FirebaseAuth
    lateinit var sessionManager: SessionManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        sessionManager = SessionManager(this)

        binding.tvToLogin.setOnClickListener {

            startActivity(Intent(this, RegisterActivity::class.java))

        }

        binding.btnLogin.setOnClickListener {
            login()
        }


    }

    fun login(){
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()

        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener { it ->
            if (it.isSuccessful){
                sessionManager.setIsLogin()
                sessionManager.setEmail(email)
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener { it ->
            Toast.makeText(this, it.localizedMessage, Toast.LENGTH_SHORT).show()
        }
    }
}