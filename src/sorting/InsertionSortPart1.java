package sorting;

import java.util.Arrays;

public class InsertionSortPart1 {
    static void insertionSort1(int n, int[] arr) {
        int last = arr[n - 1], i = n - 2;
        while (i >= 0 && last < arr[i]) {
            arr[i + 1] = arr[i--];
            printArray(arr);
        }
        arr[i + 1] = last;
        printArray(arr);
    }

    static void printArray(int[] arr) {
        System.out.println(String.join(
                " ",
                Arrays.stream(arr).mapToObj(String::valueOf).toArray(String[]::new)
        ));
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 0};
        insertionSort1(8, arr);
    }
}
