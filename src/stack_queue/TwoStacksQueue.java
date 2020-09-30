package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class TwoStacksQueue {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();

            switch (query) {
                case 1:
                    queue.enqueue(sc.nextInt());
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println(queue.peek());
                    break;
            }
        }
    }

    public static class MyQueue<T> {
        Stack<T> stack1 = new Stack<>();
        Stack<T> stack2 = new Stack<>();

        public void enqueue(T num) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            stack1.push(num);
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
        }

        public void dequeue() {
            stack1.pop();
        }

        public T peek() {
            return stack1.peek();
        }
    }
}
