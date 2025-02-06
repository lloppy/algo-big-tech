fun main() {
    val first = ListNode(1)
    val second = ListNode(2)
    val third = ListNode(3)

    val first1 = ListNode(5)
    val second1 = ListNode(6)
    val third1 = ListNode(7)


// Связывание элементов
    first.next = second
    second.next = third
    third.next = third1


    first1.next = second1
    second1.next = third1


    Solution().getIntersectionNode(first, first1)
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun getIntersectionNode(headA:ListNode?, headB:ListNode?):ListNode? {
        var p1 = headA
        var p2 = headB

        while (p1 != p2) {
            p1 = if (p1 == null) headB else p1.next
            p2 = if (p2 == null) headA else p2.next
        }
        return p1
    }
}
