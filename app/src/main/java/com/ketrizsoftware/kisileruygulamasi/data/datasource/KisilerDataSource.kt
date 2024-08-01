package com.ketrizsoftware.kisileruygulamasi.data.datasource

import android.util.Log
import com.google.android.material.snackbar.Snackbar

class KisilerDataSource {

    suspend fun Kaydet(kisi_ad:String, kisi_tel:String){

        var textViewAd = binding.editTextKisiAdi.text.toString().trim()
        var textViewTel = binding.editTextKisiTel.text.toString().trim()

        if (textViewAd.isEmpty() && textViewTel.isEmpty()){
            Snackbar.make(binding.buttonKaydet,"Hiçbir veri eklenmedi", Snackbar.LENGTH_SHORT).show()
        }else{
            Log.e("kişi kaydet","$kisi_ad - $kisi_tel")

            // Snackbar gösterme işlemi
            Snackbar.make(binding.buttonKaydet, "Kaydedildi", Snackbar.LENGTH_SHORT).show()

            // Ana ekrana dönme işlemi
            requireActivity().supportFragmentManager.popBackStack()
        }
    }
}