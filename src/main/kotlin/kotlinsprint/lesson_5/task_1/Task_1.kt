package kotlinsprint.lesson_5.task_1

fun main() {
    println("Для входа в приложение Вам необходимо пройти проверку!\nПожалуйста, решите пример: \"2 + 5\" и введите " +
            "Ваш ответ ниже:")

    val inputAnswer = readLine()!!.toInt()
    if (inputAnswer == (2 + 5)) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}