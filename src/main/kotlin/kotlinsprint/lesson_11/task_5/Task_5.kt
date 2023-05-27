package kotlinsprint.lesson_11.task_5

data class Message(val id: Int, val message: String)

class User(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "",
)

class Forum {
    var lastUserId = 0

    fun newUser(login: String, password: String, email: String, bio: String = ""): User {
        return User(id = ++lastUserId, login, password, email, bio)
    }

    fun newMessage(id: Int, message: String): Message {
        return Message(id, message)
    }

    fun printThread(login: String, message: String) {
        println("$login: $message")
    }

}

fun main() {
    val newForum = Forum()
    val newUser1 = newForum.newUser("морковь", "qwerty", "qwerty@mail.ru")
    val newUser2 = newForum.newUser("свекла", "ytrewq", "ytrewq@mail.ru")

    val firstMessageOfNewUser1 = newForum.newMessage(newUser1.id, "Привет! Я новичок на форуме.")
    val firstMessageOfNewUser2 = newForum.newMessage(newUser2.id, "Добрый день! Добро пожаловать на форум!")
    val secondMessageOfNewUser1 =
        newForum.newMessage(newUser1.id, "Подскажите, где я могу ознакомится с правилами форума.")
    val secondMessageOfNewUser2 = newForum.newMessage(newUser2.id, "Перейдите по ссылке www.forum/rules!")

    newForum.printThread(newUser1.login, firstMessageOfNewUser1.message)
    newForum.printThread(newUser2.login, firstMessageOfNewUser2.message)
    newForum.printThread(newUser1.login, secondMessageOfNewUser1.message)
    newForum.printThread(newUser2.login, secondMessageOfNewUser2.message)

}