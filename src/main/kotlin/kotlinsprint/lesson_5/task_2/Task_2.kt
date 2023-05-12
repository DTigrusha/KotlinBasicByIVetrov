package kotlinsprint.lesson_5.task_2

import java.time.LocalDate

fun main() {
    val currentYear = LocalDate.now().year

    println("Укажите, пожалуйста, год Вашего рождения:")

    val userYearOfBirth = readLine()!!.toInt()

    if ((currentYear - userYearOfBirth) >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом.")
}

const val AGE_OF_MAJORITY = 18