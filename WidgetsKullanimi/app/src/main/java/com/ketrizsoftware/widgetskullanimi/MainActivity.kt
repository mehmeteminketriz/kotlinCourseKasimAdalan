package com.ketrizsoftware.widgetskullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import com.google.android.material.datepicker.MaterialDatePicker
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.ketrizsoftware.widgetskullanimi.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.ArrayList
import java.util.Locale

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var kontrol = false
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        
        setContentView(binding.root)


        // edit text
        binding.buttonOku.setOnClickListener {
            val tc = binding.editTextGirdi.text.toString() // text ile editable yaptık ama bunu stringe çeirmemiz gerek
            binding.textViewSonuc.text = tc
        }

        // Gülen Ağlayan yüz
        binding.buttonHappy.setOnClickListener {
            binding.imageMood.setImageResource(R.drawable.happy_icon)
        }

        binding.buttonSad.setOnClickListener {
            // bize veritabanından resim adı string olarak gelirse aşağıdaki gibi yapıyoruz
            binding.imageMood.setImageResource(resources.getIdentifier("sad_icon","drawable",packageName))
        }

        // Switch
        binding.switch1.setOnCheckedChangeListener { compoundButton, isChecked ->
            // compounButton switch1 i temsil ediyor, isChescked tru false değerini kontrol ediyor
            if (isChecked){
                Log.e("Sonuc","Switch : ON")
            }else{
                Log.e("Sonuc","Switch : OFF")
            }
        }

        // Toogle button
        binding.toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            kontrol = isChecked
            if (kontrol){
                // 2. olan checkedId verimli çalışmadığından biz oluşturacağız
                val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Sonuc",buttonYazi)
            }
        }

        // Expose Dropdown Menu
        val ulkeler =ArrayList<String>()
        ulkeler.add("Türkiye")
        ulkeler.add("United Kingdom ")
        ulkeler.add("Germany")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,ulkeler)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)


        // Progress Bar
        binding.buttonBasla.setOnClickListener {
            binding.progressBar.visibility = View.VISIBLE
        }


        binding.buttonDur.setOnClickListener {
            binding.progressBar.visibility = View.INVISIBLE
        }

        // Slider
        binding.textViewSlider.text = binding.seekBar.progress.toString()

        binding.seekBar.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {// değişim var
                binding.textViewSlider.text = progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}// hareketlenme başladı

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}// hareketlendirmeyi bıraktık
        })


        // time picker

        binding.buttonSaat.setOnClickListener {
            val timePicker = MaterialTimePicker.Builder().setTitleText("Saat Seç").setTimeFormat(TimeFormat.CLOCK_24H).build()

            timePicker.show(supportFragmentManager,"Saat")

            timePicker.addOnPositiveButtonClickListener {
                binding.editTextSaat.setText("${timePicker.hour} : ${timePicker.minute}")
            }

        }

        // date picker
        binding.buttonTarih.setOnClickListener {
            val datePicker = MaterialDatePicker.Builder.datePicker().setTitleText("Tarih Seç").build()

            datePicker.show(supportFragmentManager,"Tarih")

            datePicker.addOnPositiveButtonClickListener {
                // date format string yazarak google da farklı formatlara ulaşabiliriz

                val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
                val tarih = dateFormat.format(it)
                binding.editTextTarih.setText(tarih)
            }

        }


        // Göster Butonu
        binding.buttonGoster.setOnClickListener {
            // Switch
            Log.e("Sonuc","Switch Durum : ${binding.switch1.isChecked}")

            // ToggleButton
            if (kontrol){
                val secilenButton = findViewById<Button>(binding.toggleButton.checkedButtonId)
                val buttonYazi = secilenButton.text.toString()
                Log.e("Sonuc","Toggle Durum: $buttonYazi")
            }

            // ExposeDropdownMenu
            val ulke = binding.autoCompleteTextView.text.toString()
            Log.e("Sonuc","Ülke : ${ulke}")

            //Slider - SeekBar

            val slider = binding.textViewSlider.text.toString()
            Log.e("Sonuc","Slider : $slider")

        }
    }
}