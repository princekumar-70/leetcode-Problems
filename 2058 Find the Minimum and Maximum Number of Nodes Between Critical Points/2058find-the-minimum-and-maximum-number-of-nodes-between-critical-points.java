class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next == null || head.next.next==null){
            return new int[]{-1,-1};
        }

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode next = head.next.next;

        int index = 1;
        int first = -1, last = -1;
        int min_Distance  = Integer.MAX_VALUE;

         while (next != null) {
            boolean isCritical = 
                (curr.val > prev.val && curr.val > next.val) || 
                (curr.val < prev.val && curr.val < next.val);

            if (isCritical) {
                if (first == -1) {
                    first = index; 
                } else {
                    min_Distance = Math.min(min_Distance, index - last);
                }
                last = index;
            }

            prev = curr;
            curr = next;
            next = next.next;
            index++;
        }

        if (first == last) {
            return new int[]{-1, -1};
        }

        return new int[]{min_Distance, last-first};
    }
}