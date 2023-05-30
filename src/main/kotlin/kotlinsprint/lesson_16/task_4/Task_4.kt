package kotlinsprint.lesson_16.task_4

val statusList = listOf(
    "заказ принят", "заказ передан в сборку", "заказ передан в службу доставки", "заказ доставляется", "заказ доставлен"
)

private class Order(
    private val numberOfOrder: Int = 23,
    private var statusOfOrder: String,
) {

    fun changeStatusOfOrder(newStatusOfOrder: String) {
        statusOfOrder = newStatusOfOrder

        println("Статус заказа изменен на \"$statusOfOrder\".")

    }
}

fun sendRequestToManager(): String {
    val newStatusOfOrder = statusList[4]

    println("Прошу изменить текущий статус заказа на \"$newStatusOfOrder\".")

    return newStatusOfOrder
}

fun main() {
    val order = Order(statusOfOrder = statusList[3])
    val newStatusOfOrder = sendRequestToManager()

    order.changeStatusOfOrder(newStatusOfOrder)
}