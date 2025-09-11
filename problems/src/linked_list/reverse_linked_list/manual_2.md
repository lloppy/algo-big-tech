# ДНЕВНИК РЕШЕНИЙ
https://leetcode.com/problems/reverse-linked-list/

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
        fun reverseList(head: ListNode?): ListNode? {
            var dummy: ListNode? = null
            var curr = head

            while(curr != null){
               var tmp = curr
               curr = curr.next
               tmp.next = dummy
               dummy = tmp
            }
            return dummy
        }
    }
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения
1. ! Идея использовать два указателя. 
2. Сначала запоминаем в temp куда указывало curr значение и двигаем curr на next. 

> Теперь нам нужно разрушить связь. Раньше temp (а не curr) указывал на next - теперь же он будет указывать на dummy_prev. 
> 
> Связь разрушена!

3. Двигаем dummy_prev на место tmp, делая шаг вперед.

> Делаем проверку в цикле на  while(curr!=null), потому что в последний раз мы успеваем сдвигать быстрый указатель, и он будет null.

> Возращаем в ответе dummy, потому что он будет показывать на последний элемент, а curr будет показывать на null.

