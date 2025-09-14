# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/merge-sorted-array/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {       
        var sum = m + n - 1
        var p1 = m - 1
        var p2 = n - 1

        while (p1 >= 0 && p2 >= 0) {
            val max = maxOf(nums1[p1], nums2[p2])
            nums1[sum] = max

            if(max == nums1[p1]) p1-=1 else p2-=1
            sum -= 1
        }

        while (p2 >= 0) {
            nums1[sum] = nums2[p2]
            p2-=1
            sum-=1
        }

    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


