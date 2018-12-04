package com.codetober.cafe

class Store(_name: String = "MoonBucks"){
    val name: String

    init{
        require(_name.length > 1) {"Store Name must contain more than one character!"}
        this.name = _name
    }

    // Constructors

    // Properties
    val menu = Menu()

    // Functions
    fun printWelcomeMessage() = println("Welcome to $name!")
    fun printExitMessage() = println("Thanks for shopping at $name")
    fun placeOrder(customer: Customer, item: MenuItem) = println("That'll be $${item.price}. Thanks ${customer.name}!")
    fun printMenu() = println(this.menu.toString()) // Refactor in Data Class Tutorial

    // Implement in Data/Object Tutorial
    private fun calculateOrderPrice() = "Looking up prices from the Menu..."

}