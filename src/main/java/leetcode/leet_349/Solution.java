package leetcode.leet_349;

import org.junit.Test;

import java.util.*;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                map.put(nums1[i], 1);
            } else if (map.get(nums1[i]) == 1) {
                continue;
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                hashSet.add(nums2[i]);
            }


        }
        int[] res = new int[hashSet.size()];
        Iterator<Integer> it = hashSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            res[i++] = it.next();
        }
        return res;
    }


    @Test
    public void practice() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = intersection(nums1, nums2);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

}
