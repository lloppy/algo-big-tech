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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var first = l1
        var second = l2
        
        val dummy = ListNode(0)
        var curr = dummy
        var carry = 0

        while(first != null || second != null || carry != 0 ){
            val sum = getValue(first) + getValue(second) + carry
            carry = sum / 10
            val digit = sum % 10

            curr.next = ListNode(digit)
            curr = curr.next

            first = first?.next
            second = second?.next
        }
        return dummy.next
    }

    fun getValue(node: ListNode?): Int {
        return node?.`val` ?: 0
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения


Мы учитываем carry != 0 в условии цикла потому, что последний перенос может создать новый разряд числа.


**Без условия `carry != 0` мы бы получили:**
```
  999
+   1
------
  000  (потому что остановились после третьего разряда)
```

**С условием `carry != 0` получаем:**
```
  999
+   1
------
 1000  (правильный результат!)
```
