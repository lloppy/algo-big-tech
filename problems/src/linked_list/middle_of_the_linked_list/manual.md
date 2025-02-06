# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/TMSUdRfZ6AXeu9

код для оптимального решения + описание 

- зафиксировать правильное решение
- оценка по времени и памяти
- путь по которому вы пришли к решению


## Структура:

# 1. Решение

```kotlin
/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var lenList = 0
        var curr = head
        
        while(curr != null){
            lenList += 1
            curr = curr?.next
        }
        
        var slow = head
        var fast = head
        while (fast?.next != null && fast != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        
        return slow
         
    }
}
```


# 2. Оценка по времени
O(n) 


# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения
быстрый и медленный указатель. быстрый идет в два раза быстрее, поэтому когда быстрый закончит проходку - медленный будет как раз на середине.

