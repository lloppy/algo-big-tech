# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/maximize-distance-to-closest-person/submissions/1770853446/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun maxDistToClosest(seats: IntArray): Int {
        var max = 0
        var l = 0
        var r = 0

        while (l < seats.size) {
            while (r < seats.size - 1 && seats[r + 1] == seats[r]) {
                r += 1
            }

            // если шли по ноликам
            if (seats[r] == 0) {

                if (l == 0 || r == seats.size - 1) {
                    max = maxOf(max, r - l + 1)
                } else {
                    max = maxOf(max, (r - l + 2) / 2)
                }
            }
            r += 1
            l = r
        }
        return max
        
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


