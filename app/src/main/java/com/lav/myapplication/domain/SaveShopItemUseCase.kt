package com.lav.myapplication.domain

class SaveShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun saveShopItem(shopItem: ShopItem): ShopItem {
        //return shopListRepository.getShopItem(shopItemId)
        return shopItem
    }
}