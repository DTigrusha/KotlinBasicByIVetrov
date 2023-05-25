package kotlinsprint.lesson_15.task_5

interface CarMoving {

    fun move() {
        println("- перемещается")
    }
}

interface Transporting {

    fun cargoTransporting() {
        print("- перевозит груз весом - ")
    }

    fun passengerTransporting() {
        print("- перевозит пассажиров в количестве - ")
    }
}

abstract class Car : CarMoving, Transporting {

    abstract val name: String
    abstract val numberOfPassengers: Int
}

class Truck(
    override val name: String,
    override val numberOfPassengers: Int,
    val cargoWeight: Int,
) : Car()

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

    println("${truck1.name}:")
    truck1.move()
    truck1.passengerTransporting()
    println("${truck1.numberOfPassengers} чел.")
    truck1.cargoTransporting()
    println("${truck1.cargoWeight} тн.\n")

    println("${truck2.name}:")
    truck2.move()
    truck2.passengerTransporting()
    println("${truck2.numberOfPassengers} чел.")
    truck2.cargoTransporting()
    println("${truck2.cargoWeight} тн.\n")

    println("${passengerCar1.name}:")
    passengerCar1.move()
    passengerCar1.passengerTransporting()
    println("${passengerCar1.numberOfPassengers} чел.\n")

    println("${passengerCar2.name}:")
    passengerCar2.move()
    passengerCar2.passengerTransporting()
    println("${passengerCar2.numberOfPassengers} чел.\n")

    println("${passengerCar3.name}:")
    passengerCar3.move()
    passengerCar3.passengerTransporting()
    println("${passengerCar3.numberOfPassengers} чел.\n")

}