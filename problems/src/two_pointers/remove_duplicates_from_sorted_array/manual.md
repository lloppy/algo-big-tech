# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        // u:              |
        //    [4, 5, 6, 7, 7, 9, 10, 10]
        // c:                 |

        var unique = 1

        for (i in 1..nums.size - 1) {
            val prev = nums[i-1]
            val curr = nums[i]

            if (prev != curr) { 
                // перезаписываем
                nums[unique] = curr
                unique++
            }
        }
        return unique
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


