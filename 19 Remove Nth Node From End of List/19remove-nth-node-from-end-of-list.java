class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        
        if (fast == null) {
            return head.next;
        }

        
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // ✅ Delete the node
        slow.next = slow.next.next;

        return head;
    }
}
