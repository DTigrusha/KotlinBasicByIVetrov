package kotlinsprint.lesson_11.task_2

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
) {
    fun printUserData() {
        println("Информаиция о пользователе:\nid: $id,\nlogin: $login,\npassword: $password,\nemail: $email\nbio: $bio")
    }

    fun fillBio() {
        println("Дополните информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        println("Введите Ваш пароль:")
        val userPassword = readln()

        if (userPassword == password) {
            println("Введите новый пароль:")
            password = readln()

            println("Ваш пароль изменен!")
        } else {
            changePassword()
        }
    }

    fun sendMessage() {
        println("Введите сообщение для $login:")
        println("Уважаемый $login! Отправляю на Вашу почту $email сообщение:\n${readln()}")
    }
}