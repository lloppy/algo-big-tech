# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/is-subsequence/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun isSubsequence(s: String, t: String): Boolean {
        var ps = 0
        var pt = 0

        while (pt < t.length && ps < s.length) {
            if (s[ps] == t[pt]) ps++
            pt++
        }
        return ps == s.length
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


