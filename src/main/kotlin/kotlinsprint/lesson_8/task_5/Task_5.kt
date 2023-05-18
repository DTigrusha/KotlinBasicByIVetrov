package kotlinsprint.lesson_8.task_5

fun main() {
    println("Введите количество ингредиентов, которые вы хотите добавить в список:")
    val numberOfIngredients = readln().toInt()

    val ingredients = arrayOfNulls<String>(numberOfIngredients)

    for (i in 0 until numberOfIngredients) {
        println("Введите название ингредиента №${i + 1}:")
        val ingredient = readln()
        ingredients[i] = ingredient
    }
}