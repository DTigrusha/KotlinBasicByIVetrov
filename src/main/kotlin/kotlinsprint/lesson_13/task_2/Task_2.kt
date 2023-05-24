package kotlinsprint.lesson_13.task_2

class Contact(val name: String, val mobileNumber: Long, val company: String?) {

    fun printContact() {
        println("Имя: $name\nНомер: $mobileNumber\nКомпания: ${company ?: "[не указано]"}")
    }

}

fun main() {

    val contact1 = Contact("Ростислав", 89123456789, null)

    contact1.printContact()

}