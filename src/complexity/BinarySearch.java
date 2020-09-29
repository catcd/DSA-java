package complexity;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return -1;
    }

    public static int rBinarySearch(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return rBinarySearch(arr, l, mid - 1, x);
            } else {
                return rBinarySearch(arr, mid + 1, r, x);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] randArray = new Random().ints(0, 100).limit(n).toArray();
        Arrays.sort(randArray);
        System.out.println("randArray = " + Arrays.toString(randArray));

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int input = sc.nextInt();
            int result = binarySearch(randArray, input);
            if (result == -1) {
                System.out.println("404 NOT FOUND");
            } else {
                System.out.println("Element found at index " + result);
            }
        }
    }
}
