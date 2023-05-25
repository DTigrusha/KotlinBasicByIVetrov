package kotlinsprint.lesson_15.task_2

abstract class BasicMessage {

    abstract val text: String

    fun connectToServer() {
        println("Подключение к серверу осуществлено.")
    }

    fun sendMessage() {
        println("Сообщение: \"$text\" передается на сервер.")
    }

}

class TemperatureMessage(override val text: String) : BasicMessage()

class PrecipitationMessage(override val text: String) : BasicMessage()

fun main() {

    val temperatureMessage = TemperatureMessage("температура воздуха + 15 градусов")
    val precipitationMessage = PrecipitationMessage("осадки не ожидаются")

    temperatureMessage.connectToServer()
    temperatureMessage.sendMessage()

    precipitationMessage.connectToServer()
    precipitationMessage.sendMessage()
}