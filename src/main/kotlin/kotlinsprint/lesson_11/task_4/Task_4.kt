package kotlinsprint.lesson_11.task_4

class Contact(
    val photo: String,
    val firstName: String,
    val secondName: String,
    val mobileNumber: String,
    val homeNumber: String,
    val iCloud: String,
    val contacts: List<ClosePeople>,
) {

    fun writeSMS() {
        print("[написать]")
    }

    fun makeCall() {
        print("[вызов]")
    }

    fun makeVideoCall() {
        print("[видео]")
    }

    fun sendEmail() {
        print("[почта]")
    }

    fun faceTimeVideoCall() {
        print("[видео]")
    }

    fun faceTimeCall() {
        print("[вызов]")
    }

    fun printContactInfo() {
        println("$photo\n$firstName $secondName")
        println()
        writeSMS()
        makeCall()
        makeVideoCall()
        sendEmail()
        println("\n")
        println("сотовый\n$mobileNumber\nдомашний\n$homeNumber")
        println()
        print("FaceTime          ")
        faceTimeVideoCall()
        faceTimeCall()
        println("\n")
        println("iCloud\n$iCloud")
        println()

        contacts.forEach {
            it.printClosePeopleInfo()
        }
    }
}

class ClosePeople(
    val relations: String,
    val userName: String,
) {
    fun printClosePeopleInfo() {
        println("$relations\n$userName")
    }
}

fun main() {

    val closePeople1 = ClosePeople(
        relations = "жена",
        userName = "Светлана",
    )

    val closePeople2 = ClosePeople(
        relations = "подруга",
        userName = "Елена",
    )

    val closePeople3 = ClosePeople(
        relations = "подруга",
        userName = "Елизавета",
    )

    val contact1 = Contact(
        photo = "Фотография контакта",
        firstName = "Евгений",
        secondName = "Иванов",
        mobileNumber = "8 (999) 999-42-42",
        homeNumber = "8 (999) 888-42-42",
        iCloud = "mail@mail.ru",
        contacts = listOf(closePeople1, closePeople2, closePeople3),
    )

    contact1.printContactInfo()
}