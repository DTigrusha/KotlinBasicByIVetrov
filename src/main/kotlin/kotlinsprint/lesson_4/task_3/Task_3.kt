package kotlinsprint.lesson_4.task_3

fun main() {
    val sunnyWeather = true
    val isTentOpened = true
    val humidity = 20
    val season = "winter"

    println("Благоприятные ли условия сейчас для роста бобовых? ${sunnyWeather && isTentOpened && humidity == 20 && season != "winter"}")

}