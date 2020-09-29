package linked_list;

public class InsertTail {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (head == null) {
            head = node;
        } else {
            SinglyLinkedListNode p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = node;
        }
        return head;
    }
}
