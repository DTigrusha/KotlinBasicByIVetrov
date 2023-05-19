package kotlinsprint.lesson_10.task_5

fun main() {
    val (userLogin, generatedPassword) = registration()
    authoriseUser(UserData(userLogin, generatedPassword))
}

data class UserData(val userLogin: String, val generatedPassword: String)

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
        val even = (0..9).random()
        val odd = listOf('!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ' ').random()
        if (i % 2 != 0) {
            generatedPassword += odd
        } else {
            generatedPassword += even
        }
    }
    return generatedPassword
}

fun authoriseUser(UserData: UserData): Array<String> {
    println("Для авторизации в приложении введите Ваш логин:")
    val userInputLogin = readln()

    println("Теперь введите Ваш пароль:")
    val userInputPassword = readln()

    val (userLogin, generatedPassword) = UserData
    val checkingUserData = arrayOf(userLogin, userInputLogin, generatedPassword, userInputPassword)

    checkUserAuthorisation(checkingUserData)

    return checkingUserData
}

fun checkUserAuthorisation(checkingUserData: Array<String>) {
    if ((checkingUserData[0] == checkingUserData[1]) && (checkingUserData[2] == checkingUserData[3])) {
        generateAuthorisationCode()
    } else {
        println("Вы ввели неверные данные!")

        val userLogin = checkingUserData[0]
        val generatedPassword = checkingUserData[2]

        authoriseUser(UserData(userLogin, generatedPassword))
    }
}

fun generateAuthorisationCode(){
    do {
        val authorizationCode = (1000..9999).random()

        println("Ваш код авторизации: $authorizationCode.\nВведите код ниже:")

        val userInput = readln().toInt()
    } while (userInput != authorizationCode)

    println("Вы успешно авторизованы!\nДобро пожаловать в приложение!")
}