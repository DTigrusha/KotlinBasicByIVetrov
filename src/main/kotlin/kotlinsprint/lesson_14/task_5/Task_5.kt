package kotlinsprint.lesson_14.task_5

import kotlin.math.pow

const val PI = 3.14

abstract class Figure(val color: String) {

    abstract fun countSquare(): Int

    abstract fun countPerimeter(): Int

}

class Circle(
    color: String,
    val radius: Int,
) : Figure(color) {

    override fun countSquare(): Int {
        return (PI * radius.toDouble().pow(2)).toInt()
    }

    override fun countPerimeter(): Int {
        return (2 * (PI * radius)).toInt()
    }

}

class Rectangle(
    color: String,
    val width: Int,
    val length: Int,
) : Figure(color) {

    override fun countSquare(): Int {
        return width * length
    }

    override fun countPerimeter(): Int {
        return 2 * (width + length)
    }

}

class Triangle(
    color: String,
    val height: Int,
    val baseSideLength: Int,
    val sideALength: Int,
    val sideBLength: Int,
) : Figure(color) {

    override fun countSquare(): Int {
        return (baseSideLength * height) / 2
    }

    override fun countPerimeter(): Int {
        return baseSideLength + sideALength + sideBLength
    }

}

fun sumOfPerimeter(arrayOfFigures: Array<Figure>): Int {
    var sumOfPerimeter = 0

    for (item in arrayOfFigures) {
        if (item.color == "красный") {
            sumOfPerimeter += item.countPerimeter()
        }
    }
    return sumOfPerimeter
}

fun sumOfSquare(arrayOfFigures: Array<Figure>): Int {
    var sumOfSquare = 0

    for (item in arrayOfFigures) {
        if (item.color == "красный") {
            sumOfSquare += item.countSquare()
        }
    }
    return sumOfSquare
}

fun main() {

    val listOfColors = listOf("красный", "зеленый", "черный")

    val circle1 = Circle(listOfColors[0], 6)
    val circle2 = Circle(listOfColors[1], 5)

    val rectangle1 = Rectangle(listOfColors[1], 5, 6)
    val rectangle2 = Rectangle(listOfColors[2], 4, 7)

    val triangle1 = Triangle(listOfColors[2], 7, 8, 8, 8)
    val triangle2 = Triangle(listOfColors[0], 7, 4, 7, 8)

    val arrayOfFigures = arrayOf(circle1, circle2, rectangle1, rectangle2, triangle1, triangle2)

    val sumOfPerimeter = sumOfPerimeter(arrayOfFigures)
    val sumOfSquare = sumOfSquare(arrayOfFigures)

    println("Сумма периметров красных фигур: $sumOfPerimeter.\nСумма площадей красных фигур: $sumOfSquare.")

}