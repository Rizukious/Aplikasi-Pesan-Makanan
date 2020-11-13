package com.example.aplikasipesanmakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.aplikasipesanmakanan.databinding.FragmentDaftarBayarBinding
import kotlinx.android.synthetic.main.fragment_daftar_bayar.*


class DaftarBayarFragment : Fragment() {
    private lateinit var binding : FragmentDaftarBayarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_daftar_bayar, container, false)

        binding.apply {
            val args = DaftarBayarFragmentArgs.fromBundle(requireArguments())

            productSatu = args.product1
            productDua =  args.product2
            productTiga = args.product3
            total = args.total
            nomorMeja = args.nomorMeja


            btnHome.setOnClickListener {view: View ->
                view.findNavController().navigate(DaftarBayarFragmentDirections.actionDaftarBayarFragmentToDaftarMejaFragment())

            }

            btnMenu.setOnClickListener {view: View ->
                view.findNavController().popBackStack()
            }
        }
        binding
        return binding.root
    }

}