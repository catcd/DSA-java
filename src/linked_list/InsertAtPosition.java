package linked_list;

public class InsertAtPosition {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);

        if (position == 0) {
            node.next = head;
            head = node;
        } else {
            SinglyLinkedListNode p = head;
            while (--position != 0) {
                p = p.next;
            }
            node.next = p.next;
            p.next = node;
        }
        return head;
    }
}
