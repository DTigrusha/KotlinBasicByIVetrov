package kotlinsprint.lesson_10.task_4

data class ResultOfThrowing(val firstDice: Int, val secondDice: Int)

var numberOfHumanVictories = arrayOf(0)

fun main() {
    var userAnswer: String
    do {
        println("Добро пожаловать в игру Dice!\nСейчас твой ход, бросай кости!")
        val (firstUserDice, secondUserDice) = throwDice()
        val userResult = firstUserDice + secondUserDice

        println("Теперь ход компьютера. Он бросает кости!")
        val (firstComputerDice, secondComputerDice) = throwDice()
        val computerResult = firstComputerDice + secondComputerDice

        numberOfHumanVictories = checkGameResult(numberOfHumanVictories, userResult, computerResult)
        userAnswer = continueGame(numberOfHumanVictories)
    } while (userAnswer == "да")
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
    return numberOfHumanVictories
}

fun throwDice(): ResultOfThrowing {
    val firstDice = (1..6).random()
    val secondDice = (1..6).random()

    return ResultOfThrowing(firstDice, secondDice)
}

fun continueGame(numberOfHumanVictories: Array<Int>): String {
    println("Хотите бросить кости еще раз?\nВведите \"да\" или \"нет\":")
    val userAnswer = readln().lowercase()

    if (userAnswer != "да") {
        println("Игра окончена!\nВы выиграли ${numberOfHumanVictories[0]} раз(а).")
    }
    return userAnswer
}