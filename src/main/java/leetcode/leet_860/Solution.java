package leetcode.leet_860;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        Map hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < bills.length; i++) {
            int bill = bills[i];
            if (!hashMap.containsKey(bill)) {
                hashMap.put(bill, 1);
            } else {
                int c = (int) hashMap.get(bill);
//                c += 1;
                hashMap.put(bill, c++);
            }





            if (bill == 10) {
                if (hashMap.containsKey(5) &&  (int)hashMap.get(5) >= 1) {
                    Integer c = (int) hashMap.get(5);
//                    c -= 1;
                    hashMap.put(5, --c);
                } else {
                    return false;
                }
            }
            if (bill == 20) {
                if (hashMap.containsKey(5) && hashMap.containsKey(10) && (int) hashMap.get(5) >= 1 && (int) hashMap.get(10) >= 1) {
                    int c1 = (int) hashMap.get(5);
//                    c1 -= 1;
                    hashMap.put(5, --c1);
                    int c2 = (int) hashMap.get(10);
//                    c2 -= 1;
                    hashMap.put(10, --c2);
                    continue;
                } else if (hashMap.containsKey(5) && (int) hashMap.get(5) >= 3) {
                    int c = (int) hashMap.get(5);
                    c -= 3;
                    hashMap.put(5, c);
                    continue;
                } else {
                    return false;
                }
            }
//            Set<Integer> keys = hashMap.keySet();
//            for (Integer key : keys) {
//                System.out.println("[" + key + ":" + hashMap.get(key) + "]");
//            }
//            System.out.println();

        }

        return true;
    }

    @Test
    public void practice() {
        boolean res = lemonadeChange(new int[]{5, 5, 5, 10, 5, 5, 10, 20, 20, 20});

        System.out.println("res=" + res);
    }
}
