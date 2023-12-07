package com.rmldemo.guardsquare.ui.auth

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.rmldemo.guardsquare.R
import com.rmldemo.guardsquare.databinding.ActivityRegisterBinding
import javax.inject.Inject

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)


        auth = FirebaseAuth.getInstance()

        binding.btnRegister.setOnClickListener {
            register()
        }

    }

    fun register(){
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()

        auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { it ->
            if(it.isSuccessful){
                Toast.makeText(this, "Register Success", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Register Failed", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener { it ->
            Toast.makeText(this, it.localizedMessage, Toast.LENGTH_SHORT).show()
        }
    }
}