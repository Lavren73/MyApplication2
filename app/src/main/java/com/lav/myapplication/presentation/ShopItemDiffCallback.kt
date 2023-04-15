package com.lav.myapplication.presentation

import androidx.recyclerview.widget.DiffUtil
import com.lav.myapplication.domain.ShopItem

class ShopItemDiffCallback : DiffUtil.ItemCallback<ShopItem>() {

    override fun areItemsTheSame(
        oldItem: ShopItem,
        newItem: ShopItem,
    ) = oldItem.id == newItem.id

    override fun areContentsTheSame(
        oldItem: ShopItem,
        newItem: ShopItem,
    ) = oldItem == newItem
}