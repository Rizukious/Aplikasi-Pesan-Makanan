package com.example.aplikasipesanmakanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.aplikasipesanmakanan.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    private var total : Int? = 0
    private var nomorMeja : Int? = 0

    private var productSatu : Product = Product()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    @Suppress("UNUSED_VARIABLE")
    val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    val navController = this.findNavController(R.id.myNavHostFragment)

        NavigationUI.setupActionBarWithNavController(this, navController)
//        NavigationUI.setupWithNavController(binding.)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()
    }


}