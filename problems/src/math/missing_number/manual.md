# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/missing-number/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val expectedSum = n * (n + 1) / 2
        val actualSum = nums.sum()
        return expectedSum - actualSum
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


## Исправленное решение:

```kotlin
class Solution {
    fun missingNumber(nums: IntArray): Int {
    
        val sorted = nums.sorted()
        // Проверяем, если пропущен 0
        if (sorted[0] != 0) return 0
        
        for (i in 0 until sorted.size - 1) {
            if (sorted[i] + 1 != sorted[i + 1]) {
                return sorted[i] + 1
            }
        }
        
        // Если все числа идут подряд, то пропущено последнее
        return sorted.size
    }
}
```