package yandex_contest_2025.c_metod_pomidora

fun main() {
    val (n, x, k) = readLine()!!.split(" ").map { it.toLong() }
    val times = readLine()!!.split(" ").map { it.toLong() }

    val groups = times.groupBy { it % x }.mapValues { (_, values) -> values.minOrNull()!! }.values

    val minT = groups.minOrNull()!!
    var low = minT
    var high = minT + k * x

    fun countRings(T: Long): Long {
        var total = 0L
        for (start in groups) {
            if (T >= start) total += (T - start) / x + 1
        }
        return total
    }

    while (low < high) {
        val mid = (low + high) / 2
        if (countRings(mid) >= k) {
            high = mid
        } else {
            low = mid + 1
        }
    }
    println(low)
}
