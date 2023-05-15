package kotlinsprint.lesson_5.task_3

fun main() {
    val firstNumber = 20
    val secondNumber = 50

    println("Добро пожаловать в ИГРУ! В нашей ИГРЕ Вам необходимо угадать два загаданных компьютером числа " +
            "от 1 до 100!\nВвведите, пожалуйста, первое число:")

    val userFirstNumber = readln().toInt()

    println("Ввведите, пожалуйста, второе число:")

    val userSecondNumber = readln().toInt()

    when {
        userFirstNumber == firstNumber && userSecondNumber == secondNumber ->
            println("Поздравляем! Вы выиграли главный приз!")
        userFirstNumber == firstNumber || userSecondNumber == secondNumber ->
            println("Вы выиграли утешительный приз!")
        else -> println("Неудача! Крутите барабан!")
    }
    println("Комьютер загадал числа: $firstNumber и $secondNumber.")
}