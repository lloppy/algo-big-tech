# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/Gh7lMRoA6Ah7nX

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
        val dummy: ListNode = ListNode()
        var curr: ListNode? = dummy
        
        while(true){
            val minNodeInx:Int? = findMinList(lists)
            if (minNodeInx == null) break
            
            curr?.next = lists[minNodeInx]
            lists[minNodeInx] = lists[minNodeInx]?.next
            
            curr = curr?.next
        }
        
        return dummy.next
        
    }
    
     private fun findMinList(lists: Array<ListNode?>):Int? {
        var minValue = Int.MAX_VALUE
        var minList : Int? = null
        
        for(i in 0 until lists.size){
            if(minValue > getV(lists[i])){
                minValue = getV(lists[i])
                minList = i
            }
        }
        return minList
        
    }
    
    private fun getV(node: ListNode?):Int{
        if(node == null) {
            return Int.MAX_VALUE
        }
        return node.`val`
    }
}
```


# 2. Оценка по времени
0(n)

# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения
1. находим минимальный из всех элемент. ищем по индексу мин массив значение
2. делаем шаг, пересохраняем

