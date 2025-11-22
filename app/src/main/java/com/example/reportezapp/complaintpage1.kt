package com.example.reportezapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class complaintpage1 : AppCompatActivity() {

    private lateinit var nameField: EditText
    private lateinit var fathersNameField: EditText
    private lateinit var nationalityField: EditText
    private lateinit var policeStationField: EditText
    private lateinit var addressField: EditText
    private lateinit var mobileField: EditText
    private lateinit var emailField: EditText

    private lateinit var suspectDetailsField: EditText
    private lateinit var crimeTypeField: EditText
    private lateinit var crimeDescriptionField: EditText
    private lateinit var crimePlaceField: EditText
    private lateinit var crimeDateField: EditText
    private lateinit var crimeTimeField: EditText

    private lateinit var submitButton: Button

    private val mAuth: FirebaseAuth = FirebaseAuth.getInstance()
    private val db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complaintpage1)

        nameField = findViewById(R.id.editText91)
        fathersNameField = findViewById(R.id.editText61)
        nationalityField = findViewById(R.id.editText71)
        policeStationField = findViewById(R.id.editText21)
        addressField = findViewById(R.id.editText2)
        mobileField = findViewById(R.id.editText24)
        emailField = findViewById(R.id.editText13)

        suspectDetailsField = findViewById(R.id.detail)
        crimeTypeField = findViewById(R.id.crime)
        crimeDescriptionField = findViewById(R.id.brief)
        crimePlaceField = findViewById(R.id.place)
        crimeDateField = findViewById(R.id.cdate)
        crimeTimeField = findViewById(R.id.time)

        submitButton = findViewById(R.id.button4)

        submitButton.setOnClickListener {
            val name = nameField.text.toString()
            val fathersName = fathersNameField.text.toString()
            val nationality = nationalityField.text.toString()
            val policeStation = policeStationField.text.toString()
            val address = addressField.text.toString()
            val mobile = mobileField.text.toString()
            val email = emailField.text.toString()

            val suspectDetails = suspectDetailsField.text.toString()
            val crimeType = crimeTypeField.text.toString()
            val crimeDescription = crimeDescriptionField.text.toString()
            val crimePlace = crimePlaceField.text.toString()
            val crimeDate = crimeDateField.text.toString()
            val crimeTime = crimeTimeField.text.toString()

            val userMap = hashMapOf(
                "name" to name.trim(),
            "fatherName" to fathersName.trim(),
            "nationality" to nationality.trim(),
            "policeStation" to policeStation.trim(),
            "address" to address.trim(),
            "mobile" to mobile.trim(),
            "email" to email.trim(),
            "suspectDetails" to suspectDetails.trim(),
            "crimeType" to crimeType.trim(),
            "crimeDescription" to crimeDescription.trim(),
            "crimePlace" to crimePlace.trim(),
            "crimeDate" to crimeDate.trim(),
            "crimeTime" to crimeTime.trim()
            )



            val currentUser = mAuth.currentUser

            if (currentUser != null) {
                db.collection("complaints").document(currentUser.uid)
                    .set(userMap)
                    .addOnSuccessListener {
                        Toast.makeText(this, "Complaint Submitted Successfully", Toast.LENGTH_SHORT).show()
                    }
                    .addOnFailureListener { exception ->
                        Toast.makeText(this, "Error: ${exception.message}", Toast.LENGTH_SHORT).show()
                    }
            } else {
                Toast.makeText(this, "No current user found", Toast.LENGTH_SHORT).show()
            }
        }
    }
}