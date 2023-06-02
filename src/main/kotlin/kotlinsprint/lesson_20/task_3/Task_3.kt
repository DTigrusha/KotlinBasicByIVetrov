package kotlinsprint.lesson_20.task_3

class Player(
    var isHasKey: Boolean,
) {

    val checkKey: () -> Unit = {
        if (isHasKey) {
            println("Игрок открыл дверь.")
        } else {
            println("Дверь заперта.")
        }
    }

}

fun main() {
    val player = Player(true)

    player.checkKey()

    player.isHasKey = false

    player.checkKey()

}