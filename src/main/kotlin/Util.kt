fun readInput(name: String): List<String> {
    return {}.javaClass.getResource(name)!!.readText().lines()
}
