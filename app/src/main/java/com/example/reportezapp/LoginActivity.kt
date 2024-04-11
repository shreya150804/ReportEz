package com.example.reportezapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        // Bind views
        val emailEditText = findViewById<EditText>(R.id.editText2)
        val passwordEditText = findViewById<EditText>(R.id.editText)
        val loginButton = findViewById<Button>(R.id.button2)
        val registerButton = findViewById<Button>(R.id.buttonPanel)

        // Set click listeners
        loginButton.setOnClickListener {
            // Handle login button click
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Here you would typically call an auathentication method
            // with the email and password, but for this example we'll
            // just print them to the console.
            println("Email: $email")
            println("Password: $password")
        }

        registerButton.setOnClickListener {
            // Handle register button click
            // Here you would typically navigate to the registration page
            println("Register button clicked")
        }
    }
}
