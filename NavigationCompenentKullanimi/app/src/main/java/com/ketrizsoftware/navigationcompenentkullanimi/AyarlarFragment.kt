package com.ketrizsoftware.navigationcompenentkullanimi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ketrizsoftware.navigationcompenentkullanimi.databinding.FragmentDetayBinding
import java.security.PrivateKey

class AyarlarFragment : Fragment() {
    private lateinit var binding: FragmentDetayBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentDetayBinding.inflate(inflater, container, false)

        return binding.root
    }
}