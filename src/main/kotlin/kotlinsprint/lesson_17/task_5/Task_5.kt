package kotlinsprint.lesson_17.task_5

class User {

    var login: String = "qwerty"
        set(value) {
            field = value
            println("Ваш логин изменен!")
        }

    var password: String = ""
        get() {
            field = "qwerty"
            for (i in field) {
                print("*")
            }
            println()

            return field
        }
        set(value) {
            if (value != field) {
                println("Вы не можете изменить пароль.")
            }
        }

}

fun main() {
    val user = User()

    user.login = "dfgshajd"

    user.password = "asdfgh"

}