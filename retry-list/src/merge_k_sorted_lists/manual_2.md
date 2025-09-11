# ДНЕВНИК РЕШЕНИЙ
https://leetcode.com/problems/merge-k-sorted-lists/

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

            while (true) {
                val mostMinIdx: Int? = getMinNodeIndex(lists)
                if (mostMinIdx == null) break

                curr?.next = lists[mostMinIdx]
                lists[mostMinIdx] = lists[mostMinIdx]?.next
                curr = curr?.next
            }
            return dummy?.next
       }

       fun getMinNodeIndex(lists: Array<ListNode?>):Int?{
            var minValue = Int.MAX_VALUE
            var minIdx:Int? = null

            for(i in 0 until lists.size){
                if(minValue > getValue(lists.get(i))){
                    minValue = getValue(lists.get(i))
                    minIdx = i
                }
            }
        return minIdx
       }

       fun getValue(node: ListNode?)= if(node != null) node.`val` else Int.MAX_VALUE
          
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


