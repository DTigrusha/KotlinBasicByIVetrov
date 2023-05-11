package kotlinsprint.lesson_4.task_2

fun main() {
    val weightLowLimit = 35
    val weightHighLimit = 100
    val volumeHighLimit = 120
    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Average для груза весом $cargoWeight1 кг и объемом $cargoVolume1: ${(cargoWeight1 >= weightLowLimit &&
            cargoWeight1 <= weightHighLimit) && (cargoVolume1 < volumeHighLimit)}\nAverage для груза весом $cargoWeight2 " +
            "кг и объемом $cargoVolume2: ${(cargoWeight2 >= weightLowLimit && cargoWeight2 <= weightHighLimit)
                    && (cargoVolume2 < volumeHighLimit)}")



}