package yandex_contest_2025.b_k_naibolee_chastih

import java.util.*

fun main() {
    val k = readLine()!!.toInt()
    readLine()
    val freqMap = HashMap<Int, Int>()

    readLine()!!.splitToSequence(' ')
        .map { it.toInt() }
        .forEach { num -> freqMap[num] = freqMap.getOrDefault(num, 0) + 1 }

    val minHeap = PriorityQueue(compareBy<Pair<Int, Int>> { it.second }
        .thenBy { it.first })

    for ((num, freq) in freqMap) {
        minHeap.add(num to freq)
        if (minHeap.size > k) minHeap.poll()
    }

    val result = minHeap.sortedWith(compareByDescending<Pair<Int, Int>> { it.second }
        .thenByDescending { it.first })
        .joinToString(" ") { it.first.toString() }

    println(result)
}