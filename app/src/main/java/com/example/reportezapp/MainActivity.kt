package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signin = findViewById<Button>(R.id.signin)
        signin.setOnClickListener( View.OnClickListener() {
            fun onClick(view: View?) {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        val createacc = findViewById<Button>(R.id.createacc)
        createacc.setOnClickListener( View.OnClickListener() {
                fun onClick(view: View?) {
                    val intent = Intent(this, CreateAcc::class.java)
                    startActivity(intent)
                }


    })
})}}