package yandex_contest_2025.b_k_naibolee_chastih

// нужно вернуть 4
//  7
// 3 7 5 6 5 4 7
// ответ будет 7 5 6 4

fun main() {
    val k = readln().toInt()
    val n = readln().toInt()
    val numInput = readln().replace(" ", "")

    val answer = mutableMapOf<Char, Int>()

    numInput.forEach { e ->
        if(answer.contains(e)) {
            answer[e] = answer[e] as Int + 1
        }
        else answer[e] = 1
    }

    println(answer.toList().sortedBy { it.second }.toMap(LinkedHashMap()).reversed().keys.take(k).joinToString(" "))
}