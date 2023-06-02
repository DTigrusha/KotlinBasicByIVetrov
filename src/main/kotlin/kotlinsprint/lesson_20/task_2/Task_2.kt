package kotlinsprint.lesson_20.task_2

class Player(
    val name: String,
    var currentHealth: Int,
    private val fullHealth: Int = 20,
) {

    val healing: () -> Unit = { currentHealth = fullHealth }

}

fun main() {
    val player = Player(
        "Tiger",
        8,
    )

    println(player.currentHealth)

    player.healing()

    println(player.currentHealth)

}