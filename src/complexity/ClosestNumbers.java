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
}
