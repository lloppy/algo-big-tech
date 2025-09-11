package yandex_contest_2025.d_meteorit

fun main() {
    data class Query(val x: Int, val y: Int, val id: Int)
    data class Event(val x: Int, val y1: Int, val y2: Int, val type: Int)

    val (h, w, n) = readln().split(" ").map { it.toInt() }
    val events = mutableListOf<Event>()
    val ySet = sortedSetOf<Int>()

    repeat(n) { 
        val (x1_, y1_, x2_, y2_) = readln().split(" ").map { it.toInt() }
        val x1 = minOf(x1_, x2_)
        val x2 = maxOf(x1_, x2_)
        val y1 = minOf(y1_, y2_)
        val y2 = maxOf(y1_, y2_)
        events.add(Event(x1, y1, y2, +1))
        events.add(Event(x2 + 1, y1, y2, -1))
        ySet += y1
        ySet += y2
    }

    val q = readln().toInt()
    val queries = mutableListOf<Query>()
    repeat(q) { i ->
        val (x, y) = readln().split(" ").map { it.toInt() }
        queries.add(Query(x, y, i))
        ySet += y
    }

    val yComp = ySet.toList()
    val yIndex = yComp.withIndex().associate { it.value to it.index }

    class Fenwick(size: Int) {
        val tree = IntArray(size + 2)
        fun update(i: Int, delta: Int) {
            var idx = i + 1
            while (idx < tree.size) {
                tree[idx] += delta
                idx += idx and -idx
            }
        }

        fun query(i: Int): Int {
            var res = 0
            var idx = i + 1
            while (idx > 0) {
                res += tree[idx]
                idx -= idx and -idx
            }
            return res
        }

        fun rangeAdd(l: Int, r: Int, delta: Int) {
            update(l, delta)
            update(r + 1, -delta)
        }
    }

    val all = mutableListOf<Pair<Int, String>>() // x и ключ
    events.forEach { all.add(it.x to "e") }
    queries.forEach { all.add(it.x to "q") }

    val allX = all.map { it.first }.toSortedSet()
    val eventMap = events.groupBy { it.x }
    val queryMap = queries.groupBy { it.x }

    val fw = Fenwick(yComp.size)
    val result = IntArray(q)

    for (x in allX) {
        eventMap[x]?.forEach { e ->
            val l = yIndex[e.y1]!!
            val r = yIndex[e.y2]!!
            fw.rangeAdd(l, r, e.type)
        }

        queryMap[x]?.forEach { query ->
            val yIdx = yIndex[query.y]!!
            result[query.id] = if (fw.query(yIdx) > 0) 1 else 0
        }
    }

    println(result.joinToString("\n"))
}