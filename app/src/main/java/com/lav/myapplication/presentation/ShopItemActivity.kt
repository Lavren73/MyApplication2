package com.sumin.shoppinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModel
import com.lav.myapplication.R
import com.lav.myapplication.presentation.ShopItemViewModel

class ShopItemActivity : AppCompatActivity() {
    //private lateinit var viewModel: ShopItemViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop_item)
        val mode = intent.getStringExtra("extra_mode")
        Log.d("ShopItemActivity", mode.toString())
    }
}
