package com.example.companion_objects_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var constraintLayout: ConstraintLayout
    lateinit var labelTextView: TextView
    lateinit var dayNightEditText: EditText
    lateinit var changerButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectView()

        changerButton.setOnClickListener {
            val background = Background(this)
            background.set(constraintLayout, dayNightEditText.text.toString())
        }

    }

    private fun connectView() {
        constraintLayout = findViewById(R.id.cvMain)
        labelTextView = findViewById(R.id.label_tv)
        dayNightEditText = findViewById(R.id.daynight_et)
        changerButton = findViewById(R.id.changer_btn)
    }

}