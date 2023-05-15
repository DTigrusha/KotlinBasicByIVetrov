package kotlinsprint.lesson_6.task_3

fun main() {
    println("Введите количество секунд, которые необходимо засечь:")

    val numberOfSeconds = readln().toInt()
    var counter = 0

    while (counter < numberOfSeconds) {
        println("Осталось секунд: ${numberOfSeconds - counter}.")
        Thread.sleep(1000)
        counter++
    }

    println("Время вышло.")

}