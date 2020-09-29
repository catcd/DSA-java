package complexity;

import java.util.Arrays;

public class ThreeSumN2 {
    public static void printAll(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int l, r;

        for (int i = 0; i < n - 2; i++) {
            l = i + 1; // index of the first element in the remaining elements
            r = n - 1; // index of the last element
            while (l < r) {
                if (a[i] + a[l] + a[r] == 0) {
                    System.out.println(a[i] + ", " + a[l] + ", " + a[r]);
                    l++;
                    r--;
                } else if (a[i] + a[l] + a[r] < 0) {
                    l++;
                } else { // A[i] + A[l] + A[r] > 0
                    r--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1, -1, 0, 6, 5, -11, 8, 10, 2, -10};
        printAll(a);
    }
}

