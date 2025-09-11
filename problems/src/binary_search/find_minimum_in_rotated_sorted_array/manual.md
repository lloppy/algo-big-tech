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
    fun isGood(num: Int, last: Int): Boolean {
        return num > last
    }


    fun findMin(nums: IntArray): Int {
        val offset: Int = findOffset(nums)
        return nums[offset]
    }

    fun findOffset(array: IntArray): Int{
        val last = array.last()

        var l = -1
        var r = array.size -1

        while(r-l > 1){
            val middle = (l+r)/2
            if(isGood(array[middle], last)) l = middle else r = middle
        }
        return r
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


