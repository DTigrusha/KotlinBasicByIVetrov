package kotlinsprint.lesson_15.task_5

interface CarMoving {

    fun move() = "- перемещается"
}

interface CargoTransporting {

    fun cargoTransporting() = "- перевозит груз весом - "
}

interface PassengerTransporting {

    fun passengerTransporting() = "- перевозит пассажиров в количестве - "
}

abstract class Car : CarMoving, PassengerTransporting {

    abstract val name: String
    abstract val numberOfPassengers: Int

    open fun printCarInfo() {
        println("$name:\n${move()}\n${passengerTransporting()} $numberOfPassengers чел.")
    }

}

class Truck(
    override val name: String,
    override val numberOfPassengers: Int,
    val cargoWeight: Int,
) : Car(), CargoTransporting {

    override fun printCarInfo() {
        super.printCarInfo()
        println("${cargoTransporting()} $cargoWeight тн.")
    }
}

class PassengerCar(
    override val name: String,
    override val numberOfPassengers: Int,
) : Car()

fun main() {

    val truck1 = Truck("Грузовик1", 1, 1)
    val truck2 = Truck("Грузовик2", 0, 1)

    val passengerCar1 = PassengerCar("Машина1", 2)
    val passengerCar2 = PassengerCar("Машина2", 2)
    val passengerCar3 = PassengerCar("Машина3", 1)

    truck1.printCarInfo()
    truck2.printCarInfo()

    passengerCar1.printCarInfo()
    passengerCar2.printCarInfo()
    passengerCar3.printCarInfo()

}