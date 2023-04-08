package com.lav.myapplication.domain

data class ShopItem (
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: Int = UNDERFINED_ID
)
    {
        companion object{

            const val UNDERFINED_ID = -1
        }
    }
