package kotlinsprint.lesson_12.task_3

class Day(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isRainy: Boolean = true,
    val atmosphericPressure: Int,
) {

    fun printWeatherInfo() {
        println(
            "Информация о погоде:\nдневная температура - $dayTemperature,\nночная температура - $nightTemperature," +
                    "\nшел ли дождь - ${if(isRainy) "да" else "нет"},\nатмосферное давление - $atmosphericPressure"
        )
    }
}

fun main() {

    val day1 = Day(25, 20, false, 765)
    day1.printWeatherInfo()

    println()

    val day2 = Day(10, 3, true, 750)
    day2.printWeatherInfo()

    println()

    val day3 = Day(35, 33, false, 765)
    day3.printWeatherInfo()

}