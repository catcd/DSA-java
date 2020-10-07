package stack_queue;

import java.util.List;
import java.util.Stack;

public class EqualStacks {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        int sum1 = 0, sum2 = 0, sum3 = 0;
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        for (int i = h1.size() - 1; i >= 0; i--) {
            s1.push(h1.get(i));
            sum1 += h1.get(i);
        }
        for (int i = h2.size() - 1; i >= 0; i--) {
            s2.push(h2.get(i));
            sum2 += h2.get(i);
        }
        for (int i = h3.size() - 1; i >= 0; i--) {
            s3.push(h3.get(i));
            sum3 += h3.get(i);
        }

        while (!s1.empty() && !s2.empty() && !s3.empty()) {
            int min = Math.min(sum1, Math.min(sum2, sum3));

            if (sum1 > min) {
                sum1 -= s1.pop();
            }
            if (sum2 > min) {
                sum2 -= s2.pop();
            }
            if (sum3 > min) {
                sum3 -= s3.pop();
            }

            if (sum1 == sum2 && sum2 == sum3) {
                return sum1;
            }
        }

        return 0;
    }
}
