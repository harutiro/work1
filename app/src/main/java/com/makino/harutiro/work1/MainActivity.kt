package com.makino.harutiro.work1

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var ans = 0.0f


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //一番最初に読み込んだかを判断する変数
        var zyoutai = 0
        //インスタンス作成
        var dataStore: SharedPreferences = getSharedPreferences("namDate", Context.MODE_PRIVATE)

        //最初に来たら、数を読み込み代入する
        if(zyoutai == 0) {
            ans = dataStore.getFloat("Deta", 0.0f)
            nam.text = ans.toString()

            iro(1)
            zyoutai = 1
        }

        pura1.setBackgroundColor(Color.parseColor("#47885E"))
        pura10.setBackgroundColor(Color.parseColor("#47885E"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))
        mai10.setBackgroundColor(Color.parseColor("#47885e"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))
        mai05.setBackgroundColor(Color.parseColor("#47885e"))

        pura1.setOnClickListener {
            ans++
            nam.text = ans.toString()
            iro(0)
            pura1.setBackgroundColor(Color.parseColor("#9079ad"))

            val editor = dataStore.edit()
            editor.putFloat("Deta",ans)
            editor.apply()



        }

        mai1.setOnClickListener {
            ans--
            nam.text = ans.toString()
            iro(0)
            mai1.setBackgroundColor(Color.parseColor("#9079ad"))

            val editor = dataStore.edit()
            editor.putFloat("Deta",ans)
            editor.apply()


        }
        pura10.setOnClickListener {
            ans+=10
            nam.text = ans.toString()
            iro(0)
            pura10.setBackgroundColor(Color.parseColor("#9079ad"))

            val editor = dataStore.edit()
            editor.putFloat("Deta",ans)
            editor.apply()


        }
        mai10.setOnClickListener {
            ans-=10
            nam.text = ans.toString()
            iro(0)
            mai10.setBackgroundColor(Color.parseColor("#9079ad"))

            val editor = dataStore.edit()
            editor.putFloat("Deta",ans)
            editor.apply()


        }
        pura05.setOnClickListener {
            ans+=0.5f
            nam.text = ans.toString()
            iro(0)
            pura05.setBackgroundColor(Color.parseColor("#9079ad"))

            val editor = dataStore.edit()
            editor.putFloat("Deta",ans)
            editor.apply()



        }
        mai05.setOnClickListener {
            ans-=0.5f
            nam.text = ans.toString()
            iro(0)
            mai05.setBackgroundColor(Color.parseColor("#9079ad"))

            val editor = dataStore.edit()
            editor.putFloat("Deta",ans)
            editor.apply()


        }



    }
    fun iro(dousa:Int){

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
        if(100<=ans && dousa != 1) {
            val nextPage = Intent(this, nextgamen::class.java)
            startActivity(nextPage)
            finish()
        }

    }


}