# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ https://leetcode.com/problems/binary-search/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun isGoodNum(num: Int, target: Int): Boolean {
        return num <= target
    }

    fun search(nums: IntArray, target: Int): Int {
        var l = 0
        var r = nums.size

        while(r - l != 1){
            val middle = (l + r) / 2
            if(isGoodNum(nums[middle], target)) l = middle else r = middle
        }
        return if(nums[l] == target) l else -1
    }
}
```


# 2. Оценка по времени

O(log n)
# 3. Оценка по памяти

О(1)

# 4. Ваши объяснения


