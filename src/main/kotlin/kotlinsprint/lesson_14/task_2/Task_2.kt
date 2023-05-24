package kotlinsprint.lesson_14.task_2

open class Ship(
    val name: String,
    val speed: Int,
    val capacity: Int,
) {

    fun printName() {
        println("Название корабля: \"$name\".")
    }

    fun movingSpeed() {
        println("Корабль \"$name\" перемещается со скоростью: $speed километров в час.")
    }

    fun cargoCapacity() {
        println("Корабль \"$name\" может перевезти: $capacity ящиков груза.")
    }
}

class CargoShip(
    name: String,
    speed: Int,
    capacity: Int,
    val distance: Int,
) : Ship(name, speed, capacity) {

    fun printDistanceInfo() {
        println("Корабль \"$name\" может передвигаться на максимальное расстоение: $distance км.")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    capacity: Int,
    val engineType: String,
) : Ship(name, speed, capacity) {

    fun printEngineType() {
        println("Тип двигателя корабля \"$name\": $engineType.")
    }

    fun breakIce() {
        println("Корабль \"$name\" может колоть лед.")
    }
}

fun main() {
    val cargoShip1 = CargoShip("Звезда", 300, 76, 10000)

    val icebreaker1 = Icebreaker("Колокол", 150, 90, "атомный")

    cargoShip1.printName()
    cargoShip1.movingSpeed()
    cargoShip1.cargoCapacity()

    println()

    icebreaker1.printName()
    icebreaker1.movingSpeed()
    icebreaker1.cargoCapacity()
    icebreaker1.breakIce()
}