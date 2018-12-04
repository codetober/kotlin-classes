package com.codetober.cafe

class Menu(){
    val items: List<MenuItem> = listOf(MenuItem(name = "Zero-Gravity Mocha", description = "It gives you jumping boots!"))

    fun getItemByName(itemName: String): MenuItem {
        return items.first { item -> item.name == itemName }
    }

//    override fun toString(): String {
//        return ""
//    }
}