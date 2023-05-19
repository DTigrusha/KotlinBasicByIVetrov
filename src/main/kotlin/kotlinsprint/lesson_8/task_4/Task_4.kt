package kotlinsprint.lesson_8.task_4

fun main() {
    val ingredients = arrayOf("мясо", "рис", "морковь", "изюм", "бульон", "лук", "соль", "перец")

    for (i in ingredients) {
        println("${ingredients.indexOf(i) + 1}. $i")
    }

    println("Введите название ингредиента, который Вы хотите заменить:")
    val ingredientToChange: String = readln()

    if (ingredientToChange in ingredients) {
        println("Введите название ингредиента, который Вы хотели бы добавить:")
        val newIngredient = readln()

        ingredients[ingredients.indexOf(ingredientToChange)] = newIngredient

        println("Готово! Вы сохранили следующий список ингредиентов:")

        for (i in ingredients) {
            println("${ingredients.indexOf(i) + 1}. $i")
        }
    } else if (ingredientToChange !in ingredients) {
        println("Такого ингредиента нет в списке.")
    }
}