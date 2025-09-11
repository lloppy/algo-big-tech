# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var l = 0
        var r = numbers.size - 1

        while (l < r) {
            if (numbers[l] + numbers[r] > target) { 
                r--
            } else if (numbers[l] + numbers[r] < target) {
                l++
            } else {
                return intArrayOf(l+1, r+1)
            }
        }
        return intArrayOf(-1, -1)
        
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


