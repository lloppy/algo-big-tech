# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/consecutive-characters/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun maxPower(s: String): Int {
        var maxLength = 1
        var currLength = 1

        for (i in 1 until s.length) {
            val prev = s[i-1]
            val curr = s[i]

            currLength = if (prev == curr) currLength + 1 else 1
            maxLength = maxOf(currLength, maxLength)
        }
        return maxLength
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


