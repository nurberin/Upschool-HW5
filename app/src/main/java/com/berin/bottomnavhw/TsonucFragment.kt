package com.berin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_csonuc.view.*
import kotlinx.android.synthetic.main.fragment_tsonuc.view.*


class TsonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_tsonuc, container, false)

        val bundle:TsonucFragmentArgs by navArgs()
        val gelenToplam = bundle.toplamSonuc
        tasarim.Tsonuc.text="${gelenToplam}"

        return tasarim    }

}