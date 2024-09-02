package com.comunidadedevspace.imc

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editWeight = findViewById<TextInputEditText>(R.id.edtWeight)
        val editHeight = findViewById<TextInputEditText>(R.id.edtHeight)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)

        btnCalculate.setOnClickListener(){

            val weightStr: String = editWeight.text.toString()
            val heightStr: String = editHeight.text.toString()

            if(weightStr.isEmpty() || heightStr.isEmpty()) {
                Snackbar
                    .make(
                        editWeight,
                        "Preencha todos os campos",
                        Snackbar.LENGTH_LONG
                    ).show()
            } else {
                val height: Float = heightStr.toFloat()
                val weight: Float = weightStr.toFloat()
                val heightQ2: Float = height * height
                val IMCresult: Float = weight / heightQ2

                val intent = Intent(this, ResultActivity::class.java)
                    intent.putExtra(KEY_RESULT_IMC, IMCresult)
                    startActivity(intent)
            }
        }

    }
}