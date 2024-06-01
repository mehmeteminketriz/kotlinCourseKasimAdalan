package com.ketrizsoftware.navigationcomponentkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.ketrizsoftware.navigationcomponentkullanimi.databinding.ActivityMainBinding
import com.ketrizsoftware.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //*


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater) //*

        setContentView(binding.root) //*

        val navHostFragment1 = supportFragmentManager.findFragmentById(R.id.navHostFragment1) as NavHostFragment

        NavigationUI.setupWithNavController(binding.bottomNavigationView,navHostFragment1.navController)
    }
}