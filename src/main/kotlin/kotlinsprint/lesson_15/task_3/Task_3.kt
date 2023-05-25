package kotlinsprint.lesson_15.task_3

abstract class ForumMembers {

    abstract val userType: String

    fun readMessage() {
        println("- читать форум")
    }

    fun writeMessage() {
        println("- писать сообщения")
    }

}

class User (override val userType: String = "Пользователь форума"): ForumMembers()

class Administrator(
    override val userType: String = "Администратор форума",
) : ForumMembers() {

    fun deleteMessage() {
        println("- удалять сообщения")
    }

    fun deleteUser() {
        println("- удалять пользователей")
    }

}

fun main() {

    val user = User()
    val administrator = Administrator()

    println("${user.userType} может осуществлять следующие действия на форуме:")
    user.readMessage()
    user.writeMessage()

    println()

    println("${administrator.userType} может осуществлять следующие действия на форуме:")
    administrator.readMessage()
    administrator.writeMessage()
    administrator.deleteMessage()
    administrator.deleteUser()
}