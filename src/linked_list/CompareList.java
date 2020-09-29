package linked_list;

public class CompareList {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode p1 = head1, p2 = head2;
        while (p1 != null || p2 != null) {
            if (p1 == null || p2 == null || p1.data != p2.data) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
