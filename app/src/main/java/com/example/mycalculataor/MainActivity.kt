package com.example.mycalculataor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mycalculataor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = binding.firstNumber
        val secondNumber = binding.secondNumber
        val sumButton = binding.sum
        val minusButton = binding.minus
        val multiplyButton = binding.multiply
        val divisionButton = binding.Divide

        val answer = binding.results


        sumButton.setOnClickListener {
            val firstNumbers = firstName.text.toString().toInt()
            val secondNumbers = secondNumber.text.toString().toInt()

            val sum = firstNumbers + secondNumbers
            answer.text = "The answer is $sum"
        }

        minusButton.setOnClickListener {
            val firstNumbers = firstName.text.toString().toInt()
            val secondNumbers = secondNumber.text.toString().toInt()

            val minus = firstNumbers - secondNumbers
            answer.text = "The answer is $minus"
        }

        multiplyButton.setOnClickListener {
            val firstNumbers = firstName.text.toString().toInt()
            val secondNumbers = secondNumber.text.toString().toInt()

            val multiplication= firstNumbers * secondNumbers
            answer.text = "The answer is $multiplication"
        }

        divisionButton.setOnClickListener {
            val firstNumbers = firstName.text.toString().toInt()
            val secondNumbers = secondNumber.text.toString().toInt()

            val divide = firstNumbers / secondNumbers
            answer.text = "The answer is $divide"
        }








    }
}