# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/partition-labels/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun partitionLabels(s: String): List<Int> {
        val lastPosition = HashMap<Char, Int>() // буква и индекс последнего вхождения

        var l = 0
        var r = 0
        val ans = mutableListOf<Int>()

        for (i in s.indices) {
            val curr = s[i]
            lastPosition[curr] = i
        }

        for (i in s.indices) { // defegde
            val curr = s[i]

            r = maxOf(r, lastPosition[curr] ?: 0)
            if (i == r) {
                ans.add(r - l + 1)
                l = i + 1
            }
        }
        return ans
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


