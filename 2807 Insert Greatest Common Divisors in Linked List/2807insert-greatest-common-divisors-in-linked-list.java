
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
         ListNode temp = head;
         while(temp!=null && temp.next!=null){
           int sum = gcd(temp.val , temp.next.val);
           ListNode nextNode = temp.next;
            ListNode  Gcd = new ListNode(sum);
          temp.next = Gcd;
          Gcd.next = nextNode;
          temp = nextNode;
         }
         return head;
    }
    public int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
    }
}