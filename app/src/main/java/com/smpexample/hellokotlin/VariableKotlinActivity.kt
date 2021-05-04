package com.smpexample.hellokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class VariableKotlinActivity : AppCompatActivity() {
    var clickCount = 0
    var startTime = System.currentTimeMillis()
    var elapsedSeconds = System.currentTimeMillis() - startTime / 1000.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_variable)

        val txtActivityStartTime = findViewById<TextView>(R.id.txtActivityStartTime)
        val txtCountBtnClicks = findViewById<TextView>(R.id.txtCountBtnClicks)
        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val txtElapsedTime = findViewById<TextView>(R.id.txtElapsedTime)

        btnClickMe.setOnClickListener {
            clickCount++
            txtCountBtnClicks.setText("Button clicks: " + clickCount)
            txtElapsedTime.setText("seconds elapsed" + elapsedSeconds)

        }
        val timeText = SimpleDateFormat("HH:mm:ss", Locale.KOREA).format(startTime)
        txtActivityStartTime.setText("Activity start time = " + timeText)
        var elapsedSeconds : Long =  ((System.currentTimeMillis() - startTime) / 1000.0).toLong()
    }
}