
class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
       }
       ListNode fast = head.next;
       ListNode slow = head;
      while (fast != null && fast.next != null) {
         slow = slow.next;
          fast = fast.next.next;
       }
       ListNode second = slow.next;
       slow.next = null;

        second = reverse(second);
        ListNode first = head;

while (second != null) {
    ListNode temp1 = first.next;
    ListNode temp2 = second.next;

    first.next = second;
    second.next = temp1;

    first = temp1;
    second = temp2;
}


    }
    private ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;

    }
}