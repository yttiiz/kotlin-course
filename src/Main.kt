fun main() {
    val johnDoe = Student("John", "Doe", "1980-05-25")
    johnDoe.setCbCard("7895 2581 1458 1250", "09/25", "898")
    println(johnDoe.greet())
    println(johnDoe.getAverage(arrayOf(12u, 16u, 8u, 11u, 2u, 15u)))
    println(johnDoe.getCbCard())

    println(bestFrenchClubsList(
        "Olympique de Marseille",
        "Paris Saint-Germain",
        "Olympique Lyonnais",
        "AJ Auxerre"
    ))

    greet("Dominique")
}

fun getAge() {
    println("Quel est votre age ?")
    val age = readlnOrNull()

    if (age != null) {
        val agePlus2years = age.toByte() + 2
        println("Vous avez $age ans et dans 2 ans vous aurez $agePlus2years ans")
    }
}