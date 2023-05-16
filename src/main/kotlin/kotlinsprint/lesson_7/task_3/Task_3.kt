package kotlinsprint.lesson_7.task_3

fun main() {
    println("Введите любое целое число:")

    val userInput = readln().toInt()
    val range = 0..userInput

    for (i in range step 2)
        println(i)
}