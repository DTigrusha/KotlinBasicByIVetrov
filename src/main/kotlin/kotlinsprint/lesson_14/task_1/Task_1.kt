package kotlinsprint.lesson_14.task_1

class TypicalShip (val name: String, val speed: Int, val capacity: Int) {

    fun movingSpeed() {
        println("Стандартный корабль \"$name\" перемещается со скоростью: $speed километров в час.")
    }

    fun cargoCapacity() {
        println("Стандартный корабль \"$name\" может перевезти $capacity ящиков груза.")
    }

    fun printShipInfo() {
        println("Имя корабля: \"$name\", скорость: $speed км/ч, грузоподъемность: $capacity ящиков.")
    }
}

fun main() {
    val typicalShip1 = TypicalShip("Звезда", 300, 76)

    typicalShip1.movingSpeed()
    typicalShip1.cargoCapacity()
    typicalShip1.printShipInfo()
}