package stack_queue;

import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    switch (x) {
                        case ')' :
                            if (stack.pop() != '(') {
                                return "NO";
                            }
                            break;
                        case '}' :
                            if (stack.pop() != '{') {
                                return "NO";
                            }
                            break;
                        case ']' :
                            if (stack.pop() != '[') {
                                return "NO";
                            }
                            break;
                    }
                }
            }
        }

        return (stack.isEmpty() ? "YES" : "NO");
    }
}
