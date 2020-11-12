package com.example.aplikasipesanmakanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.aplikasipesanmakanan.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    @Suppress("UNUSED_VARIABLE")
    val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val navController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return super.onSupportNavigateUp()
    }

    // Fungsi untuk pemilihan Meja
    fun pilihMeja (view: View) {

    }

    fun hitung(view: View) {

        // Ubah tampilan menu awal menjadi gone
        menu_awal.visibility = View.GONE
        menu_form.visibility = View.VISIBLE
        menu_hitung.visibility = View.GONE

        when (view) {
            btn_meja_1 -> {
                label_daftar_menu.text = "Meja 1"
            }
            btn_meja_2 -> {
                label_daftar_menu.text = "Meja 2"
            }
            btn_meja_3 -> {
                label_daftar_menu.text = "Meja 3"
            }
            btn_meja_4 -> {
                label_daftar_menu.text = "Meja 4"
            }
        }


    }

    fun total(view: View) {
        menu_awal.visibility = View.GONE
        menu_form.visibility = View.GONE
        menu_hitung.visibility = View.VISIBLE

        // Validasi untuk form tidak kosong
        if (et_nama_makanan_1.text.toString() == ""
            || et_nama_makanan_2.text.toString() == ""
            || et_nama_makanan_3.text.toString() == ""
            || et_harga_1.text.toString() == ""
            || et_harga_2.text.toString() == ""
            || et_harga_3.text.toString() == ""
            || et_jumlah_1.text.toString() == ""
            || et_jumlah_2.text.toString() == ""
            || et_jumlah_3.text.toString() == ""
        ) {

            var myToast = Toast.makeText(this, "Form masih ada yang kosong, Harap periksa kembali!",Toast.LENGTH_SHORT)
            myToast.setGravity(Gravity.CENTER , 0, 0)
            myToast.show()

        } else {

            // Inisialisasi semua form
            var makanan1 : String
            var makanan2 : String
            var makanan3 : String
            var harga1 : Int
            var harga2 : Int
            var harga3 : Int
            var qty1 : Int
            var qty2 : Int
            var qty3 : Int

            //mengambil semua data dari form
            makanan1 = et_nama_makanan_1.text.toString()
            makanan2 = et_nama_makanan_2.text.toString()
            makanan3 = et_nama_makanan_3.text.toString()
            harga1 = et_harga_1.text.toString().toInt()
            harga2 = et_harga_2.text.toString().toInt()
            harga3 = et_harga_3.text.toString().toInt()
            qty1 = et_jumlah_1.text.toString().toInt()
            qty2 = et_jumlah_2.text.toString().toInt()
            qty3 = et_jumlah_3.text.toString().toInt()

            // menghitung sub total
            var subTotal1 = harga1 * qty1
            var subTotal2 = harga2 * qty2
            var subTotal3 = harga3 * qty3
            // menghitung grand total
            var grandTotal = subTotal1 + subTotal2 + subTotal3

            // menampilkan data ke text view
            tv_nama_makanan_1.text = makanan1
            tv_nama_makanan_2.text = makanan2
            tv_nama_makanan_3.text = makanan3
            tv_harga_1.text = harga1.toString()
            tv_harga_2.text = harga2.toString()
            tv_harga_3.text = harga3.toString()
            tv_jumlah_1.text = qty1.toString()
            tv_jumlah_2.text = qty2.toString()
            tv_jumlah_3.text = qty3.toString()

            tv_sub_makanan_1.text = makanan1
            tv_sub_makanan_2.text = makanan2
            tv_sub_makanan_3.text = makanan3
            tv_sub_harga_1.text = subTotal1.toString()
            tv_sub_harga_2.text = subTotal2.toString()
            tv_sub_harga_3.text = subTotal3.toString()

            tv_grand_total.text = grandTotal.toString()
        }
    }

    fun clearMenu(view: View) {
        // Ubah tampilan menu awal menjadi gone
        menu_awal.visibility = View.GONE
        menu_form.visibility = View.VISIBLE
        menu_hitung.visibility = View.GONE

        et_nama_makanan_1.text.clear()
        et_nama_makanan_2.text.clear()
        et_nama_makanan_3.text.clear()
        et_harga_1.text.clear()
        et_harga_2.text.clear()
        et_harga_3.text.clear()
        et_jumlah_1.text.clear()
        et_jumlah_2.text.clear()
        et_jumlah_3.text.clear()
    }

}