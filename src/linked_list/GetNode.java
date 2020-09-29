package linked_list;

public class GetNode {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode node = head, result = head;
        while (positionFromTail-- != 0) {
            node = node.next;
        }

        while (node.next != null) {
            node = node.next;
            result = result.next;
        }

        return result.data;
    }
}
