package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.reportezapp.databinding.ActivityLoginadminBinding
import com.google.firebase.auth.FirebaseAuth

class loginadmin : AppCompatActivity() {

    private lateinit var binding: ActivityLoginadminBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginadminBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.b2.setOnClickListener {
            val email = binding.editText2.text.toString()
            val pass = binding.editText.text.toString()
            if (email.isNotEmpty() && pass.isNotEmpty()){
                firebaseAuth.signInWithEmailAndPassword(email, pass).addOnCompleteListener{ task ->
                    if (task.isSuccessful){
                        // Start UserPage activity after successful login
                        val intent = Intent(this, recyc::class.java )
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
