package kotlinsprint.lesson_1.task_5

fun main() {
    val totalSeconds = 6480
    val minutes = totalSeconds / 60

    println("$minutes:${"%02d".format(totalSeconds % 60)}")

}
