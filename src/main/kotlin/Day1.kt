fun main() {
    with (Day1(readInput("Day1.input"))) {
        part1()
        part2()
    }
}

class Day1(private val lines: List<String>) {
    fun part1() {
        var previous: Int? = null
        var increased = 0
        for (line in lines) {
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
        var increased = 0
        var values = listOf<Int>()
        for (line in lines) {
            if (line == "") {
                continue
            }
            val current = line.toInt()
            val before = if (values.size == 3) values.sum() else null
            values = (listOf(current) + values).take(3)
            val after = if (values.size == 3) values.sum() else null

            if (before != null && after != null) {
                if (after > before) {
                    increased++
                }
            }
        }
        println("Part 2: $increased")
    }
}
