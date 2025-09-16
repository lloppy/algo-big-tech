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
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(n)

# 4. Ваши объяснения
Используем хеш-таблицу для хранения чисел и их индексов. Проходим по массиву и для каждого числа проверяем, есть ли в хеш-таблице число, равное разности между целевым числом и текущим числом. Если такое число есть, возвращаем индексы текущего числа и числа из хеш-таблицы. Если такого числа нет, добавляем текущее число и его индекс в хеш-таблицу.
