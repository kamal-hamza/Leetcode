class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode current = head;
        int carry = 0;
        int l1Val = 0;
        int l2Val = 0;
        double val = 0;

        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                l1Val = l1.val;
            }
            else {
                l1Val = 0;
            }

            if (l2 != null) {
                l2Val = l2.val;
            }
            else {
                l2Val = 0;
            }

            int total = l1Val + l2Val + carry;
            current.next = new ListNode(total % 10);
            val = total / 10;
            val = Math.floor(val);
            carry = (int) val;

            if (l1 != null) {
                l1 = l1.next;
            }
            else {
                l1 = null;
            }

            if (l2 != null) {
                l2 = l2.next;
            }
            else {
                l2 = null;
            }

            current = current.next;

        }

        return head.next;
    }
}