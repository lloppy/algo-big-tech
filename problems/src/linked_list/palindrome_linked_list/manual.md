# ДНЕВНИК РЕШЕНИЙ

> https://code.yandex-team.ru/ 

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
    fun isPalindrome(head: ListNode?): Boolean {
        val midElement = findMiddle(head)
        val reversedNodes = reverse(midElement)

        var p1: ListNode? = head
        var p2: ListNode? =  reversedNodes
           while (p2 != null && p1 != null) {
            if (p1?.`val` != p2?.`val`){
                return false
            }
            p1 = p1?.next
            p2 = p2?.next
        }
        return true
    }

    private fun reverse(midElement: ListNode): ListNode {
        var prev: ListNode? = null
        var curr:ListNode? = midElement

        while (curr != null){
            val temp = curr
            curr = curr?.next
            temp.next = prev
            prev = temp
        }
        return prev!!
    }


    private fun findMiddle(head: ListNode?): ListNode {
        var slow = head
        var fast = head

        while (fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next?.next
        }
        return slow!!

    }
}
```


# 2. Оценка по времени
O(n)

# 3. Оценка по памяти
O(1)

# 4. Ваши объяснения
1. ищем середину - это будет последний элемент второго списка
2. переворачиваем второй список. mid элемент будет ссылаться на нул. Нул будет указывать на выход из цикла при сравнении p1 и p2
3. сравниваем p1 и p2

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
