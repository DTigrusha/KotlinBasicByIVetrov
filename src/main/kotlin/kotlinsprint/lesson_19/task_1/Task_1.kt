package kotlinsprint.lesson_19.task_1

enum class Fishes {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun fishesDescription(fish: Fishes): String {
    return when (fish) {
        Fishes.GUPPY -> "гуппи"
        Fishes.ANGELFISH -> "скалярия"
        Fishes.GOLDFISH -> "золотая рыбка"
        Fishes.SIAMESE_FIGHTING_FISH -> "петушок"
    }
}

fun main() {

    println("Вы можете добавить в свой аквариум следующие виды рыб:")

    for (i in Fishes.values()) {
        println(fishesDescription(i))
    }

}