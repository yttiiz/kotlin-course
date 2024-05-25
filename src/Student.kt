import java.time.LocalDate
import java.time.Period

data class Student(
    private val firstName: String,
    private val lastName: String,
    private val birth: String,
    private val gender: Char = 'M'
): Human(firstName, lastName, gender) {
    override fun greet(): String {
        return "${super.greet()} ${this.gender()}. ${this.wasBorn()} et j'ai ${this.getAge()} ans."
    }

    private lateinit var cbCard: Map<String, String>

    private fun wasBorn(): String {
        val born = if (this.isMale()) "né" else "née"
        return "Je suis $born le $birth"
    }

    private fun toFixed(num: Float): String {
        return "%.2f".format(num)
    }

    private fun getAge(): Int {
        return Period.between(
            LocalDate.parse(birth),
            LocalDate.now()
        ).years
    }

    fun getAverage(notes: Array<UByte>): String {
        var sentence = "Pour un ensemble de notes de "
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
        sentence += "la moyenne de ${this.getFullName()} est de ${this.toFixed(global)}."

        return sentence
    }

    fun setCbCard(number: String, date: String, crypto: String) {
        cbCard = mapOf("number" to number, "date" to date, "crypto" to crypto)
    }

    fun getCbCard(): String {
        return "NUMBER : ${cbCard.get("number")}\nUNTIL : ${cbCard.get("date")}\nCRYPTOGRAM : ${cbCard.get("crypto")}"
    }
}