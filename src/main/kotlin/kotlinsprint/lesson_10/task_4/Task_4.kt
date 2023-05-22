package kotlinsprint.lesson_10.task_4

data class ResultOfThrowing(val firstDice: Int, val secondDice: Int)

val numberOfHumanVictories = arrayOf(0)

fun main() {
    println("Добро пожаловать в игру Dice!\nСейчас твой ход, бросай кости!")
    val (firstUserDice, secondUserDice) = throwDice()
    val userResult = firstUserDice + secondUserDice

    println("Теперь ход компьютера. Он бросает кости!")
    val (firstComputerDice, secondComputerDice) = throwDice()
    val computerResult = firstComputerDice + secondComputerDice

    checkGameResult(numberOfHumanVictories, userResult, computerResult)
}

fun checkGameResult(numberOfHumanVictories: Array<Int>, userResult: Int, computerResult: Int): Array<Int> {
    if (userResult > computerResult) {
        println("Победило человечество!")
        numberOfHumanVictories[0] = numberOfHumanVictories[0] + 1
    } else if (userResult == computerResult) {
        println("Победила дружба интеллектов ;)")
    } else {
        println("Победила машина!")
    }
    continueGame(numberOfHumanVictories)

    return numberOfHumanVictories
}

fun throwDice(): ResultOfThrowing {
    val firstDice = (1..6).random()
    val secondDice = (1..6).random()

    return ResultOfThrowing(firstDice, secondDice)
}

fun continueGame(numberOfHumanVictories: Array<Int>) {
    println("Хотите бросить кости еще раз?\nВведите \"да\" или \"нет\":")
    val userAnswer = readln().lowercase()

    if (userAnswer == "да") {
        main()
    } else {
        println("Игра окончена!\nВы выиграли ${numberOfHumanVictories[0]} раз(а).")
    }
}
