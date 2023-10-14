package com.example.multiapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnKambio: Button = findViewById(R.id.btnKambio)
        btnKambio.setOnClickListener {
            val intent = Intent(this, CambioActivity::class.java)
            startActivity(intent)
        }

        val btnEdad: Button = findViewById(R.id.btnEdad)
        btnEdad.setOnClickListener {
            val intent = Intent(this, EdadActivity::class.java)
            startActivity(intent)
        }
        val btnContactos: Button = findViewById(R.id.btnContactos)
        btnContactos.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            startActivity(intent)
        }

    }
}