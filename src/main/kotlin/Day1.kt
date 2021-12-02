fun main() {
    part1()
    part2()
}

private fun part1() {
    var previous: Int? = null;
    var increased = 0;
    for (line in {}.javaClass.getResource("Day1.input").readText().lines()) {
        if (line == "") {
            continue
        }
        val current = line.toInt()
        if (previous != null && previous < current) {
            increased++
        }
        previous = current
    }
    println("Part 1: $increased")
}

fun part2() {
    TODO("Not yet implemented")
}
