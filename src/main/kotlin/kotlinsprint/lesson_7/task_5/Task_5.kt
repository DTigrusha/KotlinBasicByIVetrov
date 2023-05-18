package kotlinsprint.lesson_7.task_5

fun main() {
    println("Введите количество символов, из которых должен состоять сгенерироованный пароль:")

    val numberOfSymbols = readln().toInt()
    var password = ""

    for (i in 1..numberOfSymbols) {
        val values = listOf<String>(
            (0..9).random().toString(),
            ('a'..'z').random().toString(),
            ('A'..'Z').random().toString()
        )
        password += values.random()
    }
    println(password)
}