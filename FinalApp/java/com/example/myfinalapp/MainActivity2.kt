package com.example.myfinalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val nextButton2: Button = findViewById(R.id.btnSubmit)
        val addressEditText: EditText = findViewById(R.id.txtAddress)
        val phoneEditText: EditText = findViewById(R.id.txtPhone)

        nextButton2.setOnClickListener {
            val address = addressEditText.text.toString().trim()
            val phone = phoneEditText.text.toString().trim()

            if (address.isEmpty() || phone.isEmpty()) {
                // if either address or phone is empty, display an error message
                addressEditText.error = "Please enter your address"
                phoneEditText.error = "Please enter your phone number"
            } else if (!Patterns.PHONE.matcher(phone).matches()) {
                // if phone is not valid, display an error message
                phoneEditText.error = "Please enter a valid phone number"
            } else {

                // create an intent to start Screen 3
                val intent = Intent(this, MainActivity3::class.java)

                // put all the data collected so far into the intent
                intent.putExtra("name", intent.getStringExtra("name"))
                intent.putExtra("age", intent.getIntExtra("age", 0))
                intent.putExtra("email", intent.getStringExtra("email"))
                intent.putExtra("password", intent.getStringExtra("password"))
                intent.putExtra("address", address)
                intent.putExtra("phone", phone)

                // start Screen 3
                startActivity(intent)
            }
        }
    }
}