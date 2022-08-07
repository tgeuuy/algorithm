package niuke.jiandan;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class NC_61 {


    @Test
    public void practice() {
        int[] numbers = new int[]{3, 2, 4, 9};
        int target = 11;
        int[] res = twoSum(numbers, target);
        for (int v :
                res) {
            System.out.print(v + " ");
        }
    }

    public int[] twoSum(int[] numbers, int target) {
        // write code here
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int b = target - numbers[i];
            if (hashmap.get(b) != null) {
                return new int[]{hashmap.get(b) + 1, i + 1};
            }
            hashmap.put(numbers[i], i);
        }
//        for (Map.Entry<Integer, Integer> e : hashmap.entrySet()) {
//            int a = e.getKey();
//            int b = target - a;
//            if (hashmap.containsKey(b)) {
//                return new int[]{hashmap.get(a) + 1, hashmap.get(b) + 1};
//            }
//        }
        return null;
    }
}
