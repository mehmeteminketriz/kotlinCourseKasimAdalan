package com.ketrizsoftware.kisileruygulamasi.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.kisileruygulamasi.R
import com.ketrizsoftware.kisileruygulamasi.databinding.FragmentDetayBinding
import com.ketrizsoftware.kisileruygulamasi.ui.viewmodel.DetayViewModel
import com.ketrizsoftware.kisileruygulamasi.ui.viewmodel.KayitViewModel

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    private lateinit var  viewModel : DetayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)

        binding.kisiDetayToolbar = "Kişi Detay"
        binding.kayitFragment = this


        val bundle:DetayFragmentArgs by navArgs()

        val gelenKisi = bundle.kisi
        binding.kisiNesnesi =gelenKisi

            binding.editTextKisiAdi.setText(gelenKisi.kisi_ad)
        binding.editTextKisiTel.setText(gelenKisi.kisi_tel)

        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // tempViewModel geçici view model anlamına geliyor
        val tempViewModel: DetayViewModel by viewModels()
        viewModel = tempViewModel
    }

    fun buttonGuncelle(kisi_id:Int,kisi_ad:String, kisi_tel:String){

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