package complexity;

import java.util.HashSet;
import java.util.Set;

public class Pairs {
    static int pairs(int k, int[] arr) {
        int res = 0;
        Set<Integer> s = new HashSet<Integer>(){{
            for(int i : arr) add(i);
        }};

        for (int i : s) {
            if(s.contains(i+k)) {
                res++;
            }
        }

        return res;
    }
}
