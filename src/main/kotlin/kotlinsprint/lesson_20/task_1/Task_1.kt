package kotlinsprint.lesson_20.task_1

fun main() {
    val userName = "Александр"
    val greeting: (String) -> String = { it: String -> "C наступающим Новым Годом, $it!" }

    println(greeting(userName))
}