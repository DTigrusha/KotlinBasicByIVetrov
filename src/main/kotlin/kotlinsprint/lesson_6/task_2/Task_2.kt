package kotlinsprint.lesson_6.task_2

fun main() {
    println("Введите количество секунд, которые необходимо засечь:")

    val numberOfSeconds = readln().toInt()
    var counter = 0

    while (counter < numberOfSeconds) {
        Thread.sleep(1000)
        counter++
    }
     println("Прошло $numberOfSeconds секунд.")

}