class Student(
    private val firstName: String,
    private val lastName: String,
    private val birth: String,
    private val gender: Char = 'M'
): Human(firstName, lastName, gender) {
    override fun greet(): String {
        return "${super.greet()} ${this.gender()} ${this.wasBorn()}"
    }

    private fun wasBorn(): String {
        val born = if (this.isMale()) "né" else "née"
        return "Je suis $born le $birth."
    }

    fun toFixed(num: Float): String {
        return "%.2f".format(num)
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
}