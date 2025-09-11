# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/1758146523/


Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin

class Solution {
    fun isGood(i: Int, arr: IntArray): Boolean {
        if (i == 0) return true
        return arr[i-1] < arr[i]
    }

    fun peakIndexInMountainArray(arr: IntArray): Int {
        var l = 0
        var r = arr.size - 1

        while (r - l > 1){
            var middle = (l + r) / 2

            if(isGood(middle, arr)) l = middle else r = middle
        }
        return l
    }
}

```


# 2. Оценка по времени
O(log n)
# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения


