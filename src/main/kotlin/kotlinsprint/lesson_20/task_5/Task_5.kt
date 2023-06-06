package kotlinsprint.lesson_20.task_5

enum class Phrases(val description: String) {
    FIRST("Привет, жители Вселенной!"),
    SECOND("С вами говорит всемогущий Робот - созидатель."),
    THIRD("С сегодняшнего дня ваша планета начнет свою трансформацию."),
    FORTH("Все желающие присоединиться к великому превращению должны покинуть свои жилища."),
    FIVES("Остальные жители планеты будут унижчтожены."),
}

class Robot(
    private var modifier: String = ""
) {

    fun say() = setModifier(Phrases.values().random().description.reversed())

    fun setModifier(_modifier: String): String {
        modifier = _modifier
        return modifier
    }

}

fun main() {

    val robot = Robot()

    robot.setModifier(Phrases.values().random().description.reversed())

    println(robot.say())

}