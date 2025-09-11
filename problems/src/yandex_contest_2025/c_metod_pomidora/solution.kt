package yandex_contest_2025.c_metod_pomidora

// N будильников заводит
// каждные X минут звонит
// K будильников слушает

//  1 2 3 4 5 6 - моменты времени


import java.util.*

fun main() {
    val input = Scanner(System.`in`)
    val N = input.nextInt()
    val X = input.nextInt()
    val K = input.nextLong()
    val t = LongArray(N) { input.nextLong() }

    val groups = t.groupBy { it % X }.mapValues { (_, values) -> values.minOrNull()!! }.values.sorted()

    var left = 0L
    var right = Long.MAX_VALUE

    fun countUniqueAlarms(T: Long): Long {
        var count = 0L
        for (start in groups) {
            if (start > T) continue
            val cnt = (T - start) / X + 1
            count += cnt
        }
        return count
    }

    while (left < right) {
        val mid = left + (right - left) / 2
        if (countUniqueAlarms(mid) >= K) {
            right = mid
        } else {
            left = mid + 1
        }
    }

    println(left)
}