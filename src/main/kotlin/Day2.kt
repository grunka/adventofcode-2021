fun main() {
    with(Day2(readInput("Day2.input"))) {
        part1()
        part2()
    }
}

class Day2(private val lines: List<String>) {
    fun part1() {
        var horizontal = 0;
        var vertical = 0;
        for (line in lines) {
            if (line.startsWith("forward ")) {
                horizontal += line.substring("forward ".length).toInt()
            } else if (line.startsWith("up ")) {
                vertical -= line.substring("up ".length).toInt()
            } else if (line.startsWith("down ")) {
                vertical += line.substring("down ".length).toInt()
            }
        }
        val product = horizontal * vertical
        println("Part 1: $horizontal * $vertical = $product")
    }

    fun part2() {
        var horizontal = 0
        var vertical = 0
        var aim = 0;
        for (line in lines) {
            if (line.startsWith("forward ")) {
                val x = line.substring("forward ".length).toInt()
                horizontal += x
                vertical += aim * x
            } else if (line.startsWith("up ")) {
                aim -= line.substring("up ".length).toInt()
            } else if (line.startsWith("down ")) {
                aim += line.substring("down ".length).toInt()
            }
        }
        val product = horizontal * vertical
        println("Part 2: $aim, $horizontal * $vertical = $product")
    }
}
