fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result)

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    val keys = map.keys
    println(keys)

    val set = setOf(1, 2, 3, 4, 5)
    val contains = set.contains(3)
    println(contains)
}