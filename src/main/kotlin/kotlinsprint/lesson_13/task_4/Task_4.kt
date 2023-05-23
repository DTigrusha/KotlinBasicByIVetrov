package kotlinsprint.lesson_13.task_4

class NewContact(val name: String?, val mobileNumber: Long?, val company: String?) {

    fun printContact() {
        println("Имя: ${name ?: "null"}\nНомер: $mobileNumber\nКомпания: ${company ?: "null"}\n")
    }

}

fun addNewContact(): MutableList<NewContact> {
    val listOfContacts = mutableListOf<NewContact>()

    do {
        println("Для добавление нового контакта в телефонную книгу введите имя контакта:")
        val inputName: String = readln()

        println("Введите номер мобильного телефона контакта:")
        val inputMobileNumber = readln().toLongOrNull()

        println("Укажите место работы контакта:")
        val inputCompany: String = readln()

        val newContact = NewContact(inputName, inputMobileNumber, inputCompany)

        println("Если хотите добавить новую запись, введите: \"да\":")
        val answer = readln().lowercase()

        if ((inputMobileNumber != null && inputName != "" && inputCompany != "") ||
            (inputMobileNumber != null && inputName != "" && inputCompany == "") ||
            (inputMobileNumber != null && inputName == "" && inputCompany != "")
        ) {
            listOfContacts.add(newContact)
        }
    } while (answer == "да")

    return listOfContacts
}

fun main() {

    val listOfContacts = addNewContact()

    listOfContacts.forEach {
        it.printContact()
    }
}