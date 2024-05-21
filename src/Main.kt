fun main() {
    val jeanCharles = Student("Jean-Charles", "Dutay de la Chaletière", 'M', "1990-5-15")
    val isabelle = Student("Isabelle", "Martinez", 'F', "1983-7-25")
    println(jeanCharles.greet())
    println(isabelle.greet())
}

fun getAge() {
    println("Quel est votre age ?")
    val age = readlnOrNull()

    if (age != null) {
        val agePlus2years = age.toByte() + 2
        println("Vous avez $age ans et dans 2 ans vous aurez $agePlus2years ans")
    }
}

fun getAverage(notes: Array<UByte>): String {
    var sentence = "Pour l'ensemble de notes "
    var global = 0f
    for (i in notes.indices) {
        sentence += if (i < notes.size - 2) {
            "${notes[i]}, "
        } else if (i == notes.size - 2) {
            "${notes[i]} "
        } else "et ${notes[i]}, "
        global += notes[i].toFloat()
    }

    global /= notes.size.toFloat()
    sentence += "la moyenne est de $global."

    return sentence
}