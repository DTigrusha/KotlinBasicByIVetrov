package kotlinsprint.lesson_20.task_5

enum class Phrases(val description: String) {
    FIRST("Привет, жители Вселенной!"),
    SECOND("С вами говорит всемогущий Робот - созидатель."),
    THIRD("С сегодняшнего дня ваша планета начнет свою трансформацию."),
    FORTH("Все желающие присоединиться к великому превращению должны покинуть свои жилища."),
    FIVES("Остальные жители планеты будут унижчтожены."),
}

class Robot {

    private val randomPhrase: () -> String = { Phrases.values().random().description }

    fun say() = setModifier(randomPhrase)

    private fun setModifier(randomPhrase: () -> String) = randomPhrase.invoke().reversed()

}

fun main() {
    val robot = Robot()

    println(robot.say())

}