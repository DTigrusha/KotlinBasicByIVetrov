package kotlinsprint.lesson_15.task_4

interface PartSearch {

    fun search() {
        print("Выполняется поиск следующих комплектующих: ")
    }

}

abstract class Goods {

    abstract val name: String
    abstract val numberOfGoods: Int

}

class MusicalInstrument(
    override val name: String,
    override val numberOfGoods: Int,
) : Goods(), PartSearch {

    fun printInstrumentInfo() {
        println("Музыкальный инструмент: $name, количество единиц на складе: $numberOfGoods.")
    }
}

class Parts(
    override val name: String,
    override val numberOfGoods: Int,
) : Goods()

fun main() {

    val guitar = MusicalInstrument("гитара", 45)
    val strings = Parts("струны", 32)

    guitar.printInstrumentInfo()
    guitar.search()

    println(strings.name)

}