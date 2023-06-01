package kotlinsprint.lesson_17.task_2

class Ship(
    val averageSpeed: Int,
    val homePort: String,
    name: String,
) {
    var name: String = name
        set(value) {
            if (value != name) {
                println("Название корабля изменить нельзя!")
            }
            field = name
        }
}

fun main() {

    val ship = Ship(
        name = "Star",
        averageSpeed = 400,
        homePort = "England",
    )

    ship.name = "Planet"

}