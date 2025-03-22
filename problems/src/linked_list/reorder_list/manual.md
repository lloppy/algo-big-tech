# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/z5fE46sk6AdLZd

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
        val leftMiddle: ListNode? = findLeftMiddle(head)
        val reverseSecond: ListNode? = reverse(leftMiddle?.next)
        
        leftMiddle?.next = null 

        var p1: ListNode? = head
        var p2: ListNode? = reverseSecond
        while (p2 != null) {
            val temp1 = p1?.next
            p1?.next = p2
            p1 = p2
            p2 = temp1
        }

        return
    }

    private fun findLeftMiddle(head: ListNode?): ListNode? {
        var fast = head
        var slow = head

        while (fast != null && fast?.next != null && fast?.next?.next != null){
            fast = fast?.next?.next
            slow = slow?.next
        }

        return slow

    }


    private fun reverse(head: ListNode?): ListNode? {
        var prev: ListNode? = null
        var curr: ListNode? = head

        while (curr != null) {
            val temp = curr
            curr = curr.next
            temp.next = prev
            prev = temp
        }

        return prev

    }
    
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения
Получается улитка. Разбиваем связь между 1.next и переносим 1.next в p2 (p2 перевернули).После переноса некста переносим и сам указатель с 1 на p2.p2 становится бывшим 1.next. 
Также нужно предусмотреть зацикливание когда дойдем до середины. тогда во-первых при вересе дамми нода становится нулом, во-вторых нужно указать что связь последнего элемента первого массива также указывает на нул (leftMidElement.next = null)

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
