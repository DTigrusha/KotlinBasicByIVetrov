package kotlinsprint.lesson_10.task_2

fun main() {
    println(
        "Для регистрации в приложении Вам необходимо придумать логин и пароль. И логин, и пароль должны содержать в " +
                "себе минимум 4 символа.\nУкажите логин:"
    )
    val registeredLogin = readln()

    println("Укажите пароль:")
    val registeredPassword = readln()

    val result = checkPasswordLength(registeredPassword)

    println (if (result) "Добро пожаловать в приложение!" else "Логин или пароль недостаточно длинные.")
}

fun checkPasswordLength(registeredPassword: String): Boolean {
    val checkNumber = 4
    return registeredPassword.length >= checkNumber
}