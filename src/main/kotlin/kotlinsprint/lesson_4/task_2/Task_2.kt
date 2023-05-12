package kotlinsprint.lesson_4.task_2

fun main() {
    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Average для груза весом $cargoWeight1 кг и объемом $cargoVolume1: ${(cargoWeight1 >= WEIGHT_LOW_LIMIT &&
            cargoWeight1 <= WEIGHT_HIGH_LIMIT) && (cargoVolume1 < VOLUME_HIGH_LIMIT)}\nAverage для груза весом " +
            "$cargoWeight2 кг и объемом $cargoVolume2: ${(cargoWeight2 >= WEIGHT_LOW_LIMIT &&
                    cargoWeight2 <= WEIGHT_HIGH_LIMIT) && (cargoVolume2 < VOLUME_HIGH_LIMIT)}")
}

const val WEIGHT_LOW_LIMIT = 35
const val WEIGHT_HIGH_LIMIT = 100
const val VOLUME_HIGH_LIMIT = 120