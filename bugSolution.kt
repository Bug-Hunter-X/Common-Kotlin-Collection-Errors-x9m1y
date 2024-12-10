fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.also { println(it) }

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val keys = map.keys.also { println(it) }

    val set = setOf(1, 2, 3, 4, 5)
    val contains = set.contains(3).also { println(it) }

    //Example of potential error: trying to access a non-existent key
    // map["d"]?.let { println(it) } ?: println("Key not found")

    //Example of potential error: using filter and reduce together to find max value
    val numbers = listOf(1, 5, 2, 8, 3)
    val maxValue = numbers.filter { it > 0 }.reduce{ acc, i -> if (i > acc) i else acc }.also { println(it) }

    //Example of potential error: using map and then reduce to perform calculations
    val numbers2 = listOf(1, 2, 3, 4, 5)
    val sumOfSquares = numbers2.map { it * it }.reduce { acc, i -> acc + i }.also { println(it) }
}