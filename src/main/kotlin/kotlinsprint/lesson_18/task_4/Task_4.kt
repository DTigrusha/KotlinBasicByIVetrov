package kotlinsprint.lesson_18.task_4

import kotlin.math.pow
import kotlin.math.roundToInt

open class Box {

    open fun getBoxSquare(): Int = 0

}

class RectangularBox(
    private val length: Int,
    private val width: Int,
    private val height: Int,
) : Box() {

    override fun getBoxSquare(): Int = length * width

}

class CubeBox(
    private val ribLength: Int,
) : Box() {

    override fun getBoxSquare(): Int = (ribLength.toDouble().pow(2)).roundToInt()

}

fun main() {

    val pack1: Box = RectangularBox(5, 6, 10)
    val pack2: Box = CubeBox(4)

    val listOfPacks = listOf(pack1, pack2)

    listOfPacks.forEach {
        println("Площадь поверхности посылки = ${it.getBoxSquare()}")
    }

}