package kotlinsprint.lesson_20.task_3

class Player(
    var hasKey: Boolean,
) {

    val checkKey: () -> Unit = {
        if (hasKey) {
            println("Игрок открыл дверь.")
        } else {
            println("Дверь заперта.")
        }
    }

}

fun main() {
    val player = Player(true)

    player.checkKey()

    player.hasKey = false

    player.checkKey()

}