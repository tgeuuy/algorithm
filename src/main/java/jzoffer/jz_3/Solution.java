package jzoffer.jz_3;

import org.junit.Test;

import java.util.*;

public class Solution {

    @Test
    public void test() {
        System.out.println(duplicateInArray(new int[]{2, 3, 1, 0, 2, 5, 3}));
    }
  /*  public int duplicateInArray(int[] nums) {
        int n=nums.length-1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int v:nums){
            if(n<0||v>n) return -1;
            map.put(v,map.getOrDefault(v,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) return entry.getKey();
        }
        return -1;
    }*/

    public int duplicateInArray(int[] nums) {
        int res = -1;
        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
            if (!set.add(v)) {
                res = v;
                break;
            }
        }
        return res;
    }
}
