package com.makino.harutiro.work1

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ans = 0.0f

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
            ans+=0.5f
            nam.text = ans.toString()
            iro()
            pura05.setBackgroundColor(Color.parseColor("#9079ad"))



        }
        mai05.setOnClickListener {
            ans-=0.5f
            nam.text = ans.toString()
            iro()
            mai05.setBackgroundColor(Color.parseColor("#9079ad"))


        }



    }
    fun iro(){

        //リセット
        pura1.setBackgroundColor(Color.parseColor("#47885E"))
        mai1.setBackgroundColor(Color.parseColor("#47885E"))
        pura10.setBackgroundColor(Color.parseColor("#47885e"))
        mai10.setBackgroundColor(Color.parseColor("#47885e"))
        pura05.setBackgroundColor(Color.parseColor("#47885e"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))


        //色変更
        when (ans%5) {
            0.0f -> {
                nam.setTextColor(Color.BLACK)
            }
            1.0f -> {
                nam.setTextColor(Color.RED)
            }
            2.0f -> {
                nam.setTextColor(Color.BLUE)
            }
            3.0f -> {
                nam.setTextColor(Color.GREEN)
            }
            4.0f -> {
                nam.setTextColor(Color.LTGRAY)
            }

        }

        //画面推
        if(100<=ans) {
            val nextPage = Intent(this, nextgamen::class.java)
            startActivity(nextPage)
            finish()
        }




    }

}