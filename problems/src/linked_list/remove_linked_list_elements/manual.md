# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

Код для оптимального решения + описание 

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
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var dummy:ListNode? = ListNode()
        dummy?.next = head

        var curr: ListNode? = head 
        var prev: ListNode? = dummy
        
        while(curr != null){

            if(curr?.`val` == `val`){
                prev?.next = curr?.next   
            }
            else {
                prev = prev?.next
            }
            curr = curr?.next
        }
        return dummy?.next
        
    }
}
```


# 2. Оценка по времени
О(n)

# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения
делаем мостики

