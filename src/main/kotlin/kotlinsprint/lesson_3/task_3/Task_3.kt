package kotlinsprint.lesson_3.task_3

fun main() {
    val number = 7
    var multiplier = 1

    println("""
        $number x $multiplier = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
        $number x ${++multiplier} = ${number * multiplier}
    """.trimIndent())

}