package kotlinsprint.lesson_12.task_3

class Day(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isRainy: String = "да",
    val atmosphericPressure: Int,) {

    fun printWeatherInfo() {
        println(
            "Информация о погоде:\nдневная температура - $dayTemperature,\nночная температура - $nightTemperature," +
                    "\nшел ли дождь - $isRainy,\nатмосферное давление - $atmosphericPressure"
        )
    }
}

fun main() {

    val day1 = Day(25, 20, "нет", 765)
    day1.printWeatherInfo()

    println()

    val day2 = Day(10, 3, "да", 750)
    day2.printWeatherInfo()

    println()

    val day3 = Day(35, 33, "нет", 765)
    day3.printWeatherInfo()

}