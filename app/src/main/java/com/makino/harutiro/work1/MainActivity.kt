package com.makino.harutiro.work1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ans = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        pura1.setBackgroundColor(Color.parseColor("#47885E"))
        pura10.setBackgroundColor(Color.parseColor("#47885E"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))
        mai10.setBackgroundColor(Color.parseColor("#47885e"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))

        pura1.setOnClickListener {
            ans++
            nam.text = ans.toString()

            iro()
            pura1.setBackgroundColor(Color.parseColor("#9079ad"))



        }

        mai1.setOnClickListener {
            ans--
            nam.text = ans.toString()
            iro()
            mai1.setBackgroundColor(Color.parseColor("#9079ad"))


        }
        pura10.setOnClickListener {
            ans+=10
            nam.text = ans.toString()
            iro()
            pura10.setBackgroundColor(Color.parseColor("#9079ad"))


        }
        mai10.setOnClickListener {
            ans-=10
            nam.text = ans.toString()
            iro()
            mai10.setBackgroundColor(Color.parseColor("#9079ad"))


        }
        pura05.setOnClickListener {
            ans+=0.5
            nam.text = ans.toString()
            iro()
            pura05.setBackgroundColor(Color.parseColor("#9079ad"))



        }
        mai05.setOnClickListener {
            ans-=0.5
            nam.text = ans.toString()
            iro()
            mai05.setBackgroundColor(Color.parseColor("#9079ad"))


        }



    }
    fun iro(){
        pura1.setBackgroundColor(Color.parseColor("#47885E"))
        mai1.setBackgroundColor(Color.parseColor("#47885E"))
        pura10.setBackgroundColor(Color.parseColor("#47885e"))
        mai10.setBackgroundColor(Color.parseColor("#47885e"))
        pura05.setBackgroundColor(Color.parseColor("#47885e"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))

        when (ans%5) {
            0.0 -> {
                nam.setTextColor(Color.BLACK)
            }
            1.0 -> {
                nam.setTextColor(Color.RED)
            }
            2.0 -> {
                nam.setTextColor(Color.BLUE)
            }
            3.0 -> {
                nam.setTextColor(Color.GREEN)
            }
            4.0 -> {
                nam.setTextColor(Color.LTGRAY)
            }

        }
    }

}