package kotlinsprint.lesson_17.task_2

class Ship(
    val averageSpeed: Int,
    val homePort: String,
) {
    var name = "Star"
        get() = "Star"
        set(value) {
            field = value
            if (value != name)
                println("Название корабля изменить нельзя!")
        }
}

fun main() {

    val ship = Ship(
        averageSpeed = 400,
        homePort = "England",
    )

    ship.name = "Planet"
}