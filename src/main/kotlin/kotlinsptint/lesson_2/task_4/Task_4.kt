package kotlinsptint.lesson_2.task_4

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 20
    val bonusCrystalOre = (crystalOre * buff) / 100
    val bonusIronOre = (ironOre * buff) / 100

    println("Дополнительное количество кристаллической руды: $bonusCrystalOre.\nДополнительное количество железной руды: $bonusIronOre.")

}