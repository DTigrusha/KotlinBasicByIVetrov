package kotlinsprint.lesson_18.task_1

class Order(
    val number: Int,
    val goods: Any,
) {

    fun printOrderInfo(
        number: Int,
        goods: String,
    ) {
        println("Заказан товар: \"$goods\".")
    }

    fun printOrderInfo(
        number: Int,
        goods: MutableList<String>,
    ) {
        println("Заказаны следующие товары: \"${goods.joinToString()}\".")
    }

}

fun main() {

    val order1 = Order(1, "телевизор")
    val order2 = Order(2, mutableListOf("миксер", "кофемолка", "кофеварка", "вспениватель"))

    order1.printOrderInfo(1, "телевизор")
    println()
    order2.printOrderInfo(2, mutableListOf("миксер", "кофемолка", "кофеварка", "вспениватель"))

}