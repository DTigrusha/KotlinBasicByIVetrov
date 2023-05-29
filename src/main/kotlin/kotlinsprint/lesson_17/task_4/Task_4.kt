package kotlinsprint.lesson_17.task_4


class Package(
    private val number: Int,
    var numberOfMoves: Int,
) {

    var location = "склад"
        set(value) {
            field = value

            if (value == field) {
                numberOfMoves++
            }
        }

}

fun main() {

    val pack = Package(1, 0)

    pack.location = "сортировочный центр"
    pack.location = "сортировочный центр - 2"
    pack.location = "сортировочный центр - 3"

    println("${pack.numberOfMoves}")

}