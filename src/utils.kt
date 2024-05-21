open class Vehicle(
    private val name: String,
    private val type: String,
    private val color: String
) {
    private fun getName(): String {
        return "${this.name} ${this.type}"
    }

    fun move(): String {
        return "${this.getName()} (${this.color}) is moving."
    }

    fun stop(): String {
        return "${this.getName()} (${this.color}) is stopping."
    }
}

class Car(
    name: String,
    type: String,
    color: String
): Vehicle(name, type, color) {
    fun displayInfo() {
        val x = Math.random()
        println(if (x > 0.5) this.stop() else this.move())
    }
}