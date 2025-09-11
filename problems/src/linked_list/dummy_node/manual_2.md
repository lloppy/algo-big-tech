# ДНЕВНИК РЕШЕНИЙ
https://leetcode.com/problems/remove-nth-node-from-end-of-list/

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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy = ListNode()
        dummy.next = head

        var lenList = 0
        var currNode = dummy
        while(currNode.next!=null){
           currNode = currNode.next
            lenList +=1 
        }

        currNode = dummy
        for(i in 0..lenList - n - 1){
            currNode = currNode.next
        }
        currNode.next = currNode.next.next

        return dummy.next
    }
}
```


# 2. Оценка по времени


# 3. Оценка по памяти


# 4. Ваши объяснения
Исходим от противного.

1. Нам нужно перезаписать ссылку которая указывала на удаляемое значение. Перезаписываем у предыдущей ноды. 
получается что:
```kotlin
Предыдущая_нода.ссылка_на_следующую_ноду = Предыдущая_нода.ссылка_на_следующую+1_ноду
```

2. Нам не дана длина. Но нам нужно найти положение Предыдущая_нода.
Считается как:
```kotlin
len - n - 1
6 - 2 - 1 = 3 - искомый индекс
```

3. Так как у нас нет этой длины - то проходим по всем нодам - и считаем длину.
> Как понять что мы дошли до конца? - Ссылка последней ноды next будет показывать на null.

4. Возвращаемся к пункту 2 и становимся указателем на предыдущую ноду. Возвращаемся к п1 и  меняем указатель.

Как поставить указатель? - Циклом for идем до len - n - 1 (включительно) или до len - n (не включительно, используя until)


