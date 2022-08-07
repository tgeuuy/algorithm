package leetcode.leet_1207;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {


    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashmap.containsKey(arr[i])) {
                int values = hashmap.get(arr[i]);
                hashmap.remove(arr[i]);
                values++;
                hashmap.put(arr[i], values);
            } else {
                hashmap.put(arr[i], 1);
            }

        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> map : hashmap.entrySet()) {
            list.add(map.getValue());

        }
        int[] arrres = new int[hashmap.size()];
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            arrres[i] = list.get(i);
        }
        Arrays.sort(arrres);
        for (int i = 1; i < arrres.length; i++) {
            if (arrres[i] == arrres[i - 1]) return false;
        }
        return true;

    }

    @Test
    public void practicce() {
        int[] array = {1, 2};
        boolean res = uniqueOccurrences(array);
        System.out.println("res=" + res);
    }
}
