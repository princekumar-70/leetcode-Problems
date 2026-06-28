
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode anp = head;
        ListNode dummy = new ListNode(0);
        
        ListNode temp = dummy;
        ListNode sum = new ListNode(0);
        ListNode prev = sum;
        
        while(anp!=null){
            if(anp.val<x){
                temp.next = anp;
                temp = temp.next;
            }else if(anp.val>=x){
                prev.next = anp;
                prev = prev.next;
            }
            anp = anp.next;
        }
          prev.next = null;
          temp.next = sum.next;
        return dummy.next;



    }
}