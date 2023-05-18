package kotlinsprint.lesson_9.task_1

fun main() {
    val ingredients = listOf("мясо", "макароны", "масло", "специи", "зелень", "соус")

    println("В рецепте есть следующие ингредиенты: $ingredients.")

    ingredients.forEach { i ->
        println(i)
    }
}