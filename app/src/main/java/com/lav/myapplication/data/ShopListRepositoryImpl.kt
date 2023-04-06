package com.lav.myapplication.data

import com.lav.myapplication.domain.ShopItem
import com.lav.myapplication.domain.ShopListRepository

object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()
    private val autoIncrementId = 0

    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id = ShopItem.UNDEFUNED_ID) {
            shopItem.id = autoIncrementId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem): ShopItem {

        val shopItemOld = getShopItem(shopItem.id)
        deleteShopItem(shopItemOld)
        addShopItem(shopItem)

    }

    override fun getShopItem(shopItemId: Int): ShopItem {
        shopList.find { it.id == shopItemId }
            ?: java.lang.RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}