
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode previous = null;
       while(curr!=null){
        ListNode temp = curr.next;
        curr.next = previous;
        previous = curr;
        curr = temp;

       }
       return previous;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverseList(slow.next);
       
        ListNode p1 = head;
        ListNode p2 = temp;
        while(p2!=null){
            if(p1.val!=p2.val)return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}