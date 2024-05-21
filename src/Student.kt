open class Human(
    private val firstName: String,
    private val lastName: String,
    private val gender: Char
) {
    open fun greet(): String {
        return "Bonjour, je m'appelle $firstName $lastName."
    }

    fun isMale(): Boolean {
        return gender == 'M'
    }

    fun gender(): String {
        val gender = if (this.isMale()) "un homme" else "une femme"
        return "Je suis $gender."
    }
}

class Student(
    private val firstName: String,
    private val lastName: String,
    private val gender: Char = 'M',
    private val birth: String
): Human(firstName, lastName, gender) {
    override fun greet(): String {
        return "${super.greet()} ${this.gender()} ${this.born()}"
    }

    private fun born(): String {
        return "Je suis né${if (this.isMale()) "" else "e"} le $birth."
    }
}