package kotlinsptint.lesson_2.task_3

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val travelTime = 457
    var hourOfArrival = (travelTime / 60) + hourOfDeparture
    var minuteOfArrival = (travelTime % 60) + minuteOfDeparture
    if (minuteOfArrival >= 60) {
        hourOfArrival += minuteOfArrival / 60
        minuteOfArrival %= 60
    }

    println("$hourOfArrival:$minuteOfArrival")
}