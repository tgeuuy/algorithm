package leetcode.leet_347;

import java.util.*;

public class Solution {


    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] res = topKFrequent(arr, k);
        System.out.println(Arrays.toString(res));

    }


    public static int[] topKFrequent(int[] arr, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for (int v : arr) {
            map.put(v, map.getOrDefault(v, 0) + 1);
        }

        System.out.println(map.toString());
        PriorityQueue<int[]> q = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int val = entry.getValue();

            if (q.size() ==k){
                if (q.peek()[1] < val) {
                    q.poll();
                    q.offer(new int[]{key, val});
                }
            }else {
                q.offer(new int[]{key, val});
            }

        }
        for (int i = 0; i < k; i++) {
            res[i]=q.poll()[0];
        }
        return res;

    }
}
