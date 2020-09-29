package linked_list;

import java.util.Objects;

public class FindMergePoint {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode p1 = head1, p2 = head2;

        while (p1 != p2) {
            if (p1.next == null){
                p1 = head2;
            } else {
                p1 = p1.next;
            }

            if (p2.next == null){
                p2 = head1;
            } else {
                p2 = p2.next;
            }
            // java 9
            // p2 = Objects.requireNonNullElse(p2.next, head1);
        }
        return p2.data;
    }
}
