package kotlinsprint.lesson_14.task_4

open class CelestialBody(
    val name: String,
    val isAtmospheric: Boolean,
    val isInhabitable: Boolean,
    val isWatery: Boolean,
    val isFitForLanding: Boolean,
)

class Planet(
    name: String,
    isAtmospheric: Boolean,
    isInhabitable: Boolean,
    isWatery: Boolean,
    isFitForLanding: Boolean,
    val isHasSatellite: Boolean,
) : CelestialBody(name, isAtmospheric, isInhabitable, isWatery, isFitForLanding) {

    fun printPlanetName() {
        println("Название планеты: $name.")
    }

}

class Satellite(
    name: String,
    isAtmospheric: Boolean,
    isInhabitable: Boolean,
    isWatery: Boolean,
    isFitForLanding: Boolean,
) : CelestialBody(name, isAtmospheric, isInhabitable, isWatery, isFitForLanding) {

    fun printSatelliteName() {
        println("Название спутникa: $name.")
    }

}

fun main() {

    val planet1 = Planet(
        "Селестия",
        true,
        true,
        true,
        true,
        true,
    )

    val satellite1 = Satellite(
        "Пинки пай",
        false,
        false,
        false,
        true,
    )

    val satellite2 = Satellite(
        "Спайк",
        true,
        false,
        true,
        false,
    )

    planet1.printPlanetName()
    satellite1.printSatelliteName()
    satellite2.printSatelliteName()

}