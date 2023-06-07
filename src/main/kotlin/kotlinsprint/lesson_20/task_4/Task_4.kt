package kotlinsprint.lesson_20.task_4

fun main() {
    val listOfElements = listOf(
        "кнопка: СТАРТ",
        "кнопка: СТОП",
        "кнопка: ПЕРЕМОТКА ВПЕРЕД",
        "кнопка:  ПЕРЕМОТКА НАЗАД",
        "кнопка: СЛЕДУЮЩИЙ ТРЕК"
    )

        val listOfLambdaElements: List<() -> Unit> = buildList {
        for (i in listOfElements.indices) {
            add { listOfElements.map { println("Нажат элемент \"$it\"") } }
        }
    }
    listOfLambdaElements[0].invoke()
}