package com.example.parkingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    val cost = 8.5
    var numOfHours: Int = 0
    var totalCharge: Double = 0.00
    var lotChoices = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hours: EditText = findViewById(R.id.txtHours)
        val tipPercentage: Spinner = findViewById(R.id.spnGroup)
        val calculateTip: Button = findViewById(R.id.btnCharge)
        val tipAmount: TextView = findViewById(R.id.txtResult1)

        calculateTip.setOnClickListener{
            numOfHours = hours.text.toString().toInt()
            val currency = DecimalFormat("$###,###.00")
            totalCharge = cost * numOfHours.toDouble()
            lotChoices = tipPercentage.selectedItem.toString()

            val totalChargesFormatted = currency.format(totalCharge)

            tipAmount.text = "Cost for the meal with a $lotChoices for $numOfHours hour $totalChargesFormatted"
        }
    }
}
