package kotlinsprint.lesson_10.task_1

fun main() {
    println("Добро пожаловать в игру Dice!\nСейчас твой ход, бросай кости!")
    val (firstUserDice, secondUserDice) = throwDice()
    val userResult = firstUserDice + secondUserDice

    println("Теперь ход компьютера. Он бросает кости!")
    val (firstComputerDice, secondComputerDice) = throwDice()
    val computerResult = firstComputerDice + secondComputerDice

    println(
    if (userResult > computerResult) "Победило человечество!"
    else if (userResult == computerResult) "Победила дружба интеллектов ;)"
    else "Победила машина!"
    )
}

data class ResultOfThrowing(val firstDice: Int, val secondDice: Int)

fun throwDice(): ResultOfThrowing {
    val firstDice = (1..6).random()
    val secondDice = (1..6).random()

    return ResultOfThrowing(firstDice, secondDice)
}