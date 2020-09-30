package stack_queue;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    private T[] data;
    private int size;

    public Queue(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void enqueue(T item) {
        if (size < data.length) {
            data[size++] = item;
        }
    }

    public void dequeue() {
        if (!isEmpty()) {
            size--;
            if (size >= 0) {
                System.arraycopy(data, 1, data, 0, size);
            }
        }
    }

    public T getFirst() {
        if (!isEmpty()) {
            return data[0];
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
            private int i = 0;

            @Override
            public boolean hasNext() {
                return i <= size - 1;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return data[i++];
                } else {
                    return null;
                }
            }
        };
    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<String>(2);
        q.enqueue("A");
        q.enqueue("B");
        System.out.println("Queue: " + q);
        q.enqueue("C");
        System.out.println("Queue: " + q);

        q.dequeue();
        System.out.println("Queue: " + q);
        q.dequeue();
        System.out.println("Queue: " + q);
        q.dequeue();
        System.out.println("Queue: " + q);

        q.enqueue("D");
        System.out.println("Queue: " + q);
    }
}
