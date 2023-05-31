package kotlinsprint.lesson_16.task_4

enum class Status {
    NEW,
    COMPLETING,
    TRANSFERRING,
    DELIVERING,
    DELIVERED,
}

fun setStatus(status: Status): String {
    return when (status) {
        Status.NEW -> "заказ принят"
        Status.COMPLETING -> "заказ передан в сборку"
        Status.TRANSFERRING -> "заказ передан в службу доставки"
        Status.DELIVERING -> "заказ доставляется"
        Status.DELIVERED -> "заказ доставлен"
    }
}

private class Order(
    private val numberOfOrder: Int,
    private var statusOfOrder: String,
) {

    fun changeStatusOfOrder(newStatusOfOrder: String) {
        statusOfOrder = newStatusOfOrder

        println("Статус заказа изменен на \"$statusOfOrder\".")

    }
}

fun sendRequestToManager(newStatusOfOrder: String) {

    println("Прошу изменить текущий статус заказа на \"$newStatusOfOrder\".")

}

fun main() {
    val order = Order(
        numberOfOrder = 23,
        statusOfOrder = setStatus(Status.NEW),
    )

    val newStatusOfOrder = setStatus(Status.COMPLETING)

    sendRequestToManager(newStatusOfOrder)

    order.changeStatusOfOrder(newStatusOfOrder)

}