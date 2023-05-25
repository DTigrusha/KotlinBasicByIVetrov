package kotlinsprint.lesson_16.task_2

import kotlin.math.pow
import kotlin.math.roundToInt

const val PI = 3.14

private class Circle {

    fun setOfRadius(radius: Int): Int {
        return radius
    }

    fun countSquare(radius: Int): Int {
        return (PI * radius.toDouble().pow(2)).roundToInt()
    }

    fun countCircumference(radius: Int): Int {
        return ((PI * radius) / 2).roundToInt()
    }
}

fun main() {

    val circle = Circle()
    val radius = circle.setOfRadius(10)

    println("Площадь круга: ${circle.countSquare(radius)}.")
    println("Длина окружности круга: ${circle.countCircumference(radius)}")

}