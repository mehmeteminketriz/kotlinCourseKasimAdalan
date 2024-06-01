package com.ketrizsoftware.navigationcomponentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.navigationcomponentkullanimi.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)


        // Gönderilen Değerlere erişmek
        binding.textViewBilgi.text = "Detay Sayfasına Geçiş Yapıldı"

        val bundle:DetayFragmentArgs by navArgs() // bu yapı ile gelecek verilere erişebilriiz artık

        val gelenIsim = bundle.isim
        val gelenYas = bundle.yas
        val gelenMeslek = bundle.meslek
        val gelenHobi = bundle.hobi

        val kamyonMarka = bundle.kamyon.marka
        val kamyonModel = bundle.kamyon.model

        binding.textViewBilgi.text = "İsim: $gelenIsim \nYaş: $gelenYas \nMeslek: $gelenMeslek \nHobi: $gelenHobi \n\n" +
                "\nKamyon Marka: $kamyonMarka \nKamyon Model: $kamyonModel"


        val backPress = object: OnBackPressedCallback(true){ // object ile sanal nesne oluşturuyoruz

            override fun handleOnBackPressed() { // object in bize verdiği bir fonksiyon

                // geri tuşuna basınca ne yapmak istiyorsak burda kodluyoruz
                Snackbar.make(binding.textViewBilgi,"Geri Dönmek İstiyormusun ?", Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        isEnabled = false
                        requireActivity().onBackPressedDispatcher.onBackPressed() // geri dönüş tetikleniyor
                    }
                    .show()
            }
        }

        /*Bu kod, bir Fragment içinde yer alan onBackPressed() metodunu çağırarak geri butonuna basıldığında
        belirli bir eylem gerçekleştirmek için kullanılır. requireActivity().onBackPressedDispatcher.addCallback() metodu,
        geri tuşuna basıldığında yapılabilecek özel bir işlemi tanımlamak için kullanılır. addCallback() metodu,
        Fragment içinde yer alan bir onBackPressed() metodu gibi bir işlevi alır ve geri tuşuna basıldığında
        bu işlevi çağırmak için geri çağrı listesine ekler. viewLifecycleOwner, geri tuşuna basıldığında işlemi gerçekleştirmek
        istediğiniz Fragment'in yaşam döngüsünü temsil eden bir öğedir. backPress ise, geri tuşuna basıldığında
        çağrılacak olan işlemleri belirten bir nesnedir. Bu nesne üzerinde onBackPressed() metodu bulunabilir
        ve geri tuşuna basıldığında bu metod çağrılır.*/
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress)

        return binding.root
    }
}