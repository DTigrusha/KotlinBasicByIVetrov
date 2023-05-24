package kotlinsprint.lesson_13.task_5

fun main() {

    try {
        println("Введите номер телефона:")
        val strNumber = readLine().toString()

        val number = strNumber.toLong()
    } catch (e: NumberFormatException) {
        println("Номер может содержать только цифры!")
    }
}