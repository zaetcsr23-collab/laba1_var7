package com.example.laba1_var7

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private lateinit var generatedListTextView: TextView
    private lateinit var resultTextView: TextView
    private lateinit var executeButton: Button
    private lateinit var numbersList: List<Int>

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generatedListTextView = findViewById(R.id.generatedListTextView)
        resultTextView = findViewById(R.id.resultTextView)
        executeButton = findViewById(R.id.executeButton)

        val task = Task()
        numbersList = task.generateRandomList()
        generatedListTextView.text = numbersList.joinToString(", ")

        executeButton.setOnClickListener {
            val result = task.completeTask(numbersList)
            resultTextView.text = result
        }
    }
}