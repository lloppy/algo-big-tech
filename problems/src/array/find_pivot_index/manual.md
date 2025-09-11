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
    val px = mutableListOf<Int>(0)

    fun pivotIndex(nums: IntArray): Int {

        nums.forEach{
            px.add(px.last() + it)
        }

        for(i in 0 until nums.size){
            if(px[i+1] - nums[i] == px.last() - px[i+1] ) return i
        }
        return -1
         
    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(n)

# 4. Ваши объяснения
в эффективном решении смотрим на концы, сверяем с левой и правой суммой

```kotlin
class Solution {

    fun pivotIndex(nums: IntArray): Int {

        val numSum = nums.sum()
        
        var leftSum = 0
        for(i in 0 until nums.size){
            val rightSum = numSum - leftSum - nums[i]
            if(leftSum == rightSum  ) return i
            leftSum += nums[i]
        }
        
        return -1  
    }
}
```


O(n)   O(1)