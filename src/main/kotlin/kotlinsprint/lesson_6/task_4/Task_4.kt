package kotlinsprint.lesson_6.task_4

fun main() {
    val computerNumber = (1..9).random()
    val attempt = 5
    var counter = 1
    var userNumber: Int

    println("Добро пожаловать в ИГРУ!\nВам необходимо угадать число от 1 до 9. У Вас на это 5 попыток.")

    do {
        println("Введите Ваш ответ:")
        userNumber = readln().toInt()
    } while (userNumber != computerNumber && counter++ < attempt  )

    println(if (userNumber == computerNumber) "Это была великолепная игра!" else "Было загадано число: $computerNumber")
}