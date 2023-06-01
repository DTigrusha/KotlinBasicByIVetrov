package kotlinsprint.lesson_18.task_3

abstract class Tamagotchi(
    val name: String,
) {

    abstract fun play()

    abstract fun sleep()

    abstract fun eat()
}

class Fox(
    name: String,
    private val listOfActivities: List<String> = listOf("играет", "спит", "ест ягоды"),
) : Tamagotchi(name) {

    override fun play() {
        println("$name - ${listOfActivities[0]}")
    }

    override fun sleep() {
        println("$name - ${listOfActivities[1]}")
    }

    override fun eat() {
        println("$name - ${listOfActivities[2]}")
    }

}

class Dog(
    name: String,
    private val listOfActivities: List<String> = listOf("играет", "спит", "ест кости"),
) : Tamagotchi(name) {

    override fun play() {
        println("$name - ${listOfActivities[0]}")
    }

    override fun sleep() {
        println("$name - ${listOfActivities[1]}")
    }

    override fun eat() {
        println("$name - ${listOfActivities[2]}")
    }

}

class Cat(
    name: String,
    private val listOfActivities: List<String> = listOf("играет", "спит", "ест рыбу"),
) : Tamagotchi(name) {

    override fun play() {
        println("$name - ${listOfActivities[0]}")
    }

    override fun sleep() {
        println("$name - ${listOfActivities[1]}")
    }

    override fun eat() {
        println("$name - ${listOfActivities[2]}")
    }

}

fun printTamagotchiActivities(listOfTamagotchi: List<Tamagotchi>) {
    listOfTamagotchi.forEach {
        it.play()
        it.sleep()
        it.eat()
        println()
    }
}

fun main() {

    val fox: Tamagotchi = Fox("Лиса Патрикиевна")
    val dog: Tamagotchi = Dog("Гав Гавыч")
    val cat: Tamagotchi = Cat("Кот Котофеич")

    val listOfTamagotchi = listOf(fox, dog, cat)

    printTamagotchiActivities(listOfTamagotchi)

}

