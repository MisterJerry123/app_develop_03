package com.example.app_develop_03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Date

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val linearframe = findViewById<LinearLayout>(R.id.linearframe1)
        val todayDate = linearframe.findViewById<TextView>(R.id.setdate)



        val sdf = SimpleDateFormat("MM-dd")

        var m = SimpleDateFormat("MM")
        var d= SimpleDateFormat("dd")


        val month = m.format(Date())
        val day=d.format(Date())
        //날짜 정의


        //todayDate.text = "hello world"
        todayDate.text=month+"월 " + day+"일"
    }
}