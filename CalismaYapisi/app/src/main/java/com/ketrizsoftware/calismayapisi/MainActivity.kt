package com.ketrizsoftware.calismayapisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.calismayapisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { // parantez olduğu için miras alınmış

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root) // bu class ta R(es) layout ve onun içinde activiy main çalışacak

        //bu sayfanın ana sayfa olduğunu nerden anlıyoruz manifest dosyasında  activity kısmı yer alıyor orda belli oluyor

        binding.buttonDetay.setOnClickListener{
            //Snackbar.make(it,"Snackbar.make(it,\"Deneme\",Snackbar.LENGTH_SHORT).show()",Snackbar.LENGTH_SHORT).show()
            //binding.textView.text="Anasayfa Yazısı Değişti"

            val intent = Intent(this@MainActivity,DetayActivity::class.java) // ilk parametre nerede çalışıyoruz ikinci nereye geçiyoruz
            intent.putExtra("ad","Mehmet Emin")
            intent.putExtra("yas",21)
            intent.putExtra("meslek","Yazılım Mühendisi")
            intent.putExtra("hobi","Film İzlemek")
            startActivity(intent)
        }

    }
}