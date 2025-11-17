

    
class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode curr = head;
       ListNode previous = null;
       while(curr!=null) {
        ListNode temp = curr.next;
        curr.next = previous;
        previous = curr;
        curr = temp;
      }
       return previous;
    }
    

    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
       slow.next = reverseList(slow.next);
        int max = 0;
        ListNode head1 = head;
        ListNode head2 = slow.next;
        while(head2!=null){
            int sum = head1.val+ head2.val;
            if(max <sum){
                max = sum;
                
            }
            head1 = head1.next;
                head2 = head2.next;
        }

       return max;
    }
}