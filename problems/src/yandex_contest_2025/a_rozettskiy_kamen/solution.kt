package yandex_contest_2025.a_rozettskiy_kamen

// Ввод: Antikythera mechanism
// Вывод: Anti&ythe&a me&hani&m

val str = readln().also {
    converter(it)
}

fun converter(str: String) {
    val strBuilder = StringBuilder()
    var replasedChar = 4

    str.forEachIndexed { index, c ->
        if (index == replasedChar) {
            strBuilder.append('&')
            replasedChar +=5
        }
        else strBuilder.append(c)
    }
    println(strBuilder.toString())
}
