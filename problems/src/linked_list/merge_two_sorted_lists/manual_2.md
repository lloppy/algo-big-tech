# ДНЕВНИК РЕШЕНИЙ
https://leetcode.com/problems/merge-two-sorted-lists/

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
      fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode()
        var list1 = list1
        var list2 = list2 

        var curr = dummy
        while(list1!=null || list2!=null){
            if(getValue(list1) < getValue(list2)){
                curr?.next = list1
                list1 = list1?.next
            } else {
                curr?.next = list2
                list2 = list2?.next
            }
            curr = curr.next
        }
        return dummy.next
      }


      fun getValue(node: ListNode?): Int{
        if(node == null) return Int.MAX_VALUE
        return node.`val`
      }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения
1. Начинаем с dummy и сравниваем по двум указателям списки. На указатели ничего нового не создаем. Используем Int.MAX_VALUE для null значений. 

