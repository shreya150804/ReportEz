package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.reportezapp.databinding.ActivityNewaccBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class newAcc : AppCompatActivity() {

    private lateinit var binding: ActivityNewaccBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewaccBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.cacc.setOnClickListener {
            val name = binding.editText61.text.toString()
            val conpass = binding.editText13.text.toString()

            val email = binding.editText71.text.toString()
            val pass = binding.editText21.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty() && conpass.isNotEmpty()){
                firebaseAuth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        // Start UserPage activity after successful login
                        val intent = Intent(this, LoginActivity::class.java )
                        startActivity(intent)
                        finish() // Finish LoginActivity so that it's not in the back stack
                    } else {
                        Toast.makeText(this, task.exception?.message ?: "Login failed", Toast.LENGTH_SHORT).show()
                    }
                }
            } else{
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }


    }
}