package kotlinsprint.lesson_11.task_1

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
) {
    fun printUserData() {
        println("id: $id,\nlogin: $login,\npassword: $password,\nemail: $email")
    }
}

fun main() {

    val user1 = User(
        id = 1,
        login = "морковь",
        password = "qwerty",
        email = "qwerty@mail.ru"
    )

    val user2 = User(
        id = 2,
        login = "свекла",
        password = "ytrewq",
        email = "ytrewq@mail.ru"
    )

    println("Информация о пользователе user1:")
    user1.printUserData()

    println()

    println("Информация о пользователе user2:")
    user2.printUserData()
}