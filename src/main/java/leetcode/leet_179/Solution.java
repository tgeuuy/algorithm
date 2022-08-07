package leetcode.leet_179;

import java.util.PriorityQueue;

public class Solution {

    /**
     * 输入：nums = [3,30,34,5,9]
     * 输出："9534330"
     *
     * @param args
     */

    public static void main(String[] args) {
        int[] nums = {3, 30, 34, 5, 9};
        String res = largestNumber(nums);
        System.out.println(res);
    }
/*
    public static String largestNumber(int[] nums) {
        int len = nums.length;
        Integer[] numInt = new Integer[len];
        for (int i = 0; i < len; i++) numInt[i] = nums[i];
        Arrays.sort(numInt, (x, y) -> {
            long sx = 10, sy = 10;
            while (sx <= x) sx *= 10;
            while (sy <= y) sy *= 10;
            return (int) (-sy * x - y + sx * y + x);
        });
        if (numInt[0] == 0) return "0";
        StringBuilder ret = new StringBuilder();
        for (int n : numInt) ret.append(n);
        return ret.toString();

    }*/
    public static String largestNumber(int[] nums) {
        PriorityQueue<String> heap = new PriorityQueue<>((x, y) -> (y + x).compareTo(x + y));
        for(int x: nums) heap.offer(String.valueOf(x));
        StringBuilder res = new StringBuilder();
        while(heap.size() > 0) res.append(heap.poll());
        if(res.charAt(0) == '0') return "0";
        return res.toString();
    }
}
