package com.example.aplikasipesanmakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.aplikasipesanmakanan.databinding.FragmentDaftarMenuBinding

class DaftarMenuFragment : Fragment() {
    private lateinit var binding : FragmentDaftarMenuBinding
    lateinit var productSatu : Product
    lateinit var productDua : Product
    lateinit var productTiga : Product
    private var total = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_daftar_menu, container, false)
        binding.apply {
            val args = DaftarMenuFragmentArgs.fromBundle(requireArguments())
            nomorMeja = args.noMeja

            btnHitung.setOnClickListener {view : View ->
                ambilData(binding)
                view.findNavController().navigate(DaftarMenuFragmentDirections.actionDaftarMenuFragmentToDaftarBayarFragment(productSatu, productDua, productTiga, args.noMeja, total))
            }

            btnHome.setOnClickListener {view: View ->
                view.findNavController().navigate(DaftarMenuFragmentDirections.actionDaftarMenuFragmentToDaftarMejaFragment2())
            }

            binding
            return binding.root
        }
    }

    private fun ambilData(binding: FragmentDaftarMenuBinding) {
        total = 0
        productSatu = Product()
        productDua = Product()
        productTiga = Product()

        binding.apply {
            if (etNamaMakanan1.text.isNotEmpty() || etHarga1.text.isNotEmpty() || etJumlah1.text.isNotEmpty()) {
                productSatu.namaMenu = etNamaMakanan1.text.toString()
                productSatu.hargaMenu = etHarga1.text.toString().toInt()
                productSatu.jumlahMenu = etJumlah1.text.toString().toInt()
                total += productSatu.subTotal
            }
            if (etNamaMakanan2.text.isNotEmpty() || etHarga2.text.isNotEmpty() || etJumlah2.text.isNotEmpty()) {
                productDua.namaMenu = etNamaMakanan2.text.toString()
                productDua.hargaMenu = etHarga2.text.toString().toInt()
                productDua.jumlahMenu = etJumlah2.text.toString().toInt()
                total += productDua.subTotal
            }
            if (etNamaMakanan3.text.isNotEmpty() || etHarga3.text.isNotEmpty() || etJumlah3.text.isNotEmpty()) {
                productTiga.namaMenu = etNamaMakanan3.text.toString()
                productTiga.hargaMenu = etHarga3.text.toString().toInt()
                productTiga.jumlahMenu = etJumlah3.text.toString().toInt()
                total += productTiga.subTotal
            }
        }
    }

}