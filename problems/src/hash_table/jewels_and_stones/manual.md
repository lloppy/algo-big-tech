# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/jewels-and-stones/description/


Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        // jewelsSet = jewels.toHashSet() и ищем уже в хешсете за О(1)
        var ans = 0

        for (i in stones) {
            if (i in jewels) ans++
        }

        return ans
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


