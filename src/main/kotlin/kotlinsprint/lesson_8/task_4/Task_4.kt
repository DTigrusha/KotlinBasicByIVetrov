package kotlinsprint.lesson_8.task_4

fun main() {
    val ingredients = arrayOf("мясо", "рис", "морковь", "изюм", "бульон", "лук", "соль", "перец")

    for (i in ingredients) {
        println("${ingredients.indexOf(i) + 1}. $i")
    }

    println("Введите название ингредиента, который Вы хотите заменить:")
    val ingredientToChange = readln()

    for (i in ingredients) {
        if (i == ingredientToChange) {
            println("Введите название ингредиента, который Вы хотели бы добавить:")
            val newIngredient = readln()

            ingredients[ingredients.indexOf(i)] = newIngredient
            break
        } else if (ingredientToChange !in ingredients) {
            println("Такого ингредиента нет в списке.")
            return
        }
    }
    for (i in ingredients) {
        println("${ingredients.indexOf(i) + 1}. $i")
    }
}