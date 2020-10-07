package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
    public static void main(String[] args) {
        MyTextEditor te = new MyTextEditor();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int query = sc.nextInt();

            switch (query) {
                case 1:
                    te.append(sc.next());
                    break;
                case 2:
                    te.delete(sc.nextInt());
                    break;
                case 3:
                    System.out.println(te.get(sc.nextInt()));
                    break;
                case 4:
                    te.undo();
                    break;
            }
        }
    }

    public static class MyTextEditor {
        Stack<String> history = new Stack<>();
        String text = "";

        public void append(String str) {
            history.push(text);
            text = text.concat(str);
        }

        public void delete(int k) {
            history.push(text);
            text = text.substring(0, text.length() - k);
        }

        public char get(int k) {
            return text.charAt(k - 1);
        }

        public void undo() {
            text = history.pop();
        }
    }
}
