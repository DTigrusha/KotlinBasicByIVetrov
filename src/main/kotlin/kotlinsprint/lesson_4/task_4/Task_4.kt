package kotlinsprint.lesson_4.task_4

fun main() {
    val dayOfTraining = 5
    val isEvenDay = (dayOfTraining % 2) == 0

    println("""
        Упражнения для рук:    ${!isEvenDay}
        Упражнения для ног:    $isEvenDay
        Упражнения для спины:  $isEvenDay
        Упражнения для пресса: ${!isEvenDay}
    """.trimIndent())
}