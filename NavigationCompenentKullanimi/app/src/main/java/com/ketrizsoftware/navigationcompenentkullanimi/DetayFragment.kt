package com.ketrizsoftware.navigationcompenentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.fragment.navArgs
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.navigationcompenentkullanimi.databinding.FragmentDetayBinding

class DetayFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle:DetayFragmentArgs by navArgs() // bu yapı ile artık gelecek verilere erişebiliriz

        val gelenIsim = bundle.isim
        val gelenYas = bundle.yas
        val gelenMeslek = bundle.meslek
        val gelenHobi = bundle.hobi

        val urunModel = bundle.urun.model
        val urunIsim = bundle.urun.isim

        binding.textViewBilgi.text = "İsim: $gelenIsim \nYaş: $gelenYas\nMeslek: $gelenMeslek\nHobi: $gelenHobi\nAraç Yıl: $urunModel\nAraç Marka: $urunIsim"

        val backPress = object : OnBackPressedCallback(false){ // true yi false yaparsak geri tuşu yine işlevsel olur
            override fun handleOnBackPressed() {
                // Geri tuşuna basınca ne yapmak istediğimizi yazabiliriz
                Snackbar.make(binding.textViewBilgi,"Çıkmak İstediğine Emin misi?",Snackbar.LENGTH_SHORT)
                    .setAction("Evet"){
                        isEnabled = false // true yi false çeviriyoruz ve çıkış yapıyoruz
                        requireActivity().onBackPressedDispatcher.onBackPressed()
                    }
                    .show()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner,backPress) // bbu yapı ile artık geri tuşu işlevsiz kalacak
        //requireActivity() fragmentimizin bağlı olduğu activityi temsil ediyor yani main activity
        //viewLifecycleOwner yaşam döngüsünü dessteklemeyi sağlıyor

        return binding.root
    }
}