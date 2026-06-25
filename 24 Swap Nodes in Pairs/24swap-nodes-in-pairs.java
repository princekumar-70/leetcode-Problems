class Solution {
    public ListNode swapPairs(ListNode head) {

        if(head == null) return null;

        Stack<Integer> st = new Stack<>();
        ListNode temp = head;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(temp != null) {

            int count = 0;

            while(count < 2 && temp != null) {
                st.push(temp.val);
                temp = temp.next;
                count++;
            }

            if(count == 2) {
                while(!st.isEmpty()) {
                    curr.next = new ListNode(st.pop());
                    curr = curr.next;
                }
            } else { 
                curr.next = new ListNode(st.pop());
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}