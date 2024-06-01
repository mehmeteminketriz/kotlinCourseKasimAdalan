package com.ketrizsoftware.navigationcompenentkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ketrizsoftware.navigationcompenentkullanimi.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment1 = supportFragmentManager.findFragmentById(R.id.navHostFragment1) as NavHostFragment
        /*
        Bu kod, verilen id değerine sahip NavHostFragment'ı bulmaya yarıyor.
        supportFragmentManager kullanılarak belirtilen id değeri ile NavHostFragment bulunuyor ve sonuç bir NavHostFragment nesnesine dönüştürülüyor.
        Bu şekilde NavHostFragment ile etkileşim sağlanabilir veya işlemler gerçekleştirilebilir.
        */


        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment1.navController)

        /*
        Bu kod, BottomNavigationView'nin NavController ile bağlanmasını sağlar.
        Yani, BottomNavigationView'nin öğelerine tıklandığında NavController'ün yönlendirme yapabilmesini sağlar.
        NavController, Jetpack Navigation ile belirli sayfalar arasında geçiş yapmak için kullanılan bir bileşendir.
        Bu kod, BottomNavigationView'nin NavController ile bağlanmasını sağlar ve
        kullanıcı navigasyon yaparken doğru sayfalar arasında geçiş yapmasını sağlar.
        */
    }
}