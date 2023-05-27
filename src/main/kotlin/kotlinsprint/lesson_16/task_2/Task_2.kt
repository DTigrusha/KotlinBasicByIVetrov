package kotlinsprint.lesson_16.task_2

import kotlin.math.pow
import kotlin.math.roundToInt

const val PI = 3.14

private class Circle(private var radius: Int = 10) {

    fun countSquare(): Int {
        return (PI * radius.toDouble().pow(2)).roundToInt()
    }

    fun countCircumference(): Int {
        return (2 * (PI * radius)).roundToInt()
    }
}

fun main() {

    val circle = Circle()

    println("Площадь круга: ${circle.countSquare()}")
    println("Длина окружности круга: ${circle.countCircumference()}")

}