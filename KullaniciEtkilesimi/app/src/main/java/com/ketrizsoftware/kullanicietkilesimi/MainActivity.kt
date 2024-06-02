package com.ketrizsoftware.kullanicietkilesimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.kullanicietkilesimi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        // Toast
        binding.buttonToast.setOnClickListener {
            Toast.makeText(this@MainActivity,"Merhaba",Toast.LENGTH_SHORT).show()
        }





        // Snackbar
        binding.buttonSnackbar.setOnClickListener {

            Snackbar.make(binding.buttonSnackbar,"Silmek İstiyor musunuz ?",Snackbar.LENGTH_SHORT)
                .setAction("Evet"){
                    Snackbar.make(binding.buttonSnackbar,"Silindi",Snackbar.LENGTH_SHORT)
                    .setBackgroundTint(Color.WHITE)
                    .setTextColor(Color.BLUE).show()
                }
                .setBackgroundTint(Color.WHITE)
                .setTextColor(Color.BLUE)
                .setActionTextColor(Color.RED)
                .show()
        }




        // Dialog
        binding.buttonDialog.setOnClickListener {
            MaterialAlertDialogBuilder(this@MainActivity)
                .setTitle("Kayıt")
                .setMessage("Kayıt İşlemini Tamamlamak İstiyor musunuz ?")
                .setPositiveButton("Evet"){text,listener ->
                    Toast.makeText(this@MainActivity,"Kaydınız Yapıldı",Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton("Hayır"){text,listener ->
                    Toast.makeText(this@MainActivity,"Kaydolma İptal Edildi",Toast.LENGTH_SHORT).show()
                }.show()
        }

    }
}