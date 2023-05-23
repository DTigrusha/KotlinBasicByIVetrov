package kotlinsprint.lesson_13.task_3

class ContactInfo(val name: String, val mobileNumber: Long?, val company: String?) {

    fun printContact() {
        println("Имя: $name\nНомер: ${mobileNumber ?: "[не указано]"}\nКомпания: ${company ?: "[не указано]"}\n")
    }

}

fun main() {

    val contactInfo1 = ContactInfo("Ростислав", 89123456789, null)
    val contactInfo2 = ContactInfo("Ярослав", 89154056690, "Yandex")
    val contactInfo3 = ContactInfo("Святослав", null, "Yandex")
    val contactInfo4 = ContactInfo("Вячеслав", 89034445242, null)

    val listOfContacts = mutableListOf<ContactInfo>()
    listOfContacts.add(contactInfo1)
    listOfContacts.add(contactInfo2)
    listOfContacts.add(contactInfo3)
    listOfContacts.add(contactInfo4)

    listOfContacts.forEach {
        it.printContact()
    }

}