package stack_queue;

import java.util.Iterator;

public class LinkedQueue<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    static class Node<T> {
        T data;
        Node<T> next;

        public Node(T d, Node<T> n) {
            data = d;
            next = n;
        }
    }

    public LinkedQueue() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        Node<T> newNode = new Node<T>(item, null);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }


    public void dequeue() {
        if (!isEmpty()) {
            head = head.next;
            size--;
            if (isEmpty()) tail = null;
        }
    }

    public T getFirst() {
        if (!isEmpty()){
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

    public Iterator<T> iterator()  {
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
        LinkedQueue<String> q = new LinkedQueue<String>();
        q.enqueue("A");
        q.enqueue("B");
        q.enqueue("C");
        System.out.println("Queue: " + q);

        q.dequeue();
        System.out.println("Queue: " + q);
        q.dequeue();
        System.out.println("Queue: " + q);

        q.enqueue("D");
        System.out.println("Queue: " + q);
    }
}
