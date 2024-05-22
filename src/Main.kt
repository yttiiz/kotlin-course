fun main() {
    val jeanCharles = Student("John", "Doe", "1990-5-15")
    println(jeanCharles.greet())
    println(jeanCharles.getAverage(arrayOf(12u, 16u, 8u, 11u, 2u, 15u)))
}

fun getAge() {
    println("Quel est votre age ?")
    val age = readlnOrNull()

    if (age != null) {
        val agePlus2years = age.toByte() + 2
        println("Vous avez $age ans et dans 2 ans vous aurez $agePlus2years ans")
    }
}