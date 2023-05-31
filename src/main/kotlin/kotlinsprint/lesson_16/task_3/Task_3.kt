package kotlinsprint.lesson_16.task_3

private class User(
    val login: String,
    private val password: String,
) {

    fun checkPassword() {
        println("Пользователь $login, введите Ваш пароль:")
        val inputPassword = readln()

        if (inputPassword == password) {
            println("Вы ввели правильный пароль. Доступ разрешен.")
        }
    }
}

fun main() {

    val user1 = User(
        "qwerty",
        "qwerty",
    )

    user1.checkPassword()

}