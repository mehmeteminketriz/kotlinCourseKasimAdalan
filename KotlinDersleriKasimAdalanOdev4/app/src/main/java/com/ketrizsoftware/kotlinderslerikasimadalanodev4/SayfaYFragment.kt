package com.ketrizsoftware.kotlinderslerikasimadalanodev4

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentSayfaBBinding
import com.ketrizsoftware.kotlinderslerikasimadalanodev4.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSayfaYBinding.inflate(inflater, container, false)

        // Geri tuşuna basıldığında yapılacak işlemleri belirlemek için OnBackPressedCallback tanımlayın
        val callback = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // Ana sayfaya dönme işlemini gerçekleştir
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }
        }

        // Geri tuşunu kontrol etmek için callback'ı ekleyin
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, callback)

        /*
        1. İlk olarak, SayfaYFragment sınıfını oluşturuyoruz ve Fragment sınıfından kalıtım alıyoruz.
        2. binding isimli değişkeni FragmentSayfaYBinding sınıfından oluşturuyoruz ve lateinit anahtar
        kelimesi ile ileride değer atanacağını belirtiyoruz.
        3. onCreateView fonksiyonunu override ederek fragment'in view'ını oluşturuyoruz. Bu fonksiyon,
        fragment'in layoutunu inflater aracılığıyla oluşturup, view'ı döndürmekte kullanılır.
        4. FragmentSayfaYBinding.inflate(inflater, container, false) satırıyla fragment'ın layoutunu bağlıyoruz.
        5. OnBackPressedCallback sınıfını kullanarak geri tuşuna basıldığında yapılacak işlemleri belirleyebilmek için bir callback tanımlıyoruz.
        6. handleOnBackPressed fonksiyonu override edilerek, geri tuşuna basıldığında yapılacak işlemler belirtiliyor.
        Bu durumda MainActivity Activity'sine geçiş yapılacak bir Intent başlatılıyor.
        7. onBackPressedDispatcher.addCallback ile geri tuşunu kontrol etmek için callback'ı ekliyoruz.
        viewLifecycleOwner ile geri tuşunun fragment yaşam döngüsüne bağlı olmasını sağlıyoruz.
        8. Son olarak, oluşturduğumuz view'ı döndürüyoruz.
        */

        return binding.root
    }
}