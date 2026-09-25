class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Dummy node
        ListNode dummy = new ListNode(-1);

        // Result list ka current pointer
        ListNode current = dummy;

        // Jab tak dono lists mein nodes hain
        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {

                current.next = list1;
                list1 = list1.next;

            } else {

                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        // Agar list1 mein kuch nodes bach gaye
        if (list1 != null) {
            current.next = list1;
        }

        // Agar list2 mein kuch nodes bach gaye
        if (list2 != null) {
            current.next = list2;
        }

        // Dummy ko skip karke actual head return karo
        return dummy.next;
    }
}