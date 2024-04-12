package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class newAcc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newacc)

        val cacc = findViewById<Button>(R.id.cacc)
        cacc.setOnClickListener {
            val intent = Intent(this, Form::class.java)
            startActivity(intent)
        }
    }
}