# ДНЕВНИК ОШИБОК
все решения, которые были зафейлены

Смысл данного дневника завиксировать вообще все свои провальные отправки, а потом по возможности к ним вернуться и написать внизу каждой отправки что было не так.

Когда вы зафиксируете что было не так, то с большой вероятностью перестанете допускать такую ошибку в дальнейшем, а значит и шанс на отправку без ошибок вырастет

1. prev не является массивом нод. изменяет связи
2. dummy не является хедом=первой нодой. dummy изначально пустое значение. стрелочка
3. temp можно объявлять внутри цикла
4. память О(1)
5. ошибка думать что дамми - это нода, а не связь. дамми = прев


> общая ошибка смотерть на стрелочкиСвязи а не на НодыКруги
 



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
        val dummy = ListNode()
        dummy.next = head

        var curr = dummy
        var temp = curr
        var prev: ListNode? = null
        while(curr?.next != null) {
            temp = curr
            curr = curr.next
            temp.next = prev
            prev = temp
        }  

        return dummy.next
    }
}
```