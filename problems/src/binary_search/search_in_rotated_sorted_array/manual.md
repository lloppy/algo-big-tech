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
    fun isGood(i: Int, arr: IntArray, lastElement: Int): Boolean {
        return arr[i] > lastElement
    }

    fun findOffset(nums: IntArray): Int {
        val lastElement = nums.last()
        
        var l = -1
        var r = nums.size -1

        while(r-l > 1){
            val middle = (l+r)/2
            if(isGood(middle, nums, lastElement)){
                l = middle
            } else{
                r = middle
            }
        }
        return r
    }

    fun search(nums: IntArray, target: Int): Int {
        val offset = findOffset(nums)
         
        var l = 0
        var r = nums.size 

        while(r-l > 1){
            val middle = (l+r)/2
            val realIndex = (middle + offset) % nums.size
            if(nums[realIndex] <= target){
                l = middle
            } else{
                r = middle
            }
        }
        val realLeft = (l + offset) % nums.size
        return if(nums[realLeft] == target) realLeft else -1
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения

```kotlin
class Solution {
    fun isGood(i: Int, arr: IntArray, lastElement: Int): Boolean {
        return arr[i] > lastElement
    }

    fun findOffset(nums: IntArray): Int {
        val lastElement = nums.last()
        
        var l = -1
        var r = nums.size -1

        while(r-l > 1){
            val middle = (l+r)/2
            if(isGood(middle, nums, lastElement)){
                l = middle
            } else{
                r = middle
            }
        }
        return r
    }

    fun search(nums: IntArray, target: Int): Int {
        val offset = findOffset(nums)
         
        var l = 0
        var r = nums.size 

        while(r-l > 1){
            val middle = (l+r)/2
            val realIndex = (middle + offset) % nums.size
            if(nums[realIndex] <= target){
                l = middle
            } else{
                r = middle
            }
        }
        val realLeft = (l + offset) % nums.size
        return if(nums[realLeft] == target) realLeft else -1
    }
}
```

```Python3
class Solution:
    # time: O(log n)
    # mem:  O(1)
    def findOffset(self, nums: List[int]):
        # good   bad
        # [   |  1 2 3 4 5]
        #   l    r

        #  good        bad
        # [4 5 6 7  |  0 1 2]
        #        l     r
        def good(i: int):
            return nums[i] >= nums[-1]

        l, r = -1, len(nums) - 1
        while r - l > 1:
            m = (l + r) // 2
            if good(m):
                l = m
            else:
                r = m
        return r

    # time: O(log n)
    # mem:  O(1)
    def search(self, nums: List[int], target: int) -> int:
        def good(i: int):
            return nums[i] <= target

        # обычный бинарный поиск, но смещаем на offset дополнительно
        offset = self.findOffset(nums)
        l, r = 0, len(nums)
        while r - l > 1:
            # Note: ошибка №1 это делать "m = (l + r + offset) // 2"
            m = (l + r) // 2
            if good((m + offset) % len(nums)):
                l = m
            else:
                r = m
        # Note: ошибка №2 это забыть сделать "(l + offset) % len(nums)"
        realLeft = (l + offset) % len(nums)
        return realLeft if nums[realLeft] == target else -1
```
