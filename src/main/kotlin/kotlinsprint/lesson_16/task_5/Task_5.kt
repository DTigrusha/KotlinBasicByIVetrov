package kotlinsprint.lesson_16.task_5

private class Player(
    val name: String,
    private var health: Int = 10,
    var impactForce: Int,
) {

    fun damage(damage: Int): Int {
        health -= damage
        if (health <= 0) {
            death()
        }

        return health
    }

    fun cure(): Int {

        if (health > 0) {
            health += 5
        } else {
            health = 0
        }

        return health
    }

    private fun death() {
        health = 0
        impactForce = 0

        print("Игрок \"$name\" погиб.")
    }

}

fun main() {

    val player = Player(
        name = "Трансформер",
        impactForce = 4,
    )

    player.damage(6)
    player.cure()
    player.damage(8)
    player.cure()
    player.damage(10)
    player.cure()

}