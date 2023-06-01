package kotlinsprint.lesson_17.task_5

class User(
    login: String,
    password: String,
) {

    var login: String = login
        set(value) {
            field = value
            println("Ваш логин изменен!")
        }

    var password: String = password
        get() {
            var hiddenPassword = ""
            for (i in field) {
                hiddenPassword += "*"
            }
            return hiddenPassword
        }
        set(value) {
            println("Вы не можете изменить пароль.")
        }

}

fun main() {
    val user = User(
        login = "qwerty",
        password = "qwerty",
    )

    user.login = "dfgshajd"
    user.password = "asdfgh"

    println(user.password)

}