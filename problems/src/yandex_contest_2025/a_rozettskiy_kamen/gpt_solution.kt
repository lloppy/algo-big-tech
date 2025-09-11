package yandex_contest_2025.a_rozettskiy_kamen

fun main() = println(readln().mapIndexed { i, c -> if ((i + 1) % 5 == 0) '&' else c }.joinToString(""))
