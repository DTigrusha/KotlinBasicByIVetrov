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
        listOfElements.map { ("Нажат элемент \"$it\"") }.run {
            for (i in this.indices step 2)
                println(this[i])
        }
    }

}