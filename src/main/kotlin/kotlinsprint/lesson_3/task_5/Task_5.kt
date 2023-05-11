package kotlinsprint.lesson_3.task_5

fun main() {
    val moveData = "D2-D4;0"
    val moveParts = moveData.split("-", ";")
    val moveFrom = moveParts[0]
    val moveTo = moveParts[1]
    val moveNumber = moveParts[2]

    println(moveFrom)
    println(moveTo)
    println(moveNumber)
}