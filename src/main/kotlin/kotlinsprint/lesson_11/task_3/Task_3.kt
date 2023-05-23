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

fun main() {
    val states: List<String> = listOf("разговаривает", "пользователь заглушен", "микрофон выключен")

    val member1 = Member(
        avatar = "Медведь",
        nickname = "Bear",
        state = states[0],
    )

    val member2 = Member(
        avatar = "Волк",
        nickname = "Wolf",
        state = states[0],
    )

    val member3 = Member(
        avatar = "Кот",
        nickname = "Cat",
        state = states[1],
    )

    val member4 = Member(
        avatar = "Кролик",
        nickname = "Rabbit",
        state = states[2],
    )

    val member5 = Member(
        avatar = "Бегемот",
        nickname = "Hippo",
        state = states[0],
    )

    val member6 = Member(
        avatar = "Лошадь",
        nickname = "Horse",
        state = states[0],
    )

    val member7 = Member(
        avatar = "Собака",
        nickname = "Dog",
        state = states[0],
    )

    val member8 = Member(
        avatar = "Мышь",
        nickname = "Mouse",
        state = states[0],
    )

    val room1 = Room(
        cover = "Красная обложка",
        name = "Блоталка обо всем и ни о чем",
        members = listOf(member1, member2, member3),
    )

    val room2 = Room(
        cover = "Синяя обложка",
        name = "Поговорим и кулинарии",
        members = listOf(member7, member8),
    )

    val room3 = Room(
        cover = "Зеленая обложка",
        name = "Поговорим о природе",
        members = listOf(member4, member5, member6),
    )

    val listOfRooms = listOf(room1, room2, room3)

    printListOfRooms(listOfRooms)
}

fun printListOfRooms(listOfRooms: List<Room>) {
    var id = 1

    println("Список комнат:")

    listOfRooms.forEach {
        println("Комната № ${id++}. ")
        it.printRoomInfo()

        println()
    }
}