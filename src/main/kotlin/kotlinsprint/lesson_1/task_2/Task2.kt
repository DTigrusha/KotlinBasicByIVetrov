package kotlinsprint.lesson_1.task_2

fun main(args: Array<String>) {
    val numberOfOrders: Int = 75
    val thanksForPurchase: String =
        "Уважаемый покупатель! Благодарим Вас за покупку в нашем интернет-магазине! Ждем Вас снова!"
    println("$numberOfOrders")
    println(thanksForPurchase)

    var numberOfEmployees: Int = 2000
//    println("$numberOfEmployees")

    numberOfEmployees = 1999
    println("$numberOfEmployees")
}