package linked_list;

public class RemoveDuplicate {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode p = head;

        while (p != null) {
            while (p.next != null && p.data == p.next.data) {
                p.next = p.next.next;
            }
            p = p.next;
        }
        return head;
    }
}
