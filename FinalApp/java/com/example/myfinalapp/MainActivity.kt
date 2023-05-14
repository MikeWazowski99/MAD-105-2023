package com.example.myfinalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var nextButton: Button = findViewById(R.id.txtButton1)
        var nameEditText: EditText = findViewById(R.id.editTextTextPersonName)
        var emailEditText: EditText = findViewById(R.id.txtEmail)
        var passwordEditText: EditText = findViewById(R.id.txtPassword)
        var ageEditText: EditText = findViewById(R.id.txtAge)


        nextButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()
            val email = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()
            val age = ageEditText.text.toString().trim()

            var validInput = true

            if (name.isEmpty()) {
                nameEditText.error = "Please enter your name"
                validInput = false
            }

            if (email.isEmpty()) {
                emailEditText.error = "Please enter your email"
                validInput = false
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                emailEditText.error = "Please enter a valid email address"
                validInput = false
            }

            if (password.isEmpty()) {
                passwordEditText.error = "Please enter your password"
                validInput = false
            } else if (password.length < 6) {
                passwordEditText.error = "Password must be at least 6 characters long"
                validInput = false
            }

            if (age.isEmpty()) {
                ageEditText.error = "Please enter your age"
                validInput = false
            } else if (!age.matches(Regex("\\d+"))) {
                ageEditText.error = "Please enter a valid age"
                validInput = false
            }

            if (validInput) {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("name", name)
                intent.putExtra("email", email)
                intent.putExtra("password", password)
                intent.putExtra("age", age.toInt())
                startActivity(intent)
            }
        }
    }
}

