package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val b = findViewById<Button>(R.id.b)
        b.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val b1 = findViewById<Button>(R.id.b1)
        b1.setOnClickListener {
            val intent = Intent(this, loginadmin::class.java)
            startActivity(intent)
        }


    }
}