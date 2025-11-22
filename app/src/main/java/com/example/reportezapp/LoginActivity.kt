package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.reportezapp.databinding.ActivityLoginBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.button2.setOnClickListener {
            val email = binding.editText2.text.toString()
            val pass = binding.editText.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        // Start UserPage activity after successful login
                        val intent = Intent(this, complaintpage1::class.java )
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

        /*binding.buttonPanel.setOnClickListener {
            val email = binding.editText2.text.toString()
            val pass = binding.editText.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        // Start Form activity after successful login
                        val intent = Intent(this, Form::class.java )
                        startActivity(intent)
                        finish() // Finish LoginActivity so that it's not in the back stack
                    } else {
//                        Log.e("LoginActivity", "Login failed", task.exception)
                        Toast.makeText(this, task.exception?.message ?: "Login failed", Toast.LENGTH_SHORT).show()
                    }
                }
            } else{
                Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show()
            }
        }*/
    }
}
