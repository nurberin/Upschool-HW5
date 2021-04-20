package com.berin.bottomnavhw

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_csonuc.view.*


class CsonucFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_csonuc, container, false)

        val bundle:CsonucFragmentArgs by navArgs()
        val gelenCarpma = bundle.carpmaSonuc
        tasarim.Csonuc.text="${gelenCarpma}"

        return tasarim    }

}