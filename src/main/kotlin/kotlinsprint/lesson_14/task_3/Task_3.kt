package kotlinsprint.lesson_14.task_3

open class ForumMessage(
    val author: String,
    val text: String,
) {

    fun printForumMessage() {
        println("$author: $text")
    }

}

class Comments(
    author: String,
    text: String,
    val commentAuthor: String,
    val commentText: String
) : ForumMessage(author, text) {

    fun printComments() {
        println("Комментарий к сообщению:\n[$author: $text]\nТекст комментария:\n[$commentAuthor: $commentText.]")
    }

}

fun main() {

    val forumMessage1 = ForumMessage(
        "Геннадий",
        "Сегодня чудесная погода!",
    )

    val comments1 = Comments(
        forumMessage1.author,
        forumMessage1.text,
        "Александр",
        "Спорное утверждение. Прогноз погоды обещает дождь в ближайшие два часа",
    )

    forumMessage1.printForumMessage()

    println()

    comments1.printComments()

}