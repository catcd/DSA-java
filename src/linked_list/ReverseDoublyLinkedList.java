package linked_list;

public class ReverseDoublyLinkedList {
    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        if (head == null) {
            return null;
        }

        DoublyLinkedListNode node = head, prev = null;
        while (node != null) {
            node.prev = node.next;
            node.next = prev;
            prev = node;
            node = node.prev;
        }

        return prev;
    }
}
