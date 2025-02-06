fun main() {
    val first = ListNode(1)
    val second = ListNode(2)
    val third = ListNode(3)
    val fourth = ListNode(4)

// Связывание элементов
    first.next = second
    second.next = third
    third.next = fourth

    Solution().reorderList(first)
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun reorderList(head: ListNode?): Unit {
        val leftMiddle = findLeftMiddle(head)
        val reverseSecond = reverse(leftMiddle)

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

    private fun findLeftMiddle(head: ListNode?): ListNode {
        var fast = head
        var slow = head

        while (fast != null && fast?.next != null && fast?.next?.next != null){
            fast = fast?.next?.next
            slow = slow?.next
        }

        return slow!!

    }


    private fun reverse(head: ListNode?): ListNode {
        var prev: ListNode? = null
        var curr: ListNode? = head

        while (curr != null) {
            val temp = curr
            curr = curr.next
            temp.next = prev
            prev = temp
        }

        return prev!!

    }


}
