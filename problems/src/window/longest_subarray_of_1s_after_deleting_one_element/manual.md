# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/submissions/1770873281/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun longestSubarray(nums: IntArray): Int {
        var max = 0
        var zeroCount = 0
        var l = 0
        var r = 0

        while (r < nums.size) {
            if (nums[r] == 0) {
                zeroCount++
            }

            while (zeroCount > 1) {
                if (nums[l] == 0) {
                    zeroCount -= 1
                }
                l += 1
            }

            max = maxOf(max, r - l)
            r += 1
        }
        return max
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


