package kotlinsprint.lesson_4.task_1

fun main() {
    val numberOfTables = 13
    val todayReserved = 13
    val tomorrowReserved = 9

    println("Доступность столиков на сегодня: ${(numberOfTables - todayReserved) > 0}\n" +
            "Доступность столиков на завтра: ${(numberOfTables - tomorrowReserved) > 0}")
}