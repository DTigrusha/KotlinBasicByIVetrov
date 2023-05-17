package kotlinsprint.lesson_9.task_2

fun main() {
    val ingredients = mutableListOf("мясо", "картошка", "масло")

    ingredients.forEach {
        println(it)
    }

    println("В рецепте есть базовые ингредиенты: $ingredients.\nЖелаете добавить еще?")
    val userAnswer = readln()

    if (userAnswer == "да") {
        println("Какой ингредиент Вы хотите добавить?")
        val newIngredient = readln()

        ingredients.add(newIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: $ingredients.")
    }
}