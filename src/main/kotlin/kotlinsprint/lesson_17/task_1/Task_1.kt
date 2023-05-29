package kotlinsprint.lesson_17.task_1

class Quiz {

    var question: String = ""
        set(value) {
            field = value
        }

    var answer: String = ""
        set(value) {
            field = value
        }
        get() = field

}

fun main() {

}