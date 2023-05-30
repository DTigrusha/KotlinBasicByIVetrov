package kotlinsprint.lesson_18.task_3

open class Tamagotchi {

    open fun printTamagotchiActivity() {}
}

class Fox(
    private val name: String,
    private val activity: List<String> = listOf("играет", "спит", "ест ягоды"),
) : Tamagotchi() {

    override fun printTamagotchiActivity() {
        activity.forEach {
            println("$name - $it")
        }
    }

}

class Dog(
    private val name: String,
    private val activity: List<String> = listOf("играет", "спит", "ест кости"),
) : Tamagotchi() {

    override fun printTamagotchiActivity() {
        activity.forEach {
            println("$name - $it")
        }
    }

}

class Cat(
    private val name: String,
    private val activity: List<String> = listOf("играет", "спит", "ест рыбу"),
) : Tamagotchi() {

    override fun printTamagotchiActivity() {
        activity.forEach {
            println("$name - $it")
        }
    }

}

fun main() {

    val fox: Tamagotchi = Fox("Лиса Патрикиевна")
    val dog: Tamagotchi = Dog("Гав Гавыч")
    val cat: Tamagotchi = Cat("Кот Котофеич")

    val listOfTamagotchi = listOf(fox, dog, cat)

    listOfTamagotchi.forEach {
        it.printTamagotchiActivity()
        println()
    }

}

