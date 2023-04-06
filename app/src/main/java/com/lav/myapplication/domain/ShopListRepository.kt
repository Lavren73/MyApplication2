package com.lav.myapplication.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem): ShopItem

    fun getShopItem(shopItemId: Int): ShopItem

    fun getShopList():List<ShopItem>
}