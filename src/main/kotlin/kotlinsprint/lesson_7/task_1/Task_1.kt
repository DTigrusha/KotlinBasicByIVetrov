package kotlinsprint.lesson_7.task_1

fun main() {
    val numberRange = 0..9
    val charRange = 'a'..'z'
    val firstSymbol = charRange.random()
    val secondSymbol = numberRange.random()
    val thirdSymbol = charRange.random()
    val forthSymbol = numberRange.random()
    val fifthSymbol = charRange.random()
    val sixthSymbol = numberRange.random()
    val password = "$firstSymbol$secondSymbol$thirdSymbol$forthSymbol$fifthSymbol$sixthSymbol"

    println(password)
}