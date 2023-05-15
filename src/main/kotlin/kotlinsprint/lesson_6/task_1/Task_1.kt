package kotlinsprint.lesson_6.task_1

fun main() {
    println("Здравствуйте!\nДля регистрации в приложении создайте сначала логин:")

    val registeredLogin = readln();

    println("Теперь создайте пароль:")

    val registeredPassword = readln()

    println("Для авторизации в приложении введите Ваш логин:")

    var inputLogin = readln()

    println("Теперь введите Ваш пароль:")

    var inputPassword = readln()

    while (inputPassword != registeredPassword) {
        println("Вы ввели не тот пароль!\nДля авторизации в приложении введите заново Ваш логин:")

        inputLogin = readln()

        println("Теперь введите Ваш пароль:")

        inputPassword = readln()
    }

    println("Авторизация прошла успешно!")
}