package kotlinsprint.lesson_11.task_3

class Room(
    val cover: String,
    val name: String,
    val members: List<Member>,
) {
    fun printRoomInfo() {
        var numberOfMember = 1

        println("обложка - $cover\nназвание - $name\n\nУчастники комнаты:")

        members.forEach {
            println("участник № ${numberOfMember++}")
            it.printMemberInfo()
            println()
        }
    }
}



