package kotlinsprint.lesson_10.task_3

fun main() {
    println("Для генерации пароля укажите его длинну:")
    val lengthOfPassword = readln().toInt()
    val userPassword = createPassword(lengthOfPassword)

    println(userPassword)
}

fun createPassword(lengthOfPassword: Int): String {
    var generatedPassword = ""

    for (i in 1..lengthOfPassword) {
        val even = (0..9).random()
        val odd = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ').random()
        if (i % 2 != 0) {
            generatedPassword += odd
        } else {
            generatedPassword += even
        }
    }
    return generatedPassword
}