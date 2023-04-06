package com.lav.myapplication.domain

data class ShopItem (
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id = UNDEFUNED_ID
)
    {
        companion object{

            const val  UNDEFUNED_ID = -1
        }
    }
)