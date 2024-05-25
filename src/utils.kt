fun <T> bestFrenchClubsList(vararg ts: T): ArrayList<T> {
    val list = ArrayList<T>()

    for (t in ts) list.add(t)

    return list
}

typealias GreetFunctionType = (String) -> Unit
val greet: GreetFunctionType = { println("Hello $it") }
