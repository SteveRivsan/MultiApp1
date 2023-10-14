package com.example.multiapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class CambioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambio)

        var txtTipo: EditText = findViewById(R.id.txtTipo)
        var txtMonto: EditText = findViewById(R.id.txtMonto)
        val btnCalcular: Button = findViewById(R.id.btnCalcular)

        btnCalcular.setOnClickListener {
            val intent = Intent(this,CambioActivity::class.java)
            startActivity(intent)
        }
    }
}