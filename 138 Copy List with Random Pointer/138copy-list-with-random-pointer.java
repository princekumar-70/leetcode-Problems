class Solution {
    public Node copyRandomList(Node head) {

        if (head == null) return null;

        // 1) Insert copied nodes in between original nodes
        Node temp = head;
        while (temp != null) {
            Node copy = new Node(temp.val);
            copy.next = temp.next;
            temp.next = copy;
            temp = copy.next;
        }

        // 2) Assign random pointers to copied nodes
        temp = head;
        while (temp != null) {
            if (temp.random != null) {
                temp.next.random = temp.random.next;  
            }
            temp = temp.next.next; 
        }

        // 3) Separate original and copied list
        Node newHead = head.next;
        Node orig = head;
        Node copy = head.next;

        while (orig != null) {
            orig.next = orig.next.next;
            if (copy.next != null) {
                copy.next = copy.next.next;
            }
            orig = orig.next;
            copy = copy.next;
        }

        return newHead;
    }
}
