# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    // [1, 3, 5]  [2, 4]   ->  [1, 2, 3, 4, 5]
    fun isGood(left1: Int, left2: Int, right1: Int, right2: Int): Boolean {
        // Проверяем, правильно ли разделены массивы
        // Максимальный элемент слева должен быть <= минимального элемента справа
        return maxOf(left1, left2) <= minOf(right1, right2)
    }

    fun shouldTakeFromNums1(left1: Int, right2: Int): Boolean {
        // Определяем, нужно ли уменьшить количество элементов из nums1
        // Если left1 > right2, значит взяли слишком много из nums1
        return left1 > right2
    }

    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        // Всегда работаем с меньшим массивом для оптимизации
        if (nums1.size > nums2.size) {
            return findMedianSortedArrays(nums2, nums1)
        }
        
        val m = nums1.size
        val n = nums2.size
        var l = 0
        var r = m
        
        while (l <= r) {
            val partition1 = (l + r) / 2
            val partition2 = (m + n + 1) / 2 - partition1
            
            // Получаем граничные элементы
            val left1 = if (partition1 > 0) nums1[partition1 - 1] else Int.MIN_VALUE
            val left2 = if (partition2 > 0) nums2[partition2 - 1] else Int.MIN_VALUE
            val right1 = if (partition1 < m) nums1[partition1] else Int.MAX_VALUE
            val right2 = if (partition2 < n) nums2[partition2] else Int.MAX_VALUE
            
            if (isGood(left1, left2, right1, right2)) {
                // Нашли правильное разделение
                return if ((m + n) % 2 == 1) {
                    maxOf(left1, left2).toDouble()
                } else {
                    (maxOf(left1, left2) + minOf(right1, right2)) / 2.0
                }
            } else if (shouldTakeFromNums1(left1, right2)) {
                // Слишком много элементов из nums1 в левой части
                r = partition1 - 1
            } else {
                // Слишком мало элементов из nums1 в левой части
                l = partition1 + 1
            }
        }
        
        return 0.0
    }
}
```


# 2. Оценка по времени

O(log (m+n))

# 3. Оценка по памяти


# 4. Ваши объяснения


