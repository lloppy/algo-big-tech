# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/evaluate-reverse-polish-notation/submissions/1767234433/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        val operations = listOf<String>("+", "-", "*", "/")

        for (token in tokens) {
            if (token !in operations) {
                stack.add(token.toInt()!!)
            } else {
                val last = stack.removeLast()
                val prevLast = stack.removeLast()

                when(token) {
                    "+" -> stack.add(last + prevLast)
                    "-" -> stack.add(prevLast - last)
                    "*" -> stack.add(last * prevLast)
                    "/" -> stack.add(prevLast / last)
                    else -> "unsuppurted operation"
                 }
            }
        }

        return stack.last()
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


