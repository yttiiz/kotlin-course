open class Human(
    private val firstName: String,
    private val lastName: String,
    private val gender: Char
) {
    fun getFullName(): String {
        return "$firstName $lastName"
    }
    open fun greet(): String {
        return "Bonjour, je m'appelle ${this.getFullName()}."
    }

    fun isMale(): Boolean {
        return gender == 'M'
    }

    fun gender(): String {
        val gender = if (this.isMale()) "un homme" else "une femme"
        return "Je suis $gender"
    }
}