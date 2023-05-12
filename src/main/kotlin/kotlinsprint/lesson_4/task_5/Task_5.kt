package kotlinsprint.lesson_4.task_5

fun main() {
    val minSizeOfCrew = 55
    val recommendedSizeOfCrew = 70
    val provision = 50

    println("Укажите, есть ли повреждения корпуса корабля: да/нет?")

    val inputDamage = readln()
    val damage = inputDamage == "да"

    println("Укажите текущую численность экипажа:")

    val inputSizeOfCrew = readln()

    println("Укажите количество ящиков проовизии:")

    val inputProvision = readln()

    println("Укажите, благоприятны ли метеоусловия: да/нет?")

    val inputWeatherConditions = readln()
    val weatherConditions = inputWeatherConditions == "да"

    println(if ((!damage && (inputSizeOfCrew.toInt() in minSizeOfCrew until recommendedSizeOfCrew)
        && inputProvision.toInt() > provision && (weatherConditions || !weatherConditions)) || (damage
                && inputSizeOfCrew.toInt() == recommendedSizeOfCrew && inputProvision.toInt() > provision
                && weatherConditions)) "Все условия соблюдены, корабль может отправляться в рейс." else
                    "Условия отправки в рейс не соблюдены. Корабль отплыть не может.")


}