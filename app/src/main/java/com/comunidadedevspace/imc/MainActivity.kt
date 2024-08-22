package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editWeight = findViewById<TextInputEditText>(R.id.edtWeight)
        val editHeight = findViewById<TextInputEditText>(R.id.edtHeight)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        val weight = editWeight.text
        val height = editHeight.text

        btnCalculate.setOnClickListener(){

        }

    }
}