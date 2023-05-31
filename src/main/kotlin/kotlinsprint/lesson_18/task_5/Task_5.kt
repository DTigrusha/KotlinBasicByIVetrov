package kotlinsprint.lesson_18.task_5

open class Figure {
    open val name: String = ""
}

class Dote(
    val x: Int,
    val y: Int,
) : Figure() {
    override val name: String = "точка"
}

class Square(
    val x: Int,
    val y: Int,
) : Figure() {
    override val name: String = "квадрат"
}

class Circle(
    val x: Float,
    val y: Float,
) : Figure() {
    override val name: String = "круг"
}

class Screen {

    fun draw(
        figure: Dote,
    ) {
        println("Рисуем фигуру \"${figure.name}\" с координатами: x = ${figure.x}, y = ${figure.y}.")
    }

    fun draw(
        figure: Square,
    ) {
        println("Рисуем фигуру \"${figure.name}\" с координатами: x = ${figure.x}, y = ${figure.y}.")
    }

    fun draw(
        figure: Circle,
    ) {
        println("Рисуем фигуру \"${figure.name}\" с координатами: x = ${figure.x}, y = ${figure.y}.")
    }

}

fun main() {

    val screen = Screen()

    screen.draw(Dote(4, 9))
    screen.draw(Square(7, 10))
    screen.draw(Circle(4.2F, 7.5F))

}