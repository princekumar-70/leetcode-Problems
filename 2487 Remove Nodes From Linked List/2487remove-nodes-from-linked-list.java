
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> st = new Stack<>();
        while(temp!=null){
           while(st.size()> 0  && st.peek().val< temp.val){
            st.pop();
           } 
           st.push(temp);
           temp = temp.next;
        }
        while(st.size()>0){
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }
         return temp;

        
    }
}