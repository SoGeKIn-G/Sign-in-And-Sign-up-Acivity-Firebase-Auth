package com.gauravbora.librarymanagementsystem

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.gauravbora.librarymanagementsystem.databinding.ActivitySigninBinding
import com.gauravbora.librarymanagementsystem.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth

class Signin_Activity : AppCompatActivity() {
private lateinit var  binding: ActivitySigninBinding
private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textView.setOnClickListener {
            val intent = Intent(this, Signup_Activity::class.java)
            startActivity(intent)
        }
        firebaseAuth = FirebaseAuth.getInstance()
        binding.SignInbutton.setOnClickListener{

            val email = binding.emailEt.text.toString()
            val pass = binding.passEt.text.toString()

            if ( email.isNotEmpty() && pass.isNotEmpty() ) {

                    firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener() {
                            if (it.isSuccessful) {
                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                            } else {
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT)
                                    .show()
                            }
                    }

            }
        else{
            Toast.makeText(this, "Empty fields are not allowed", Toast.LENGTH_SHORT).show()
        }
        }






    }
}