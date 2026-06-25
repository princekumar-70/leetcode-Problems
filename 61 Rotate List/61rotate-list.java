
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
       ListNode tail = head;
        int length = 1;
        ListNode temp = head;

        while(tail.next!=null){
         
            tail = tail.next;
               length++;
        }
       k = k%length;
       if(k==0)return head;
          tail.next = head;
        for(int i = 1;i<length-k;i++){
            temp = temp.next;
        }
      
        ListNode newHead = temp.next;
        temp.next = null;
        return newHead;
    }
}