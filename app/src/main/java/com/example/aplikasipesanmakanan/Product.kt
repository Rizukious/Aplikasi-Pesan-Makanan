package com.example.aplikasipesanmakanan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Product (
    var namaMenu : String = "",
    var hargaMenu : Int = 0,
    var jumlahMenu : Int = 0
) : Parcelable {
    val subTotal : Int
    get() = jumlahMenu * hargaMenu
}