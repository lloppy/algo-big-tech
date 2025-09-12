# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/subarray-sum-equals-k/description/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val map = mutableMapOf<Int, Int>() // число: сколько раз встретилось эта сумма
        var pxSum = 0
        var ans = 0
       
        map[0] = 1  // сумма 0 встречается 1 раз (пустой подмассив)

        for (num in nums) {
            pxSum += num

            ans += map.getOrDefault(pxSum - k, 0)
            map[pxSum] = map.getOrDefault(pxSum, 0) + 1
        }
        return ans
    }
}





/*
       // [0: 0, 1: 1, 2: 0, 3: 0]
       // [0: 0, 1: 1, 2: 0, 3: 1]

       // [0: 0, 1: 1, 2: 0, 3: 2]

        val px = mutableMapOf<Int, Int>()
        px[0] = 1
        var px_sum = 0
        var ans = 0

        nums.forEach { num ->
            px_sum += num

            // if(num + px.getOrDefault(k - px_sum, 0) == k) ans += 1
            ans += px.getOrDefault(px_sum - k, 0)
            px[px_sum] = px.getOrDefault(px_sum, 0) + 1
        }   
        return ans   
*/
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


