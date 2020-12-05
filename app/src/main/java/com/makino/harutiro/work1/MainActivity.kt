package com.makino.harutiro.work1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ans = 0.0f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pura1.setBackgroundColor(Color(#47885E))
        pura10.setBackgroundColor(Color(#47885E))
        mai1.setBackgroundColor(Color(#47885e))
        mai10.setBackgroundColor(Color(#47885e))

        pura1.setOnClickListener {
            ans++
            nam.text = ans.toString()
        }
        mai1.setOnClickListener {
            ans--
            nam.text = ans.toString()
        }
        pura10.setOnClickListener {
            ans+=10
            nam.text = ans.toString()
        }
        mai10.setOnClickListener {
            ans-=10
            nam.text = ans.toString()
        }

        when (ans) {
            0 -> {
                nam.setTextColor("Color(#000000)")
            }
            5 -> {
                nam.setTextColor("Color(#000000)")
            }
            1 -> {
                nam.setTextColor("Color(#E91E63)")
            }
        }
    }
}