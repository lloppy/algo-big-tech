# ДНЕВНИК РЕШЕНИЙ

> https://ya.cc/t/ChQ5mbcO6AUNzh

# 1. Решение

```kotlin

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    val dummy = ListNode()
    dummy.next = head
    
    var lenList: Int = 0
    var curr: ListNode? = dummy

    while(curr?.next != null){
        lenList+=1
        curr = curr.next
    }
    
    curr = dummy
    for(i in 0 until lenList - n){
        curr = curr?.next
    }
    
    curr?.next = curr?.next?.next
    
    return dummy.next
    }
}

```

# 2. Оценка по времени
в цикле while проходим про n, и в цикле for по n-раз. Итого О(n)

# 3. Оценка по памяти
новый массив не создаем, используем один старый. Значит O(1)

# 4. Ваши объяснения
curr.next это стрелка связи между цепочкой. нам нужно подменить звено доТаргета на звено Таргет.next
создаем дамми для чтобы специально не обрабатывать первую ноду (когда в задаче просят удалить первый элемент = lenМассива == n)

вот вариант без dummy:

```kotlin
class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var lenList: Int = 0
        var curr: ListNode? = head

        while (curr != null) {
            lenList++
            curr = curr.next
        }

        // если просят удалить первый элемент в списке - обрабатываем спициально
        if (lenList == n) {
            return head?.next
        }

        curr = head
        for (i in 0 until lenList - n - 1) {
            curr = curr?.next
        }

        curr?.next = curr?.next?.next

        return head
    }
    
}

```


