package complexity;

import java.util.List;

public class SherlockAndArray {
    static String balancedSums(List<Integer> arr) {
        int summy = arr.stream().mapToInt(Integer::intValue).sum();
        int lefty = 0;
        for (int x: arr){
            summy -= x;
            if(lefty == summy) {
                return "YES";
            }
            lefty += x;
        }
        return "NO";
    }

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 1, 4, 1, 1);
        List<Integer> list2 = List.of(2, 1, 0, 0);
        List<Integer> list3 = List.of(1, 2, 3, 3);

        System.out.println(list1 + balancedSums(list1));
        System.out.println(list2 + balancedSums(list2));
        System.out.println(list3 + balancedSums(list3));
    }
}
