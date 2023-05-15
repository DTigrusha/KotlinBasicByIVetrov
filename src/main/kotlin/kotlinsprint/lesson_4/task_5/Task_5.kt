package kotlinsprint.lesson_4.task_5

fun main() {
    val minSizeOfCrew = 55
    val recommendedSizeOfCrew = 70
    val provision = 50

    println("Укажите, есть ли повреждения корпуса корабля: true/false?")

    val inputDamage = readln().toBoolean()

    println("Укажите текущую численность экипажа:")

    val inputSizeOfCrew = readln().toInt()

    println("Укажите количество ящиков проовизии:")

    val inputProvision = readln().toInt()

    println("Укажите, благоприятны ли метеоусловия: true/false?")

    val inputWeatherConditions = readln().toBoolean()

    println(if ((!inputDamage && (inputSizeOfCrew in minSizeOfCrew until recommendedSizeOfCrew)
        && inputProvision > provision && (inputWeatherConditions || !inputWeatherConditions)) || (inputDamage
                && inputSizeOfCrew == recommendedSizeOfCrew && inputProvision > provision
                && inputWeatherConditions)) "Все условия соблюдены, корабль может отправляться в рейс."
    else "Условия отправки в рейс не соблюдены. Корабль отплыть не может.")


}