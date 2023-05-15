package kotlinsprint.lesson_5.task_4

fun main() {
    val userLogin = "Batman"
    val userPassword = "password"

    println("Для входа в приложение необходима авторизация.\nВведите, пожалуйста, Ваш логин:")

    val inputLogin = readLine()
    var systemAnswer =
        if (inputLogin != userLogin) "Пользователь с таким именем не зарегистрирован в приложении. " +
                "Для входа в приложение пройдите регистрацию."
        else "Введите, пожалуйста, Ваш пароль:"

    println(systemAnswer)

    val inputPassword = readLine()
    systemAnswer =
        if (inputPassword == userPassword) "Добро пожаловать, $userLogin!\nВы успешно авторизованы в приложении."
        else "Ошибка авторизации."

    println(systemAnswer)
}