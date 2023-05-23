package kotlinsprint.lesson_12.task_1

class Weather {
    var dayTemperature = 20
    var nightTemperature = 10
    var isRainy = true
    var atmosphericPressure = 755

    fun printWeatherInfo() {
        println(
            "Информация о погоде:\nдневная температура - $dayTemperature,\nночная температура - $nightTemperature," +
                    "\nшел ли дождь - ${if (isRainy) "да" else "нет"},\nатмосферное давление - $atmosphericPressure"
        )
    }
}

fun main() {

    val weather1 = Weather()
    weather1.dayTemperature = 25
    weather1.nightTemperature = 20
    weather1.isRainy = false
    weather1.atmosphericPressure = 765
    weather1.printWeatherInfo()

    println()

    val weather2 = Weather()
    weather2.dayTemperature = 10
    weather2.nightTemperature = 3
    weather2.isRainy = true
    weather2.atmosphericPressure = 750
    weather2.printWeatherInfo()

}