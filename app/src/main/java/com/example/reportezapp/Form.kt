package com.example.reportezapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)


//        val inputText = findViewById<EditText>(R.id.inputText)
//        val acceptButton = findViewById<Button>(R.id.acceptButton)

        // Retrieve user input
        val nameInput = findViewById<TextInputEditText>(R.id.textView2)
        val fatherNameInput = findViewById<TextInputEditText>(R.id.textView3)
        val dobInput = findViewById<TextInputEditText>(R.id.textView4)
        val nationalityInput = findViewById<TextInputEditText>(R.id.textView5)
        val occupationInput = findViewById<TextInputEditText>(R.id.textView6)
        val addressInput = findViewById<TextInputEditText>(R.id.textView7)
        val idProofInput = findViewById<TextInputEditText>(R.id.textView8)
        val descriptionInput = findViewById<TextInputEditText>(R.id.textView9)
        val typeOfCrimeInput = findViewById<TextInputEditText>(R.id.textView10)
        val briefDescriptionInput = findViewById<TextInputEditText>(R.id.textView11)
        val placeOfOccurrenceInput = findViewById<TextInputEditText>(R.id.textView12)
        val dateReportedInput = findViewById<TextInputEditText>(R.id.textView13)
        val timeReportedInput = findViewById<TextInputEditText>(R.id.textView14)


        // Handle user input
        val submitButton = findViewById<Button>(R.id.button2)
        submitButton.setOnClickListener {
            val name = nameInput.text.toString()
            val fatherName = fatherNameInput.text.toString()
            val dob = dobInput.text.toString()
            val nationality = nationalityInput.text.toString()
            val occupation = occupationInput.text.toString()
            val address = addressInput.text.toString()
            val idProof = idProofInput.text.toString()
            val description = descriptionInput.text.toString()
            val typeOfCrime = typeOfCrimeInput.text.toString()
            val briefDescription = briefDescriptionInput.text.toString()
            val placeOfOccurrence = placeOfOccurrenceInput.text.toString()
            val dateReported = dateReportedInput.text.toString()
            val timeReported = timeReportedInput.text.toString()

            // Do something with the user input (e.g. send to a server)
            Log.d("Form", "Name: $name")
            Log.d("Form", "Father's Name: $fatherName")
            Log.d("Form", "Date of Birth: $dob")
            Log.d("Form", "Nationality: $nationality")
            Log.d("Form", "Occupation: $occupation")
            Log.d("Form", "Address: $address")
            Log.d("Form", "ID Proof: $idProof")
            Log.d("Form", "Description: $description")
            Log.d("Form", "Type of Crime: $typeOfCrime")
            Log.d("Form", "Brief Description: $briefDescription")
            Log.d("Form", "Place of Occurrence: $placeOfOccurrence")
            Log.d("Form", "Date Reported: $dateReported")
            Log.d("Form", "Time Reported: $timeReported")
        }
    }
}