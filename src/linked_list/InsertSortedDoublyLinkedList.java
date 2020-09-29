package linked_list;

public class InsertSortedDoublyLinkedList {
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

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);

        if (head == null) {
            head = node;
        } else if (data < head.data){
            node.next = head;
            head.prev = node;
            head = node;
        } else {
            head.next = sortedInsert(head.next, data);
            head.next.prev = head;
        }

        return head;
    }
}
