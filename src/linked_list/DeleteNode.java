package linked_list;

public class DeleteNode {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if (position == 0) {
            head = head.next;
        } else {
            SinglyLinkedListNode p = head;
            while (--position != 0) {
                p = p.next;
            }
            p.next = p.next.next;
        }
        return head;
    }
}
