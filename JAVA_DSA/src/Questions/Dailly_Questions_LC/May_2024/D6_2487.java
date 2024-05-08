package Questions.Dailly_Questions_LC.May_2024;

public class D6_2487 {
    public static void main(String[] args) {

    }
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

//    solution:
//    public ListNode removeNodes(ListNode head) {
//        if (head == null) return null;
//
//        ListNode dummy = new ListNode(0);
//        dummy.next = head;
//
//        ListNode current = dummy;
//        int maxSoFar = Integer.MIN_VALUE;
//
//        while (current.next != null) {
//            if (current.next.val > maxSoFar) {
//                maxSoFar = current.next.val;
//                current = current.next;
//            } else {
//                current.next = current.next.next; // Remove current.next from the list
//            }
//        }
//
//        return dummy.next;
//    }
}
