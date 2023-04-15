package com.lav.myapplication.presentation

import androidx.recyclerview.widget.DiffUtil
import com.lav.myapplication.domain.ShopItem

class ShopListDiffCollback(
    private val oldList: List<ShopItem>,
    private val newList: List<ShopItem>,
) : DiffUtil.Callback() {

    override fun getOldListSize() = oldList.size

    override fun getNewListSize() = newList.size

    override fun areItemsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int,
    ) = oldList[oldItemPosition].id == newList[newItemPosition].id


    override fun areContentsTheSame(
        oldItemPosition: Int,
        newItemPosition: Int,
    ) = oldList[oldItemPosition] == newList[newItemPosition]

}