
class Solution {
    public ListNode middleNode(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       while(fast!=null){
       
        if(fast.next == null){
            return slow;
        }
         slow = slow.next;
        fast = fast.next.next;
       }
       return slow;
        
    }
}