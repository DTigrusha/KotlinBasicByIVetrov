package kotlinsprint.lesson_12.task_2

class NewWeather(_dayTemperature: Int, _nightTemperature: Int, _isRainy: Boolean, _atmosphericPressure: Int) {
    var dayTemperature = _dayTemperature
    var nightTemperature = _nightTemperature
    var isRainy = _isRainy
    var atmosphericPressure = _atmosphericPressure

    fun printWeatherInfo() {
        println(
            "Информация о погоде:\nдневная температура - $dayTemperature,\nночная температура - $nightTemperature," +
                    "\nшел ли дождь - ${if (isRainy) "да" else "нет"}," +
                    "\nатмосферное давление - $atmosphericPressure"
        )
    }
}

fun main() {

    val weather1 = NewWeather(25, 20, false, 765)
    weather1.printWeatherInfo()

    println()

    val weather2 = NewWeather(10, 3, true, 750)
    weather2.printWeatherInfo()

    println()

    val weather3 = NewWeather(35, 33, false, 765)
    weather3.printWeatherInfo()

}