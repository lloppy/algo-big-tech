# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun isGoodFirst(i: Int, arr: IntArray, target: Int): Boolean {
        return arr[i] < target
    }

    fun isGoodLast(i: Int, arr: IntArray, target: Int): Boolean {
        return arr[i] <= target
    }

    fun searchRange(nums: IntArray, target: Int): IntArray {
        if (nums.isEmpty()) return intArrayOf(-1, -1)

        // Находим первое вхождение
        var l = 0
        var r = nums.size - 1
        while (l <= r) {
            val middle = (l + r) / 2
            if (isGoodFirst(middle, nums, target)) {
                l = middle + 1
            } else {
                r = middle - 1
            }
        }
        val first = if (l < nums.size && nums[l] == target) l else -1

        // Находим последнее вхождение
        l = 0
        r = nums.size - 1
        while (l <= r) {
            val middle = (l + r) / 2
            if (isGoodLast(middle, nums, target)) {
                l = middle + 1
            } else {
                r = middle - 1
            }
        }
        val last = if (r >= 0 && nums[r] == target) r else -1

        return if (first != -1) intArrayOf(first, last) else intArrayOf(-1, -1)
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


