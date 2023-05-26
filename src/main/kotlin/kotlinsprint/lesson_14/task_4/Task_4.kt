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
    val satellites: MutableList<Satellite>,
) : CelestialBody(name, isAtmospheric, isInhabitable, isWatery, isFitForLanding) {

    fun printPlanetAndSatellitesName() {
        println("Название планеты: $name.\nНазвания ее спутников: ")
        satellites.forEach {
            println(it.name)
        }
    }
}

class Satellite(
    name: String,
    isAtmospheric: Boolean,
    isInhabitable: Boolean,
    isWatery: Boolean,
    isFitForLanding: Boolean,
) : CelestialBody(name, isAtmospheric, isInhabitable, isWatery, isFitForLanding)

fun main() {

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

    val planet1 = Planet(
        "Селестия",
        true,
        true,
        true,
        true,
        mutableListOf(satellite1, satellite2),
    )

    planet1.printPlanetAndSatellitesName()

}