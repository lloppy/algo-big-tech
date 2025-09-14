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
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0

        var l = 0
        var r = 0

        while (l < nums.size) {
            
            while (r < nums.size - 1 && nums[r] == nums[r + 1] ) {
                r += 1
            }
            if (nums[r] == 1) max = maxOf(max, r - l + 1)
        
            r += 1
            l = r
        } 
        return max
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


