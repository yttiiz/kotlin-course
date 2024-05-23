fun main() {
    val johnDoe = Student("John", "Doe", "1980-05-25")
    println(johnDoe.greet())
    println(johnDoe.getAverage(arrayOf(12u, 16u, 8u, 11u, 2u, 15u)))
    println(johnDoe.getAge())
}

fun getAge() {
    println("Quel est votre age ?")
    val age = readlnOrNull()

    if (age != null) {
        val agePlus2years = age.toByte() + 2
        println("Vous avez $age ans et dans 2 ans vous aurez $agePlus2years ans")
    }
}