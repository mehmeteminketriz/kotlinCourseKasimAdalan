package com.ketrizsoftware.kotlinderslerikasimadalan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var str : String? = null
    lateinit var str2:String // lateinit daha sonra başlatacağım
    // val ile kullanılmaz çünkü lateinit mantığına aykırı
    // primitive tiplerde kullanılmaz

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        str2 = "Merhaba"



    }
}