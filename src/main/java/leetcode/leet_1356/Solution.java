package leetcode.leet_1356;

import org.junit.Test;

import java.util.*;

public class Solution {


    public int get(int x) {
        int res = 0;
        while (x != 0) {
            res += x % 2;
            x /= 2;
        }
        return res;
    }

    public int[] sortByBits(int[] arr) {
        int[] bit = new int[10001];
        int[] res = new int[arr.length];
        List<Integer> list = new ArrayList<>();
        for (int x : arr) {
            list.add(x);
            System.out.println(get(x) + "aaaaa");
            bit[x] = get(x);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer s1, Integer s2) {
                if (bit[s1] != bit[s2]) {
                    return bit[s1] - bit[s2];
                } else
                    return s1 - s2;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    @Test
    public void practice() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] res = sortByBits(arr);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
