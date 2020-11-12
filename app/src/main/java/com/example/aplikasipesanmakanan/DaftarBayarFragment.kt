package com.example.aplikasipesanmakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.aplikasipesanmakanan.databinding.FragmentDaftarBayarBinding


class DaftarBayarFragment : Fragment() {
    private lateinit var binding : FragmentDaftarBayarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_daftar_bayar, container, false)
        val args = DaftarBayarFragmentArgs.fromBundle(requireArguments())

        binding.apply {
            productSatu = args.product1
            productDua =  args.product2
            productTiga = args.product3
        }
    }


}