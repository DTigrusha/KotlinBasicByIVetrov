package kotlinsprint.lesson_5.task_1

fun main() {
    val firstCheckNumber = 2
    val secondCheckNumber = 5
    println("Для входа в приложение Вам необходимо пройти проверку!\nПожалуйста, решите пример: " +
            "\"$firstCheckNumber + $secondCheckNumber\" и введите Ваш ответ ниже:")

    val inputAnswer = readln().toInt()
    if (inputAnswer == (firstCheckNumber + secondCheckNumber)) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}