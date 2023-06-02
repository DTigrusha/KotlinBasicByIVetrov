package kotlinsprint.lesson_18.task_2

abstract class Dice(
    private val numberOfSides: Int,
) {

    fun printNumber() {
        println("На кубике с количеством граней: $numberOfSides выпало число: ${throwDie()}")
    }

    private fun throwDie(): Int = (1..numberOfSides).random()

}

class FourSidesDie(
    numberOfSides: Int = 4,
) : Dice(numberOfSides)

class SixSidesDie(
    numberOfSides: Int = 6,
) : Dice(numberOfSides)

class EightSidesDie(
    numberOfSides: Int = 8,
) : Dice(numberOfSides)

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