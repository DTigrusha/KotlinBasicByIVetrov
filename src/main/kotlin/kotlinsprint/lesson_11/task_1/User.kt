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