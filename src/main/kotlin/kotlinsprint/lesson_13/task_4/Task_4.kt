package kotlinsprint.lesson_13.task_4

class NewContact(val name: String?, val mobileNumber: Long?, val company: String?) {

    fun printContact() {
        println("Имя: $name\nНомер: $mobileNumber\nКомпания: $company\n")
    }

}

fun addNewContact(): MutableList<NewContact> {
    val listOfContacts = mutableListOf<NewContact>()

    do {
        println("Для добавление нового контакта в телефонную книгу введите имя контакта:")
        var inputName: String? = readln()
        if (inputName!!.isEmpty()) {
            inputName = null
        }

        println("Введите номер мобильного телефона контакта:")
        val inputMobileNumber = readln().toLongOrNull()

        println("Укажите место работы контакта:")
        var inputCompany: String? = readln()
        if (inputCompany!!.isEmpty()) {
            inputCompany = null
        }

        val newContact = NewContact(inputName, inputMobileNumber, inputCompany)

        println("Если хотите добавить новую запись, введите: \"да\":")
        val answer = readln().lowercase()

        if ((inputMobileNumber != null && inputName != null && inputCompany != null) ||
            (inputMobileNumber != null && inputName != null && inputCompany == null) ||
            (inputMobileNumber != null && inputName == null && inputCompany != null)
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