package ms_17_10;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    @Test
    public void test() {
        System.out.println("res=" + majorityElement(new int[]{1,2,5,9,5,9,5,5,5}));
    }

    public int majorityElement(int[] nums) {
        int le = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int v : nums) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > (le / 2)) return entry.getKey();
//            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        return -1;

    }
}
