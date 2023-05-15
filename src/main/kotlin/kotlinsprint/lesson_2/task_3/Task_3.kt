package kotlinsprint.lesson_2.task_3

fun main() {
    val hourOfDeparture = 9
    val minuteOfDeparture = 39
    val totalMinuteOfDeparture = hourOfDeparture * 60 + minuteOfDeparture
    val minuteOfTravelTime = 457
    val totalMinuteOfArrival = totalMinuteOfDeparture + minuteOfTravelTime
    val hourOfArrival = totalMinuteOfArrival / 60
    val minuteOfArrival = totalMinuteOfArrival % 60

    println("$hourOfArrival:$minuteOfArrival")
}