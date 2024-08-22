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

        btnCalculate.setOnClickListener(){
            val weight: Float = editWeight.text.toString().toFloat()
            val height: Float = editHeight.text.toString().toFloat()
            val heightQ2: Float = height * height
            val IMCresult: Float = weight / heightQ2
            println(IMCresult)
        }

    }
}