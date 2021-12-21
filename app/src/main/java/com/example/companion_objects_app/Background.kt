package com.example.companion_objects_app

import android.content.Context
import android.view.View
import android.widget.Toast

class Background(private val context: Context) {

    companion object {
        const val dayBackground = R.drawable.day1
        const val nightBackground = R.drawable.night2
    }


    fun set(layout: View, dayNight: String) {
        when (dayNight){
            "day" -> {
                layout.setBackgroundResource(dayBackground)
            }
            "night" -> {
                layout.setBackgroundResource(nightBackground)
            }
            else -> {
                Toast.makeText(context, "Please enter either day or night", Toast.LENGTH_SHORT).show()
            }
        }
    }


}