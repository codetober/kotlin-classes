import com.codetober.cafe.Customer
import com.codetober.cafe.Store

/**
 * @author CodeTober
 *
 * Kotlin Functions Tutorial
 */


const val STORE_NAME = "MoonBucks"

fun main(args: Array<String>) {

    val store = Store()
    val carat = Customer(name = "Carat")

    store.printWelcomeMessage()
    store.printMenu()

    store.placeOrder(carat, store.menu.getItemByName("Zero-Gravity Mocha"))

    store.printExitMessage()
}

//private fun calcaluateDrinkPrice(drinkName: String, qty: Int): Double {
//    val drinkPrice = when(drinkName){
//        "DarkSide Frap" -> 5.99
//        "Zero-Gravity Mocha" -> 6.99
//        else -> 0.00
//    }
//
//    val drinkTotal = (drinkPrice * qty)
//    return drinkTotal
//}
//
//private fun placeOrder(drinkName: String, customerName: String, qty: Int){
//    val drinkTotal = calcaluateDrinkPrice(drinkName, qty)
//    println("$customerName orders $drinkName(x$qty) for a total of \$$drinkTotal")
//
//}
//
//private fun printWelcomeMessage() = println("Welcome to $STORE_NAME! (No Pictures)\n")
//
//private fun printExitMessage() = println("\nThanks for shopping at $STORE_NAME! (dont' tell your friends)")