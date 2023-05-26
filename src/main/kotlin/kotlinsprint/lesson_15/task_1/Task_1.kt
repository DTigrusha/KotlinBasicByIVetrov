package kotlinsprint.lesson_15.task_1

interface Flyable {

    fun fly() = "умеет летать"

}

interface Floating {

    fun floatUnderWater() = "умеет плавать под водой"

    fun floatOnWater() = "умеет плавать на воде"

}

class Crucian(val name: String = "Карась") : Floating

class Gull(val name: String = "Чайка") : Flyable, Floating

class Duck(val name: String = "Утка") : Flyable, Floating

fun main() {

    val crucian = Crucian()
    val gull = Gull()
    val duck = Duck()


    println(
        "${crucian.name} ${crucian.floatUnderWater()}.\n${gull.name} ${gull.fly()} и ${gull.floatOnWater()}." +
                "\n${duck.name} ${duck.fly()} и ${duck.floatOnWater()}."
    )

}