
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy; 
        ListNode temp = head;
        while( temp!=null  ){
            if(temp.val!=val){
                prev.next = temp;
                prev = prev.next;
                temp = temp.next;
            }else{
                prev.next = temp.next;
                temp = temp.next;
            }
        }
       
        return dummy.next;
    }
}