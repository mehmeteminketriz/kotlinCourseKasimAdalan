package com.ketrizsoftware.calismayapisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ketrizsoftware.calismayapisi.databinding.ActivityDetayBinding
import com.ketrizsoftware.calismayapisi.databinding.ActivityMainBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding //*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityDetayBinding.inflate(layoutInflater)//*
        setContentView(binding.root)//*

        val gelenAd = intent.getStringExtra("ad") // hangi tüde gönderdiysek o türde alabiliyoruz
        val gelenYas = intent.getIntExtra("yas",0) // String haricinde olanlarda default değer istiyor yaşı okurken sorun olursa 0 ı ekleyecek
        val gelenMeslek = intent.getStringExtra("meslek")
        val gelenHobi = intent.getStringExtra("hobi")

        binding.textViewBilgi.text = "İsim --> $gelenAd\nYas --> $gelenYas\nMeslek --> $gelenMeslek\nHobi --> $gelenHobi"
    }
}