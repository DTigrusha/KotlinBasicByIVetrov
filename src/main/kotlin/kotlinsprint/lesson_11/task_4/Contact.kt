package kotlinsprint.lesson_11.task_4

class Contact(
    val photo: String,
    val firstName: String,
    val secondName: String,
    val write: String = "написать",
    val call: String = "вызов",
    val video: String = "видео",
    val email: String = "почта",
    val mobileNumber: String,
    val homeNumber: String,
    val faceTime: Array<String> = arrayOf("видео", "вызов"),
    val iCloud: String,
    val contacts: List<ClosePeople>,
) {
    fun printContactInfo() {
        println("$photo\n$firstName $secondName")
        println()
        println("[$write]   [$call]   [$video]   [$email]")
        println()
        println("сотовый\n$mobileNumber\nдомашний\n$homeNumber")
        println()
        println("FaceTime               [${faceTime[0]}]   [${faceTime[1]}]")
        println()
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