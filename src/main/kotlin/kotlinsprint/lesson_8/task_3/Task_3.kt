package kotlinsprint.lesson_8.task_3

fun main() {
    val pilafRecipe = arrayOf("рис", "мясо", "морковь", "лук", "специи", "бульон")

    println("Введите название ингредиента, наличие которого в рецепте Вы хотите проверить:")

    val ingredient = readln()

    println(
        if (ingredient in pilafRecipe) "Ингредиент $ingredient в рецепте есть."
        else "Такого ингредиента в рецепте нет."
    )
}