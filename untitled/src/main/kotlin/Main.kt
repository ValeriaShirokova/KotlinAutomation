fun createPerson(
    name: String,
    surname: String,
    patronymic: String? = null,
    gender: String,
    age: Int,
    dateOfBirth: String,
    inn: String? = null,
    snils: String? = null
) {
    val argsMap = mapOf(
        "name" to name,
        "surname" to surname,
        "patronymic" to patronymic,
        "gender" to gender,
        "age" to age,
        "dateOfBirth" to dateOfBirth,
        "inn" to inn,
        "snils" to snils
    ).filter { it.value != null }
    var finalString = ""
    argsMap.entries.forEach { (key, value) ->
        finalString += "$key = $value, "
    }
    println(finalString.substringBeforeLast(","))
}

fun main() {
    createPerson(name = "Van", surname = "Darkholml", gender = "Male", age = 43, dateOfBirth = "1980-01-04")
    createPerson("Igor", "Nikolaev", "Vladimirovich", "FiveReasonMan", 63, "1960-01-30", "1234567890", "111-111-111")
    createPerson(age = 43, surname = "Darkholml", name = "Van", gender = "Male", dateOfBirth = "1980-01-04")
}