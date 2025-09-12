# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/two-sum/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>() // value: index

        for (i in nums.indices) {
            val curr = nums[i]

            if (map[target - curr] != null) return intArrayOf(i, map[target - curr]!!)
            map[curr] = i
        }

        return intArrayOf(-1, -1)
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


