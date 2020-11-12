package com.example.aplikasipesanmakanan

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import com.example.aplikasipesanmakanan.databinding.FragmentDaftarMejaBinding

class DaftarMejaFragment : Fragment() {
    private lateinit var binding : FragmentDaftarMejaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_daftar_meja, container, false)
        binding.btnMeja1.setOnClickListener { view: View ->
            view.findNavController().navigate(DaftarMejaFragmentDirections.actionDaftarMejaFragmentToDaftarMenuFragment("Meja 1"))
        }
        binding.btnMeja2.setOnClickListener { view: View ->
            view.findNavController().navigate(DaftarMejaFragmentDirections.actionDaftarMejaFragmentToDaftarMenuFragment("Meja 2"))
        }
        binding.btnMeja3.setOnClickListener { view: View ->
            view.findNavController().navigate(DaftarMejaFragmentDirections.actionDaftarMejaFragmentToDaftarMenuFragment("Meja 3"))
        }
        binding.btnMeja4.setOnClickListener { view: View ->
            view.findNavController().navigate(DaftarMejaFragmentDirections.actionDaftarMejaFragmentToDaftarMenuFragment("Meja 4"))
        }
        setHasOptionsMenu(true)
        return binding.root
    }

}