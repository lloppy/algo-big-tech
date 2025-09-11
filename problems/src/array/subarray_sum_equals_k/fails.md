# ДНЕВНИК ОШИБОК
Все решения, которые были зафейлены

Смысл данного дневника зафиксировать вообще все свои провальные отправки, а потом по возможности к ним вернуться и написать внизу каждой отправки, что было не так.

Когда вы зафиксируете что было не так, то с большой вероятностью перестанете допускать такую ошибку в дальнейшем, а значит и шанс на отправку без ошибок вырастет

1. не поняла
2. 
3. 
 
```kotlin
class Solution {
    fun subarraySum(nums: IntArray, k: Int): Int {
        val prefixSumCount = mutableMapOf<Int, Int>()
        prefixSumCount[0] = 1  // Base case: sum 0 occurs once before we start
        var sum = 0
        var count = 0
        
        for (num in nums) {
            sum += num
            // If (sum - k) exists in our map, it means there are subarrays ending here that sum to k
            count += prefixSumCount.getOrDefault(sum - k, 0)
            // Update the count for the current sum
            prefixSumCount[sum] = prefixSumCount.getOrDefault(sum, 0) + 1
        }
        
        return count
    }
}

```