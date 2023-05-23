package kotlinsprint.lesson_12.task_5

class WeatherData(
    val dayTemperature: Int,
    val nightTemperature: Int,
    val isRainy: String,
    val atmosphericPressure: Int,
)

fun main() {

    val listOfWeatherData: MutableList<WeatherData> = mutableListOf()
    val numberOfObjects = 10

    for (i in 0 until numberOfObjects) {
        val weatherData = WeatherData(
            dayTemperature = (10..40).random(),
            nightTemperature = (0..30).random(),
            isRainy = listOf("да", "нет").random(),
            atmosphericPressure = (735..765).random(),
        )
        listOfWeatherData.add(weatherData)
    }

    var sumOfDayTemperatures = 0
    var sumOfNightTemperatures = 0
    var sumOfRainyDay = 0
    var sumOfAtmosphericPressure = 0


    for (i in 0 until listOfWeatherData.size) {
        sumOfDayTemperatures += listOfWeatherData[i].dayTemperature
        sumOfNightTemperatures += listOfWeatherData[i].nightTemperature
        sumOfRainyDay += if (listOfWeatherData[i].isRainy == "да") 1 else 0
        sumOfAtmosphericPressure += listOfWeatherData[i].atmosphericPressure
    }

    val averageDayTemperature = sumOfDayTemperatures / numberOfObjects
    val averageNightTemperature = sumOfNightTemperatures / numberOfObjects
    val averageAtmosphericPressure = sumOfAtmosphericPressure / numberOfObjects

    println(
        "Показатели за период $numberOfObjects дней:\nсредняя дневная температура = $averageDayTemperature," +
                "\nсредняя ночная температура = $averageNightTemperature,\nколичество дождливых дней = $sumOfRainyDay," +
                "\nсреднее атмосферное давление = $averageAtmosphericPressure"
    )
}