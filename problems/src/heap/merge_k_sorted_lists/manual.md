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
       fun mergeKLists(lists: Array<ListNode?>): ListNode? {
            val dummy = ListNode()
            var curr: ListNode? = dummy

            while(true){
                var minIdx = minIndex(lists)
                if(minIdx == null) break

                curr?.next = lists[minIdx]
                curr = curr?.next
                lists[minIdx] = lists[minIdx]?.next
            }
            return dummy.next
       }

        fun getVal(node: ListNode?): Int = if (node != null) node.`val` else Int.MAX_VALUE

        fun minIndex(lists: Array<ListNode?>): Int? {
            var minVal = Int.MAX_VALUE
            var minIdx: Int? = null

            for(i in lists.indices){
                var value = getVal(lists[i])
                if(value<minVal) {
                    minVal = value
                    minIdx = i
                }
            }
            return minIdx
        }
            

}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


