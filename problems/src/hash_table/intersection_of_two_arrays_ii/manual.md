# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        // Всегда работаем с меньшим массивом для экономии памяти
        if (nums1.size > nums2.size) return intersect(nums2, nums1)
      
        val countMap = hashMapOf<Int, Int>() // Элемент : сколько раз встретилось
        val ans = mutableListOf<Int>()

        for (num in nums1) {
            countMap[num] = countMap.getOrDefault(num, 0) + 1
        }

        for (num in nums2) {
            val countFrom1 = countMap.getOrDefault(num, 0)

            if (countFrom1 > 0) {
                ans.add(num)
                countMap[num] = countFrom1 - 1
            }
        }

        return ans.toIntArray()
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


