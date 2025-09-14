# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/move-zeroes/submissions/1770336591/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var i = 0

        for (num in nums) {
            if ( num == 0) continue
            nums[i] = num
            i++
        }

        for (i in i until nums.size){
            nums[i] = 0
        }
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


