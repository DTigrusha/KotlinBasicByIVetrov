package kotlinsprint.lesson_7.task_2

fun main() {
    do {
        val authorizationCode = (1000..9999).random()

        println("Ваш код авторизации: $authorizationCode.\nВведите код ниже:")

        val userInput = readln().toInt()
    } while (userInput != authorizationCode)

    println("Добро пожаловать!")
}