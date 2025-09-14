# ДНЕВНИК РЕШЕНИЙ

> https://leetcode.com/problems/squares-of-a-sorted-array/

Код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)

        var l = 0
        var r = nums.size - 1
        var index = nums.size - 1

        while (r >= l) {
            val leftSquare = nums[l] * nums[l]
            var rightSquare = nums[r] * nums[r]

           if (leftSquare > rightSquare) {
                ans[index] = leftSquare
                index -= 1
                l += 1
           } else {
                ans[index] = rightSquare
                index -= 1
                r -= 1
           }
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
    fun sortedSquares(nums: IntArray): IntArray {
        val ans = mutableListOf<Int>()

        var l = 0
        var r = nums.size - 1

        while (r >= l) {
           if ( abs(nums[l]) > abs(nums[r]) ) {
                ans.add(nums[l] * nums[l]) 
                l+=1
           } else {
                ans.add(nums[r] * nums[r])
                r-=1
           }
        }

        ans.reverse()
        return ans.toIntArray()
    }
}
```