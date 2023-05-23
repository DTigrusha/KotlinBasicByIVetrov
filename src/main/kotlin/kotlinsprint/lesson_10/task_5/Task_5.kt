package kotlinsprint.lesson_10.task_5

data class UserData(val userLogin: String, val generatedPassword: String)

fun main() {
    val (userLogin, generatedPassword) = registration()
    authoriseUser(UserData(userLogin, generatedPassword))
}

fun registration(): UserData {
    println(
        "Здравствуйте! Для регистрации в приложении Вам необходимо придумать логин, длинною более 4 символов." +
                "\nВведите Ваш логин:"
    )
    val userLogin = readln()

    val generatedPassword = createPassword()

    println(generatedPassword)

    return UserData(userLogin, generatedPassword)
}

fun createPassword(): String {
    val lengthOfPassword = 10
    var generatedPassword = ""

    for (i in 1..lengthOfPassword) {
        val range = ('!'..'9').random()
        generatedPassword += range
    }
    return generatedPassword
}

fun authoriseUser(userData: UserData): Array<String> {
    println("Для авторизации в приложении введите Ваш логин:")
    val userInputLogin = readln()

    println("Теперь введите Ваш пароль:")
    val userInputPassword = readln()

    val (userLogin, generatedPassword) = userData
    val checkingUserData = arrayOf(userLogin, userInputLogin, generatedPassword, userInputPassword)

    checkUserAuthorisation(checkingUserData)

    return checkingUserData
}

fun checkUserAuthorisation(checkingUserData: Array<String>) {
    if ((checkingUserData[0] == checkingUserData[1]) && (checkingUserData[2] == checkingUserData[3])) {
        do {
            val authorizationCode = (1000..9999).random()

            println("Ваш код авторизации: $authorizationCode.\nВведите код ниже:")
            val userInput = readln().toInt()
        } while (userInput != authorizationCode)

        println("Вы успешно авторизованы!\nДобро пожаловать в приложение!")
    } else {
        println("Вы ввели неверные данные!")

        val userLogin = checkingUserData[0]
        val generatedPassword = checkingUserData[2]

        authoriseUser(UserData(userLogin, generatedPassword))
    }
}