package kotlinsprint.lesson_17.task_3

class Directory(var secretly: Boolean) {
    val name: String = "Рабочие документы"
        get() = if (secretly) "Скрытая папка, количество файлов- $numberOfFiles"
        else "$field, количество файлов - $numberOfFiles"
    var numberOfFiles: Int = 27
        get() = if (secretly) 0 else field

}

fun main() {

    val directory = Directory(true)

    println(directory.name)

    directory.secretly = false

    println(directory.name)
}