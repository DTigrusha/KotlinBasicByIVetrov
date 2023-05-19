package kotlinsprint.lesson_11.task_3

class Member(
    val avatar: String,
    val nickname: String = "",
    val state: String,
) {
    fun viewMemberNickname() {
        println("\nникнейм- $nickname")
    }

    fun printMemberInfo() {
        print("аватар - $avatar\nстатус - $state")
        viewMemberNickname()
    }
}