package linked_list;

public class LinkedList<T> {
    Node<T> head;

    public LinkedList() {
        head = null;
    }

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T d, Node<T> n) {
            data = d;
            next = n;
        }
    }

    public void print() {
        Node<T> p = head;
        System.out.print("linked list: head => ");
        while (p != null) {
            System.out.print(p.data + " => ");
            p = p.next;
        }
        System.out.println("null");
    }

    public Node<T> addFirst(T data) {
        head = new Node<T>(data, head);
        return head;
    }

    public void addFirst2(T data) {
        head = new Node<T>(data, head);
    }

    public LinkedList<T> addLast(T data) {
        Node<T> newNode = new Node<T>(data, null);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = newNode;
        }

        return this;
    }

    public LinkedList<T> remove(T key) {
        if (head.data == key)  {
            head = head.next;
        } else {
            Node<T> prev = head;
            while (prev.next.data != key) {
                prev = prev.next;
            }
            prev.next = prev.next.next;
        }

        return this;
    }

    public static void main(String[] args) {
        LinkedList<String> sList = new LinkedList<>();
        sList.print();

        Node<String> sth = sList.addFirst("A");
        sList.print();

        sList.addFirst2("B");
        sList.print();

        sList.addLast("C");
        sList.addLast("D");
        sList.print();

        sList.addLast("E").addLast("F");
        sList.print();

        sList.remove("F").addLast("G");
        sList.print();

        sList.remove("F");
        sList.print();
    }
}
