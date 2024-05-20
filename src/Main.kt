fun main() {
    println("Hello ${greeting("Christian", "Plaisance")} !")
}

fun greeting(firstName: String, lastName: String): String {
    return "$firstName $lastName"
}