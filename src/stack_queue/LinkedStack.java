package stack_queue;

import java.util.Iterator;

public class LinkedStack<T> implements Iterable<T> {
    private Node<T> head;
    private int size;

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T d, Node<T> n) {
            data = d;
            next = n;
        }
    }

    public LinkedStack() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        head = new Node<T>(item, head);
        size++;
    }

    public void pop() {
        if (!isEmpty()) {
            head = head.next;
            size--;
        }
    }

    public T getFirst() {
        if (!isEmpty()) {
            return head.data;
        } else {
            return null;
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        for (T item : this) {
            s.append(item);
            s.append(' ');
        }
        return s.toString();
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T item = current.data;
                    current = current.next;
                    return item;
                } else {
                    return null;
                }
            }
        };
    }

    public static void main(String[] args) {
        LinkedStack<String> s = new LinkedStack<String>();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println("Stack: " + s);

        s.pop();
        System.out.println("Stack: " + s);
        s.pop();
        System.out.println("Stack: " + s);

        s.push("D");
        System.out.println("Stack: " + s);
    }
}
