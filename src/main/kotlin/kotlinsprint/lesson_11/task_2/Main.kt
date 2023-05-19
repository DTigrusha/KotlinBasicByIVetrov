package kotlinsprint.lesson_11.task_2

fun main() {

    val user1 = User(
        id = 1,
        login = "морковь",
        password = "qwerty",
        email = "qwerty@mail.ru"
    )

    user1.fillBio()
    user1.changePassword()
    user1.printUserData()
    user1.sendMessage()
}