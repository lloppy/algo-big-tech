# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/summary-ranges/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

![img.png](img.png)

```kotlin
class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        val ans = mutableListOf<String>()
        if (nums.isEmpty()) return ans

        var l = 0
        var r = 0

        while(l < nums.size) {

            while (r + 1 < nums.size && nums[r] + 1 == nums[r + 1]) {
                r += 1
            }

            if (l-r == 0) ans.add(nums[r].toString())
            else ans.add("${nums[l]}->${nums[r]}")

            r += 1
            l = r
        }

        return ans
    }
}
```

# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения

```kotlin
class Solution {
    fun summaryRanges(nums: IntArray): List<String> {
        if (nums.isEmpty()) return emptyList()
        
        val result = mutableListOf<String>()
        var start = nums[0]

        for (i in 1 until nums.size) {
            // Если текущее число не продолжает последовательность
            if (nums[i] != nums[i - 1] + 1) {
                // Если диапазон из одного числа — добавляем "a"
                if (start == nums[i - 1]) {
                    result.add("$start")
                }
                // Иначе — "a->b"
                else {
                    result.add("$start->${nums[i - 1]}")
                }
                // Начинаем новый диапазон с текущего числа
                start = nums[i]
            }
        }

        // Добавляем последний диапазон
        if (start == nums.last()) {
            result.add("$start")
        } else {
            result.add("$start->${nums.last()}")
        }
        
        return result
    }
}
```

