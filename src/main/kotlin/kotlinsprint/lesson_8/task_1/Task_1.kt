package kotlinsprint.lesson_8.task_1

fun main() {
    val mondayViews = 7
    val tuesdayViews = 17
    val wednesdayViews = 23
    val thursdayViews = 43
    val fridayViews = 12
    val saturdayViews = 4
    val sundayViews = 2
    var sumOfViews = 0
    val weekViews =
        arrayOf(mondayViews, tuesdayViews, wednesdayViews, thursdayViews, fridayViews, saturdayViews, sundayViews)

    for (i in weekViews.indices) {
        sumOfViews += weekViews[i]
    }

    println(sumOfViews)
}