
class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(arr);
        ListNode Dummy = new ListNode(0);
        ListNode prev = Dummy;
        for(int i =0 ;i<arr.size();i++){
            prev.next = new ListNode(arr.get(i));
            prev = prev.next;
        }
        return Dummy.next;
        
    }
}