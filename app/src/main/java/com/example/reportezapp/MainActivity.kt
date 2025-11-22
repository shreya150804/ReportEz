package com.example.reportezapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
//import com.example.reportezapp.firestore.newAcc
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding
//    private lateinit var database: DatabaseReference // Change from databaseReference to database
//    private lateinit var conn1: Button
//    private lateinit var conn2: Button

//    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val conn1 = findViewById<Button>(R.id.signin)
        conn1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        val conn2 = findViewById<Button>(R.id.createacc)
        conn2.setOnClickListener{
            val intent = Intent(this, newAcc::class.java)
            startActivity(intent)
        }
    }
}

/*
        val conn1 = findViewById<Button>(R.id.signin)
        conn1.setOnClickListener{
            Toast.makeText(this,"HEllo",Toast.LENGTH_LONG)
        }
        */


/*
        /*
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2.setOnClickListener {

            val name = findViewById<String>(R.id.name)
            val fhname = findViewById<String>(R.id.fhname)
            val dob = findViewById<String>(R.id.dob)
            val nationality = findViewById<String>(R.id.nationality)
            val occupation = findViewById<String>(R.id.occupation)
            val address = findViewById<String>(R.id.address)
            val details = findViewById<String>(R.id.details)
            val crime = findViewById<String>(R.id.crime)
            val brief = findViewById<String>(R.id.brief)
            val place = findViewById<String>(R.id.place)
            val currTime = findViewById<String>(R.id.currtime)
            val currDate = findViewById<String>(R.id.currdate)

            val name = getInputText(binding.name)

            // Validate user input (optional, add more checks as needed)
            if (TextUtils.isEmpty(name) || TextUtils.isEmpty(fhname) || TextUtils.isEmpty(dob)) {
                Toast.makeText(this, "Please enter Name, Father's Name and Date of Birth", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            database = FirebaseDatabase.getInstance().getReference("Users") // Corrected database reference name
            val user = User(name, fhname, dob, nationality, occupation, address, details, crime, brief, place, currDate, currTime) // Assuming User class is defined correctly
            database.child(name).setValue(user).addOnSuccessListener {
                clearFields()
                Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()
            }.addOnFailureListener {
                Toast.makeText(this, "Failed to Save Data", Toast.LENGTH_SHORT).show()
            }
        }
        */
    }

    private fun getInputText(editText: EditText): String {
        return editText.text.toString().trim()
    }
    private fun clearFields() {


//        binding.name.text = null
//        binding.name.text.clear()

        TextView btn2= findViewbyId(R.id.name)

        binding.name.text.clear()
        binding.fhname.text.clear()
        binding.dob.text.clear()
        binding.nationality.text.clear()
        binding.occupation.text.clear()
        binding.address.text.clear()
        binding.details.text.clear()
        binding.crime.text.clear()
        binding.brief.text.clear()
        binding.place.text.clear()
        binding.currdate.text.clear()
        binding.currtime.text.clear()
    }

    private fun getCurrentDate(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return dateFormat.format(Date())
    }

    private fun getCurrentTime(): String {
        val timeFormat = SimpleDateFormat("HH:mm:ss", Locale.getDefault())
        return timeFormat.format(Date())
    }
*/




























/*

package com.example.reportezapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.reportezapp.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {
            val name = binding.name.toString()
            val fhname = binding.fhname.toString()
            val dob = binding.dob.toString()
            val nationality = binding.nationality.toString()
            val occupation = binding.occupation.toString()
            val address = binding.address.toString()
            val details = binding.details.toString()
            val crime = binding.crime.toString()
            val currdate = binding.currdate.toString()
            val currtime = binding.currtime.toString()

            database = FirebaseDatabase.getInstance().getReference("Users")
            val User = User(name, fhname, dob, nationality, occupation, address, details, crime, currdate, currtime)
            database.child(name).setValue(User).addOnSuccessListener {

                binding.name.text.clear()
                binding.fhname.text.clear()
                binding.dob.text.clear()
                binding.nationality.text.clear()
                binding.occupation.text.clear()
                binding.address.text.clear()
                binding.details.text.clear()
                binding.crime.text.clear()
                binding.currdate.text.clear()
                binding.currtime.text.clear()

                Toast.makeText(this, "Successfully Saved", Toast.LENGTH_SHORT).show()

            }.addOnFailureListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
*/
/*
package com.example.realtimedatabasekotlin

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.realtimedatabasekotlin.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {

            val firstName = binding.firstName.text.toString()
            val lastName = binding.lastName.text.toString()
            val age = binding.age.text.toString()
            val userName = binding.userName.text.toString()

            database = FirebaseDatabase.getInstance().getReference("Users")
            val User = User(firstName,lastName,age,userName)
            database.child(userName).setValue(User).addOnSuccessListener {

                binding.firstName.text.clear()
                binding.lastName.text.clear()
                binding.age.text.clear()
                binding.userName.text.clear()

                Toast.makeText(this,"Successfully Saved",Toast.LENGTH_SHORT).show()

            }.addOnFailureListener{

                Toast.makeText(this,"Failed",Toast.LENGTH_SHORT).show()


            }


        }

    }
}
*/












/*
package com.example.reportezapp
 */
/*
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        installSplashScreen()
        Thread.sleep(3000)

        val signin = findViewById<Button>(R.id.signin)
        signin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        val createacc = findViewById<Button>(R.id.createacc)
        createacc.setOnClickListener {
            val intent = Intent(this, CreateAcc::class.java)
            startActivity(intent)
        }
    }
}
*/