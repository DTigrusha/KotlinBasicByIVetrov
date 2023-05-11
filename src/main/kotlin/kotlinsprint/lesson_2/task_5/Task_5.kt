package kotlinsprint.lesson_2.task_5

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val depositTerm = 20
    val amountOfSavings = (1 + interestRate / 100).pow(depositTerm) * depositAmount

    println("%.3f".format(amountOfSavings))

}