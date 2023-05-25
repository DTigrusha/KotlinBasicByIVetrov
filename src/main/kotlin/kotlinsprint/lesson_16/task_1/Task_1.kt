package kotlinsprint.lesson_16.task_1

private class Dice(private val number: Int = (0..6).random()) {

    fun getNumber() {
        println("На кубике выпало число: $number")
    }
}

fun main() {

    val dice = Dice()

    dice.getNumber()

}