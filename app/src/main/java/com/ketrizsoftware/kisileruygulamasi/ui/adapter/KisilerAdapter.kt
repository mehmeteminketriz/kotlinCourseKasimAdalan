package com.ketrizsoftware.kisileruygulamasi.ui.adapter
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.ketrizsoftware.kisileruygulamasi.data.entity.Kisiler
import com.ketrizsoftware.kisileruygulamasi.databinding.CardTasarimBinding
import com.ketrizsoftware.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.ketrizsoftware.kisileruygulamasi.ui.fragment.AnasayfaFragmentDirections

class KisilerAdapter (var mContext:Context, var kisilerListesi:List<Kisiler>)
    : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() { // Card Tasarım tutucuyu buraya tanıttık ve 3 adet methodu buraya implment ettik

    // bu bizim card tasarım activity mizi tutuyor
    inner class CardTasarimTutucu(var tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)


    // Listeleme için önemli olan öğelerimiz
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        // vievBinding kurulumu yapmamız gerek
        //parent yazılımsal tasarım demek
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext),parent, false)

        return CardTasarimTutucu(binding) // fonksiyon dönüş türü CardTasarimTutucu
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        // artık tasarıma özel kodlarımızı da buraya yazıyoruz
        // holderı bize ınner class taki card tutucu sağlıyor. yani holder sayesinde tasarıma sonra binding sayesinde de tasrım activity e ulaşıyoruz
        // psoition ise öerneğin 3 tane cartımız var işte 1. 2. 3. position oluyorlar

        val kisi =kisilerListesi.get(position)
        val cardTasarim = holder.tasarim

        cardTasarim.textViewKisiAdi.text = "İsim: ${kisi.kisi_ad}"
        cardTasarim.textViewKisiTel.text = "Tel Numarası: ${kisi.kisi_tel}"

        cardTasarim.cardViewSatir.setOnClickListener { // karta basınca Kişi Detay sayfasına geçiş yapıp veriyi aktarıyoruz
            val gecis = AnasayfaFragmentDirections.detayGecis(kisi)
            Navigation.findNavController(cardTasarim.cardViewSatir).navigate(gecis)
        }

        cardTasarim.imageViewSil.setOnClickListener {
            Snackbar.make(cardTasarim.imageViewSil,"${kisi.kisi_ad} Silinsin mi?",Snackbar.LENGTH_SHORT).setAction("Evet"){
                sil(kisi.kisi_id)
            }.show()
        }

    }

    override fun getItemCount(): Int {
        // veri sayısı
        return kisilerListesi.size
    }

    fun sil(kisi_id:Int){
        Log.e("Kişi Sil",kisi_id.toString())
    }
}