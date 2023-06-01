package kotlinsprint.lesson_19.task_5

import java.util.*

enum class Sex(val type: String) {
    MALE("м"),
    FEMALE("ж"),
}

fun getSexDescription(type: String): String {
    return when (type) {
        Sex.MALE.type -> "мужской"
        Sex.FEMALE.type -> "женский"
        else -> {""}
    }
}

class Person(
    val name: String,
    val sex: String,
) {

    fun printPersonData() = "Имя: $name, пол: ${sex}."

}

fun main() {
    val numberOfPersons = 5
    val listOfPersons = mutableListOf<Person>()
    var number = 1

    println(
        "Добро пожаловать в приложение \"Картотека\"!\nВам необходимо ввести данные $numberOfPersons человек: " +
                "\"имя\" указывается полностью, \"пол\" в формате: \"м\" или \"ж\".\n"
    )

    for (i in 0 until numberOfPersons) {
        println("Введите имя человека:")
        val inputName = readln().lowercase(Locale.getDefault()).replaceFirstChar {
            if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString()
        }

        println("Введите его пол:")
        val inputSex = readln().lowercase(Locale.getDefault())

        val person = Person(
            name = inputName,
            sex = getSexDescription(inputSex),
        )
        listOfPersons.add(person)
    }

    listOfPersons.forEach {
        println("${number++}. ${it.printPersonData()}")
    }

}