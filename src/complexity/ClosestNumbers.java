package complexity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClosestNumbers {
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);

        List<Integer> result = new ArrayList<Integer>();
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length-1; i++) {
            int diff = arr[i+1] - arr[i];
            if (diff == minDiff){
                result.add(arr[i]);
                result.add(arr[i+1]);
            } else if (diff < minDiff){
                minDiff = diff;
                result.clear();
                result.add(arr[i]);
                result.add(arr[i+1]);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }



    static int[] closestNumbers2(int[] arr) {
        Arrays.sort(arr);
        int[] tmp = new int[arr.length * 2];
        int c = 0;
        int val = arr[1] - arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] < val) val = arr[i+1] - arr[i];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i+1] - arr[i] == val) {
                tmp[c] = arr[i];
                tmp[c+1] = arr[i+1];
                c += 2;

            }
        }
        int[] ans = Arrays.copyOf(tmp, c);
        return ans;
    }
}
