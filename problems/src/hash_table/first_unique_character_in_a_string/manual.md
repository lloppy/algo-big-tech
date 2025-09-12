# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/first-unique-character-in-a-string/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun firstUniqChar(s: String): Int {
        val map = hashMapOf<Char, Int>() // символ: число вхождений

        for (i in s) {
            map[i] = map.getOrDefault(i, 0) + 1
        }

        for (i in s.indices) {
            if (map[s[i]] == 1) return i
        }

        return -1
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


