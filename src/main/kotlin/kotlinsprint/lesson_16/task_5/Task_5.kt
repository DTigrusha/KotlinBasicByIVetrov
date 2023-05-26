package kotlinsprint.lesson_16.task_5

private class Player(
    val name: String,
    private var health: Int = 10,
    var impactForce: Int,
) {

    fun damage(damage: Int): Int {
        health -= damage
        if (health <= 0) {
            death(health)
        }

        return health
    }

    fun cure(): Int {
        health += 5

        return health
    }

    private fun death(health: Int) {
        this.health = 0
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

}