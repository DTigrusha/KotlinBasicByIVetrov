package kotlinsprint.lesson_8.task_2

fun main() {
    val pilafRecipe = arrayOf("рис", "мясо", "морковь", "лук", "специи", "бульон")

    println("Введите название ингредиента, наличие которого в рецепте Вы хотите проверить:")

    val ingredient = readln()

    for (i in pilafRecipe) {
        if (ingredient == i) {
            println("Ингредиент $ingredient в рецепте есть.")
            return
        }
    }
    println("Такого ингредиента в рецепте нет.")

}