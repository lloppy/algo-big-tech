# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/longest-continuous-increasing-subsequence/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1
        
        var max = 1
        var curr = 1

        for(i in 1 until nums.size){
            curr = if (nums[i] > nums[i-1]) curr + 1 else 1
            max = maxOf(curr, max)
        }
        return max
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


