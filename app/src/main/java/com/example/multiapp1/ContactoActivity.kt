package com.example.multiapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContactoActivity : AppCompatActivity() {

    var arrContact = arrayOf(
        "Gina David", "Julienne Mark", "Jhon Stewart", "Buddy Holly", "Martha Kimbley ", "Tina Minelli", "David Kelly"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)

    }
}