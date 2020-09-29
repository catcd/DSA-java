package linked_list;

public class CycleDetection {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow){
                return true;
            }
        }

        return false;
    }
}
