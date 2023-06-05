package kotlinsprint.lesson_20.task_4

fun main() {
    val listOfElements = listOf(
        "кнопка: СТАРТ",
        "кнопка: СТОП",
        "кнопка: ПЕРЕМОТКА ВПЕРЕД",
        "кнопка:  ПЕРЕМОТКА НАЗАД",
        "кнопка: СЛЕДУЮЩИЙ ТРЕК"
    )

    val listOfLambdaElements: List<() -> Unit> = listOf { listOfElements.map { "Нажат элемент \"$it\"" } }

    for (i in listOfLambdaElements.indices step 2)
        println(listOfLambdaElements[i])
}