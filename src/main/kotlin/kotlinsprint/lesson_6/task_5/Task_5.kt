package kotlinsprint.lesson_6.task_5

fun main() {
    var total: Int
    var inputAnswer: Int
    var attempt = 1
    println("Для входа в приложение Вам необходимо пройти проверку! У Вас три попытки.")
    do {
        val firstCheckNumber = (1..9).random()
        val secondCheckNumber = (1..9).random()
        total = firstCheckNumber + secondCheckNumber

        println("Пожалуйста, решите пример: \"$firstCheckNumber + $secondCheckNumber\" и введите Ваш ответ ниже:")

        inputAnswer = readln().toInt()

    } while (inputAnswer != total && attempt++ < 3)

    println(if (inputAnswer == total) "Добро пожаловать!" else "Доступ запрещен.")
}