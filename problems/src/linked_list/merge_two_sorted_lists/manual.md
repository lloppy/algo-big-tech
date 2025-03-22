# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/g4JwhdBt6Ag5AC

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
        var list1 = list1
        var list2 = list2 
        val dummy = ListNode()
        var curr:ListNode = dummy
        
        while(list1!=null || list2 != null){
            if(getV(list1) > getV(list2)){
                curr.next = list2
                list2 = list2?.next
            }
            else{
                curr.next = list1
                list1 = list1?.next
            }
            curr = curr.next

        }
        
        return dummy.next    
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
O(n+m) ->
O(n)

# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения

1. делаем фиктивное начало, чтобы безболезненно сравнивать первые значения. 
2. после сравнения создаем связь (curr.next = list) и двигаем курсор (curr = curr.next) + пододвигаем что мы уже записали на следующий узел (list = list.next), тк list мы уже сравнили и нам надо идти сравнивать дальше.
3. идем пока что-то из листа 1 или 2 не станет нулом.

## Новое задание без решения

### Условие задачи

Дан массив целых чисел nums и целое число k. Нужно найти максимальную сумму подмассива длины k.

### Пример

Вход: nums = [1, 4, 2, 10, 23, 3, 1, 0, 20], k = 4
Выход: 39

Вход: nums = [-1, -2, -3, -4], k = 2
Выход: -3

### Ограничения

* 1 <= k <= nums.length <= 10^5
* -10^4 <= nums[i] <= 10^4
