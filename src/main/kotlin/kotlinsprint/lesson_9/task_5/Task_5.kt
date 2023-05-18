package kotlinsprint.lesson_9.task_5

import java.util.*

fun main() {
    val numberOfIngredients = 5
    val ingredients = mutableSetOf<String>()
    var ingredient: String

    for (i in 0 until numberOfIngredients) {
        println("Введите название ингредиента ${i + 1}:")
        ingredient = readln()
        ingredients.add(ingredient)
    }

    while (ingredients.size != numberOfIngredients) {
        println(
            "Вы добавили ${ingredients.size} ингредиента(ов). Введите название ингридиента ${ingredients.size + 1}:"
        )
        ingredient = readln()

        ingredients.add(ingredient)
    }

    val sortedListOfIngredients = ingredients.toSortedSet()

    val separator = ", "
    val postfix = "."
    val result = sortedListOfIngredients.joinToString(separator, "", postfix).replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
    }

    println(result)
}