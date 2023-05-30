package kotlinsprint.lesson_18.task_2

open class Dice(
    val numberOfSides: Int,
) {

    open fun printNumber() {}
}

class FourSidesDie(
    numberOfSides: Int = 4,
) : Dice(numberOfSides) {
    override fun printNumber() {
        println("На кубике с количеством граней: $numberOfSides выпало число: ${(1..numberOfSides).random()}")
    }
}

class SixSidesDie(
    numberOfSides: Int = 6,
) : Dice(numberOfSides) {
    override fun printNumber() {
        println("На кубике с количеством граней: $numberOfSides выпало число: ${(1..numberOfSides).random()}")
    }
}

class EightSidesDie(
    numberOfSides: Int = 8,
) : Dice(numberOfSides) {
    override fun printNumber() {
        println("На кубике с количеством граней: $numberOfSides выпало число: ${(1..numberOfSides).random()}")
    }
}

fun main() {

    val fourSidesDie = FourSidesDie()
    val sixSidesDie = SixSidesDie()
    val eightSidesDie = EightSidesDie()

    val listOfDice: List<Dice> = listOf(fourSidesDie, sixSidesDie, eightSidesDie)

    listOfDice.forEach {
        it.printNumber()
        println()
    }

}