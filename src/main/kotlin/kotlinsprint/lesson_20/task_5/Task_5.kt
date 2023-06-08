package kotlinsprint.lesson_20.task_5

enum class Phrases(val description: String) {
    FIRST("Привет, жители Вселенной!"),
    SECOND("С вами говорит всемогущий Робот - созидатель."),
    THIRD("С сегодняшнего дня ваша планета начнет свою трансформацию."),
    FORTH("Все желающие присоединиться к великому превращению должны покинуть свои жилища."),
    FIVES("Остальные жители планеты будут унижчтожены."),
}

class Robot(
    var modifier: (String) -> String = { it }
) {

    fun say() {
        val phraseToModify = Phrases.values().random().description
        println(modifier.invoke(phraseToModify))
    }

    private fun setPhraseModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }

}

fun main() {

    val robot = Robot()
    robot.modifier = { it.reversed() }
    robot.say()

}