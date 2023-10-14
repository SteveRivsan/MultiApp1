package com.example.multiapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EdadActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edad)
        var txtEdad: EditText = findViewById(R.id.txtEdad)
        val btnCalcular2: Button = findViewById(R.id.btnCalcular2)

        btnCalcular2.setOnClickListener {
            val intent = Intent(this,EdadActivity::class.java)
            startActivity(intent)
    }
}