package kotlinsprint.lesson_15.task_1

interface Flyable {

    fun fly() {
        print("умеет летать")
    }

}

interface Floating {

    fun floatUnderWater() {
        print("умеет плавать под водой")
    }

    fun floatOnWater() {
        print("умеет плавать на воде")
    }

}

class Crucian(val name: String = "Карась") : Floating

class Gull(val name: String = "Чайка") : Flyable, Floating

class Duck(val name: String = "Утка") : Flyable, Floating

fun main() {

    val crucian = Crucian()
    val gull = Gull()
    val duck = Duck()

    print("${crucian.name} ")
    crucian.floatUnderWater()
    println(".")

    print("${gull.name}: ")
    gull.fly()
    print(" и ")
    gull.floatOnWater()
    println(".")

    print("${duck.name}: ")
    duck.fly()
    print(" и ")
    duck.floatOnWater()
    println(".")

}