package com.ketrizsoftware.kotlinderslerikasimadalanodev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.ketrizsoftware.kotlinderslerikasimadalanodev5.databinding.ActivityMainBinding
import javax.xml.xpath.XPathExpression

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val currentText = StringBuilder()


    override fun onCreate(savedInstanceState: Bundle?) {

        /*
        1. Activity ve Layout Bağlantısı:
        MainActivity sınıfı AppCompatActivity sınıfından kalıtım alıyor ve ActivityMainBinding sınıfından bağlantıyı kullanıyor.

        2. Değişkenler:
        a. binding değişkeni ActivityMainBinding türünde oluşturulmuş ve gerekli view bileşenlerine erişmek için kullanılacak.
        b. currentText değişkeni bir StringBuilder nesnesiyle başlatılmış ve kullanıcının girdiği metni tutacak şekilde tanımlanmış.

        3. onCreate() Fonksiyonu: Activity oluşturulduğunda çağrılan metoddur. Bu kısımda:
        a. Layout dosyası ActivityMainBinding kullanılarak ekrana yüklenir.
        b. Sayı ve operatör butonlarına tıklama olaylarını dinlemek için OnClickListener eklenir.
        c. buttonAC butonuna basıldığında tüm girdi temizlenir (currentText temizlenir ve ekrandaki metin sıfırlanır).
        d. buttonEsittir butonuna basıldığında ise girilen metin işlenir, toplam alınır ve ekrana sonuç yazdırılır.

        4. appendNumber() Fonksiyonu:
        Bu fonksiyon, kullanıcının sayı veya operatör butonlarına tıkladığında currentText değişkenine eklemesini sağlar ve
        ekrandaki metni günceller.

        5. OnClickListener tanımlamaları:
        Toplam 15 adet buton için setOnClickListener ile ilgili işlev atanmış. Bu butonlar sırasıyla 0-9 arasındaki sayılar,
        yüzde, bölme, çarpma, çıkarma, toplama ve virgül operatörlerini temsil ediyor.

        6. buttonEsittir.setOnClickListener İşlevi:
         Bu kısımda ekrandaki metin işlenerek toplamı alınıyor. Öncelikle ekrandaki metin + operatörüne göre ayrıştırılıyor.
         Sayılar bir listede toplanıyor, daha sonra bu sayılar toplanarak sonuç elde ediliyor ve ekrana yazdırılıyor.

        */




        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button0.setOnClickListener { appendNumber("0") }
        binding.button1.setOnClickListener { appendNumber("1") }
        binding.button2.setOnClickListener { appendNumber("2") }
        binding.button3.setOnClickListener { appendNumber("3") }
        binding.button4.setOnClickListener { appendNumber("4") }
        binding.button5.setOnClickListener { appendNumber("5") }
        binding.button6.setOnClickListener { appendNumber("6") }
        binding.button7.setOnClickListener { appendNumber("7") }
        binding.button8.setOnClickListener { appendNumber("8") }
        binding.button9.setOnClickListener { appendNumber("9") }
        binding.buttonYuzde.setOnClickListener { appendNumber("%") }
        binding.buttonBolme.setOnClickListener { appendNumber("/") }
        binding.buttonCarpma.setOnClickListener { appendNumber("x") }
        binding.buttonCikarma.setOnClickListener { appendNumber("-") }
        binding.buttonToplama.setOnClickListener { appendNumber("+") }
        binding.buttonVirgul.setOnClickListener { appendNumber(",") }
        // Diğer sayı tuşlarına da aynı şekilde OnClickListener ekle


        binding.buttonAC.setOnClickListener {
            currentText.clear()
            binding.textView.text = ""
        }

        binding.buttonEsittir.setOnClickListener {


            var toplam = 0

            val textViewMetin = binding.textView.text.toString()

            var sayilar = textViewMetin.split("+")

            var sayilarint = ArrayList<Int>()

            for (sayi in sayilar){
                sayilarint.add(sayi.toInt())
            }

            for (topla in sayilarint){
                toplam+=topla
            }

            binding.textView.text = toplam.toString()
        }

    }

    private fun appendNumber(number: String) {
        currentText.append(number)
        binding.textView.text = currentText.toString()
    }
}