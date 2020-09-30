package stack_queue;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private T[] data;
    private int size;

    public Stack(int capacity) {
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void push(T item) {
        if (size < data.length) {
            data[size++] = item;
        }
    }

    public void pop() {
        if (!isEmpty()) {
            size--;
        }
    }

    public T getFirst() {
        if (!isEmpty()) {
            return data[size-1];
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
            private int i = size - 1;

            @Override
            public boolean hasNext() {
                return i >= 0;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    return data[i--];
                } else {
                    return null;
                }
            }
        };
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<String>(2);
        s.push("A");
        s.push("B");
        System.out.println("Stack: " + s);
        s.push("C");
        System.out.println("Stack: " + s);

        s.pop();
        System.out.println("Stack: " + s);
        s.pop();
        System.out.println("Stack: " + s);
        s.pop();
        System.out.println("Stack: " + s);

        s.push("D");
        System.out.println("Stack: " + s);
    }
}
