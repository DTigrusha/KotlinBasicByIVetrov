package kotlinsprint.lesson_19.task_4

enum class Bullets(
    val impactForce: Int,
) {
    BLUE(5),
    GREEN(10),
    RED(20),
}

fun getBulletType(bullet: Bullets): String {
    return when (bullet) {
        Bullets.BLUE -> "синий патрон"
        Bullets.GREEN -> "зеленый патрон"
        Bullets.RED -> "красный патрон"
    }
}

fun getImpactForce(bullet: Bullets): Int {
    return when (bullet) {
        Bullets.BLUE -> Bullets.BLUE.impactForce
        Bullets.GREEN -> Bullets.GREEN.impactForce
        Bullets.RED -> Bullets.RED.impactForce
    }

}

class Tank {

    fun armWithBullet(bullet: Bullets) = "Орудие танка заряжено патронами типа: \"${getBulletType(bullet)}\"."

    fun shoot(bullet: Bullets) = "Танк выстрелил и нанес удар: ${getImpactForce(bullet)}."
}

fun main() {

    val tank = Tank()

    println("${tank.armWithBullet(Bullets.BLUE)}\n${tank.shoot(Bullets.BLUE)}\n")
    println("${tank.armWithBullet(Bullets.RED)}\n${tank.shoot(Bullets.RED)}\n")
    println("${tank.armWithBullet(Bullets.GREEN)}\n${tank.shoot(Bullets.GREEN)}\n")

}