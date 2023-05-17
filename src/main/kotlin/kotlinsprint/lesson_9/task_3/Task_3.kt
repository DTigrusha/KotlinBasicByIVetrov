package kotlinsprint.lesson_9.task_3

fun main() {
    val numberOfIngredients = mutableListOf(2, 50, 15)

    println("Укажите количество порции, на которое необходимо рассчитать количество ингредиентов:")
    val numberOfServings = readln().toInt()

    val newNumberOfIngredients = numberOfIngredients.map {
        it * numberOfServings
    }

    println("На $numberOfServings порций Вам понадобится: яиц - ${newNumberOfIngredients[0]}, " +
            "молока - ${newNumberOfIngredients[1]}, сливочного масла - ${newNumberOfIngredients[2]}.")
}