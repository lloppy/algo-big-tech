# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

Дан бинарный массив nums (содержит только 0 и 1). Найдите максимальное количество последовательных единиц в массиве, если вам разрешено перевернуть не более одного 0 на 1.

# 1. Решение

```kotlin
class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0

        var l = 0
        var r = 0
        var zeroCount = 0

        while (l < nums.size) {
            
            if (nums[r] == 0) zeroCount += 1

            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--
                }
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)
            right++
        }

        return maxLength
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


