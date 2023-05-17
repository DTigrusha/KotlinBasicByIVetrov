package kotlinsprint.lesson_9.task_4

fun main() {
    println("Введите пять ингредиентов через запятую:")
    val inputIngredients = readln()

    val listOfIngredients = inputIngredients.split(", ").toMutableList()

    listOfIngredients.sort()

    listOfIngredients.forEach {
        println(it)
    }
}