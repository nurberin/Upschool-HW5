package com.berin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_carpma.*
import kotlinx.android.synthetic.main.fragment_carpma.view.*
import kotlinx.android.synthetic.main.fragment_toplama.*
import kotlinx.android.synthetic.main.fragment_toplama.view.*

class ToplamaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_toplama, container, false)
        tasarim.toplaButton.setOnClickListener {

            val sayi3 = tSayi1.text.toString().toInt()
            val sayi4 = tSayi2.text.toString().toInt()


            val gecis = ToplamaFragmentDirections.toplamaGecis("${sayi3+sayi4}")
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim
    }

}