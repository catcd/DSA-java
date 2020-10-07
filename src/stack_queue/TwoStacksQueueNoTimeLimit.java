package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class TwoStacksQueueNoTimeLimit {
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
//        T front;

        public void enqueue(T num) {
//            if (stack1.empty()) {
//                front = num;
//            }
            stack1.push(num);
        }

        public void dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            stack2.pop();
        }

        public T peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
//            // REDUCE PEEK
//            if (!stack2.isEmpty()) {
//                return stack2.peek();
//            }
//            return front;
        }
    }
}
