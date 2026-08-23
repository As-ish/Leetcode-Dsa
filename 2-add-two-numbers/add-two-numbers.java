class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Dummy node result list ko easily create karne ke liye
        ListNode dummy = new ListNode(0);

        // Current result node
        ListNode current = dummy;

        // Carry initially 0 hai
        int carry = 0;

        // Jab tak l1, l2 ya carry mein kuch hai
        while (l1 != null || l2 != null || carry != 0) {

            // Agar l1 null hai to value 0 lenge
            int x = (l1 != null) ? l1.val : 0;

            // Agar l2 null hai to value 0 lenge
            int y = (l2 != null) ? l2.val : 0;

            // Addition
            int sum = x + y + carry;

            // Current digit
            int digit = sum % 10;

            // Next carry
            carry = sum / 10;

            // Result mein new node add karo
            current.next = new ListNode(digit);

            // Current pointer aage badhao
            current = current.next;

            // l1 ko aage badhao
            if (l1 != null) {
                l1 = l1.next;
            }

            // l2 ko aage badhao
            if (l2 != null) {
                l2 = l2.next;
            }
        }

        // Dummy khud answer ka part nahi hai
        return dummy.next;
    }
}