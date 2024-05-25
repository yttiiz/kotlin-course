open class Human(
    private val firstName: String,
    private val lastName: String,
    private val gender: Char
) {
    protected fun getFullName(): String {
        return "$firstName $lastName"
    }

    open fun greet(): String {
        return "Bonjour, je m'appelle ${this.getFullName()}."
    }

    protected fun isMale(): Boolean {
        return gender == 'M'
    }

    protected fun gender(): String {
        val gender = if (this.isMale()) "un homme" else "une femme"
        return "Je suis $gender"
    }
}