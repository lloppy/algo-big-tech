# ДНЕВНИК РЕШЕНИЙ
https://leetcode.com/problems/reorder-list/description/

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
        
     fun reorderList(head: ListNode?): Unit {
        val middleNode = findMiddle(head)
        var secondReverse = secondReverse(middleNode?.next)
        middleNode?.next = null

        var p1 = head
        var p2 = secondReverse
        while(p2!=null) {
            val temp = p1?.next
            p1?.next = p2
            p1 = p2
            p2 = temp  
        }
        return
     }

     fun secondReverse(head: ListNode?): ListNode? {
        var dummy: ListNode? = null
        var curr = head

        while(curr!=null){
            var temp = curr
            curr = curr.next
            temp.next = dummy
            dummy = temp
        }
        return dummy
     }

     fun findMiddle(head: ListNode?): ListNode? {
        var slow = head
        var fast = head

        while(fast != null && fast?.next != null && fast?.next?.next != null ){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow
     }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения
У нас есть список:
> 1 -> 2 -> 3 -> 4

1. Нам нужно разорвать связь 2 -> 3, поставив на 2.next = null. Значит мы ищем не просто середину, а левую середину. А переворачивание уже начинаем с серединного элемента.
2. Перевернуть 3 -> 4 на 4 -> 3
3. Пройтись и склеить.

