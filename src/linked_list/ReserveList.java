package linked_list;

public class ReserveList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode node = head;
        SinglyLinkedListNode prev = null, next;

        while (node != null) {
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;
    }
}
