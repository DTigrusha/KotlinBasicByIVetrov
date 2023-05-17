package kotlinsprint.lesson_7.task_4

fun main() {
    println("Укажите количество секунд, которые надо засечь:")

    val userInput = readln().toInt()

    for (i in userInput downTo 1) {
        println("Осталось $i секунд.")
        Thread.sleep(1000)
    }
    println("Время вышло.")
}