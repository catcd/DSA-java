package complexity;

// 1 2 5 3 7 8 6 4
public class NewYearChaos {
    static void minimumBribes(int[] q) {
        int swaps = 0, min = q.length;
        for (int i = q.length - 1; i >= 0; i--){
            if (q[i]-1 - i > 2){
                System.out.println("Too chaotic");
                return;
            }
            if (q[i]-1 > i){
                swaps += q[i]-1 - i;
            } else {
                if (min > q[i]){
                    min = q[i];
                } else if (q[i] != min){
                    swaps++;
                }
            }
        }

        System.out.println(swaps);
    }
}
