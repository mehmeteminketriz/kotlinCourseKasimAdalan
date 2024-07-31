package com.ketrizsoftware.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.kisileruygulamasi.R
import com.ketrizsoftware.kisileruygulamasi.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)



        val bundle:DetayFragmentArgs by navArgs()

        val gelenKisi = bundle.kisi


        binding.editTextKisiAdi.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_tel)

        binding.buttonGuncelle.setOnClickListener {
            val kisi_ad = binding.editTextKisiAdi.text.toString()
            val kisi_tel = binding.editTextKisiTel.text.toString()
            guncelle(gelenKisi.kisi_id,kisi_ad,kisi_tel)
        }



        return binding.root
    }

    fun guncelle(kisi_id:Int,kisi_ad:String, kisi_tel:String){

        var textViewAd = binding.editTextKisiAdi.text.toString().trim()
        var textViewTel = binding.editTextKisiTel.text.toString().trim()

        if (textViewAd.isEmpty() && textViewTel.isEmpty()){
            Snackbar.make(binding.buttonGuncelle,"Hiçbir veri eklenmedi",Snackbar.LENGTH_SHORT).show()
        }else{
            Log.e("kişi kaydet","$kisi_id - $kisi_ad - $kisi_tel")

            // Snackbar gösterme işlemi
            Snackbar.make(binding.buttonGuncelle, "Güncellendi", Snackbar.LENGTH_SHORT).show()

            // Ana ekrana dönme işlemi
            requireActivity().supportFragmentManager.popBackStack()
        }
    }

}