package kotlinsprint.lesson_9.task_5

import java.util.*

fun main() {
    val numberOfIngredients = 5
    val ingredients = mutableListOf<String>()

    for (i in 0 until numberOfIngredients) {
        println("Введите название ингредиента ${i + 1}:")
        var ingredient = readln()

        if (!ingredients.contains(ingredient)) {
            ingredients.add(ingredient)
        } else {
            while (ingredients.contains(ingredient)) {
                println("Такой ингредиент уже есть в списке. Введите другой ингредиент:")
                ingredient = readln()
            }

            ingredients.add(ingredient)
        }
    }

    ingredients.sort()

    val separator = ", "
    val postfix = "."
    val result = ingredients.joinToString(separator, "", postfix).replaceFirstChar {
        if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
    }

    println(result)
}