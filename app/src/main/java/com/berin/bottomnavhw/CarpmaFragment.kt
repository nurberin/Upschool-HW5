package com.berin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpma.*
import kotlinx.android.synthetic.main.fragment_carpma.view.*

class CarpmaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_carpma, container, false)
        tasarim.carpmaButton.setOnClickListener {


            val sayi1 = cSayi1.text.toString().toInt()
            val sayi2 = cSayi2.text.toString().toInt()


            val gecis = CarpmaFragmentDirections.carpmaGecis("${sayi1*sayi2}")
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}