package com.example.companion_objects_app

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Background(private val context: Context) {

    companion object {
        const val dayBackground = R.drawable.day1
        const val nightBackground = R.drawable.night2
    }


    fun set(layout: View, dayNight: String, text: TextView, edit: EditText) {
        when (dayNight){
            "day" -> {
                layout.setBackgroundResource(dayBackground)
                text.setTextColor(Color.BLACK)
                edit.setTextColor(Color.BLACK)

            }
            "night" -> {
                layout.setBackgroundResource(nightBackground)
                text.setTextColor(Color.WHITE)
                edit.setTextColor(Color.WHITE)

            }
            else -> {
                Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
            }
        }
    }


}